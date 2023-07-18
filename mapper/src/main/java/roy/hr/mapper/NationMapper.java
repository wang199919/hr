package roy.hr.mapper;

import roy.hr.Nation;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 12:31
 * @description:
 */
public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);

    List<Nation>  getAllNations();
}