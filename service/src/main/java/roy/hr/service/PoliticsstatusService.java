package roy.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roy.hr.Politicsstatus;
import roy.hr.mapper.PoliticsstatusMapper;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 19:36
 * @description:
 */
@Service
public class PoliticsstatusService {
    @Autowired
    PoliticsstatusMapper politicsstatusMapper;

    public List<Politicsstatus> getAllPoliticssatus(){
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
