package roy.hr.mapper;

import org.apache.ibatis.annotations.Param;import roy.hr.Employee;import java.util.Date;import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 23:00
 * @description:
 */
public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("emp") Employee employee, @Param("beginDateScope") Date[] dates);

    Long getTotal(@Param("emp") Employee employee, @Param("beginDataScope") Date[] beginDateScope);

    Integer maxWorkID();

    Integer addEmps(@Param("emps") List<Employee> list);

    List<Employee> getEmployeeByPageWithSalary(@Param("page") Integer page, @Param("size") Integer size);

    Integer updateEmployeeSalaryById(@Param("eid") Integer eid, @Param("sid") Integer sid);

    Employee getEmployeeById(Integer id);



}