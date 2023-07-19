package roy.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roy.hr.Department;
import roy.hr.mapper.DepartmentMapper;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 23:59
 * @description: 部门管理
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getAllDepartment(){
        return  departmentMapper.getAllDepartmentsByParntId(-1);
    }

    public  void addDep(Department department){
        department.setEnabled(true);

        departmentMapper.addDep(department);
    }

    public  void deleteDepByid(Department department){
departmentMapper.deleteDepById(department);
    }

    public  List<Department> getAllDepartmentwithOut(){
        return departmentMapper.getAllDepartmentsWithOutChildren();
    }
}
