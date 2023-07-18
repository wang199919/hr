package roy.hr.mapper;

import org.apache.ibatis.annotations.Param;
import roy.hr.Joblevel;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 12:38
 * @description:
 */
public interface JoblevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Joblevel record);

    int insertSelective(Joblevel record);

    Joblevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joblevel record);

    int updateByPrimaryKey(Joblevel record);

    List<Joblevel> getAllJobLevel();

    Integer deleteJobLevelByIds(@Param("ids") Integer [] ids);
}