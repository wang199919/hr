package roy.hr.mapper;

import roy.hr.Empsalary;

/**
 * @author: roy
 * @date: 2023/7/19 23:00
 * @description:
 */
public interface EmpsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Empsalary record);

    int insertSelective(Empsalary record);

    Empsalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Empsalary record);

    int updateByPrimaryKey(Empsalary record);
}