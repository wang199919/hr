package roy.hr.mapper;

import roy.hr.Employeeec;

/**
 * @author: roy
 * @date: 2023/7/19 23:00
 * @description:
 */
public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);
}