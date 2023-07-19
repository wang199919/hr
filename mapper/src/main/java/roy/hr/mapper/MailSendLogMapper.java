package roy.hr.mapper;

import org.apache.ibatis.annotations.Param;
import roy.hr.MailSendLog;

import java.util.Date;
import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 22:32
 * @description:
 */
public interface MailSendLogMapper {
    int insert(MailSendLog record);

    int insertSelective(MailSendLog record);


    List<MailSendLog> getMailSendLogsByStatus();

    Integer updateMailSendLogStatus(@Param("msgId") String msgId, @Param("status") Integer status);

    Integer updateCount(@Param("id") String id ,@Param("date") Date date);
}