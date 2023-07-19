package roy.hr.mapper;

import roy.hr.Employeeremove;

/**
 * @author: roy
 * @date: 2023/7/19 23:00
 * @description:
 */
public interface EmployeeremoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeremove record);

    int insertSelective(Employeeremove record);

    Employeeremove selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeremove record);

    int updateByPrimaryKey(Employeeremove record);
}