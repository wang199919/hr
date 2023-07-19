package roy.hr.mapper;

import roy.hr.Oplog;

/**
 * @author: roy
 * @date: 2023/7/19 19:26
 * @description:
 */
public interface OplogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oplog record);

    int insertSelective(Oplog record);

    Oplog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Oplog record);

    int updateByPrimaryKey(Oplog record);
}