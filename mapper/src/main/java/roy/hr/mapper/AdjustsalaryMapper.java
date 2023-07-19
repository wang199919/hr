package roy.hr.mapper;

import roy.hr.Adjustsalary;

/**
 * @author: roy
 * @date: 2023/7/19 19:24
 * @description:
 */
public interface AdjustsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adjustsalary record);

    int insertSelective(Adjustsalary record);

    Adjustsalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adjustsalary record);

    int updateByPrimaryKey(Adjustsalary record);
}