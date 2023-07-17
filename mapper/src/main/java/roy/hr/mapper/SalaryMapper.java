package roy.hr.mapper;

import roy.hr.Salary;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/17 23:48
 * @description:
 */
public interface SalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    List<Salary> getAllSalaries();
}