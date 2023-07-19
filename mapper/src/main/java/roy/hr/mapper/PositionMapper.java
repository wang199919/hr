package roy.hr.mapper;

import org.apache.ibatis.annotations.Param;
import roy.hr.Position;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 15:42
 * @description:
 */
public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> getAllPositions();

    Integer deletePositionsByIds(@Param("ids") Integer[] ids);
}