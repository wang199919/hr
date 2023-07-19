package roy.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roy.hr.Nation;
import roy.hr.mapper.NationMapper;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 14:07
 * @description:
 */
@Service
public class NationService {

    @Autowired
    NationMapper nationMapper;


    public List<Nation> getAllNation(){
        return  nationMapper.getAllNations();
    }
}
