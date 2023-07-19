package roy.hr.mapper;

import roy.hr.Appraise;

/**
 * @author: roy
 * @date: 2023/7/19 19:24
 * @description:
 */
public interface AppraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appraise record);

    int insertSelective(Appraise record);

    Appraise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Appraise record);

    int updateByPrimaryKey(Appraise record);
}