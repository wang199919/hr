package roy.hr.mapper;

import roy.hr.Department;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 15:42
 * @description:
 */
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);


    int updateByPrimaryKey(Department record);

    List<Department> getAllDepartmentsByParntId(Integer id);

    void addDep(Department dep);

    void deleteDepById(Department dep);

    List<Department> getAllDepartmentsWithOutChildren();


}