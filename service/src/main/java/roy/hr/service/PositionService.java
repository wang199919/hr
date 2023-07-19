package roy.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import roy.hr.Position;
import roy.hr.mapper.PositionMapper;

import java.util.Date;
import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 13:30
 * @description:
 */
@Service
public class PositionService {
    @Autowired
    private PositionMapper positionMapper;

    public List<Position> getAllPosition(){
        return positionMapper.getAllPositions();
    }

    public  Integer addPositaion(Position position){
        position.setEnabled(true);
        position.setCreatedate(new Date());
        return positionMapper.insertSelective(position);
    }

    public  Integer updatePosition(Position position){
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public Integer deletePositionById(Integer id){
        return  positionMapper.deleteByPrimaryKey(id);
    }

    public  Integer deletePositionByIds(Integer [] ids){
        return positionMapper.deletePositionsByIds(ids);
    }



}
