package roy.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import roy.hr.Joblevel;
import roy.hr.mapper.JoblevelMapper;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 14:26
 * @description:
 */
@Service
public class JobLevelService {
    @Autowired
    private JoblevelMapper joblevelMapper;

    public List<Joblevel> getAllJobLevel(){
        return joblevelMapper.getAllJobLevel();
    }

    public  Integer addJobLevel(Joblevel joblevel){
        return  joblevelMapper.insertSelective(joblevel);
    }

    public  Integer deleteJobLevelByid(Integer id){
        return joblevelMapper.deleteByPrimaryKey(id);
    }

    public  Integer deleteJobLevelByIds(Integer [] ids){
        return joblevelMapper.deleteJobLevelByIds(ids);
    }

    public  Integer updateJobLevel(Joblevel joblevel){
        return joblevelMapper.updateByPrimaryKey(joblevel);
    }

    public  Joblevel selectJobLevelById(Integer id){
        return joblevelMapper.selectByPrimaryKey(id);
    }
}
