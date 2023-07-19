package roy.hr.mapper;

import roy.hr.Msgcontent;

/**
 * @author: roy
 * @date: 2023/7/19 19:34
 * @description:
 */
public interface MsgcontentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Msgcontent record);

    int insertSelective(Msgcontent record);

    Msgcontent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msgcontent record);

    int updateByPrimaryKey(Msgcontent record);
}