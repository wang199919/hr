package roy.hr.task;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import roy.hr.Employee;
import roy.hr.MailConstants;
import roy.hr.MailSendLog;
import roy.hr.service.EmployeeService;
import roy.hr.service.MailSendLogService;

import java.util.Date;
import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/21 16:16`
 * @description:
 */
@Component
public class MailSendTank {
    @Autowired
    MailSendLogService mailSendLogService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Scheduled(cron = "0/10 * * * * ?")
    public  void  mailResendTask(){
        List<MailSendLog> logs=mailSendLogService.getMLSByStatus();
        if(logs==null||logs.size()==0){
            return;
        }
        logs.forEach(mailSendLog->{
            if(mailSendLog.getCount()>3)mailSendLogService.updateMAilSendLongStatus(mailSendLog.getMsgid(),2);
            else {
                mailSendLogService.updatCounte(mailSendLog.getMsgid(),new Date());
                Employee employee=employeeService.getEmployeeById(mailSendLog.getEmpid());
            rabbitTemplate.convertAndSend(MailConstants.MAIL_EXCHANGE_NAME,MailConstants.MAIL_ROUTING_KEY_NAME,employee,new CorrelationData(mailSendLog.getMsgid()));
            }
        });
    }
}
