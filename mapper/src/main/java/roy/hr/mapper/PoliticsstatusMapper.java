package roy.hr.mapper;

import roy.hr.Politicsstatus;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 19:29
 * @description:
 */
public interface PoliticsstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Politicsstatus record);

    int insertSelective(Politicsstatus record);

    Politicsstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Politicsstatus record);

    int updateByPrimaryKey(Politicsstatus record);

    List<Politicsstatus> getAllPoliticsstatus();
}