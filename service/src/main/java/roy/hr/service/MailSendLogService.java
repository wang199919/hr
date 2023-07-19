package roy.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roy.hr.MailSendLog;
import roy.hr.mapper.MailSendLogMapper;

import java.util.Date;
import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 22:31
 * @description:
 */
@Service
public class MailSendLogService {
@Autowired
    MailSendLogMapper mapper;
public  Integer updateMAilSendLongStatus(String mid,Integer status){
    return mapper.updateMailSendLogStatus(mid,status);
}

public Integer addMLS(MailSendLog mailSendLog){
    return mapper.insertSelective(mailSendLog);
}

public Integer updatCounte(String mid, Date date){
    return mapper.updateCount(mid,date);
}

public List<MailSendLog> getMLSByStatus(){
    return mapper.getMailSendLogsByStatus();
}
}
