package roy.hr.mapper;

import roy.hr.Sysmsg;

/**
 * @author: roy
 * @date: 2023/7/19 19:25
 * @description:
 */
public interface SysmsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysmsg record);

    int insertSelective(Sysmsg record);

    Sysmsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysmsg record);

    int updateByPrimaryKey(Sysmsg record);
}