package roy.hr.controller.basic;

import com.alibaba.druid.support.calcite.DDLColumn;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import roy.hr.Department;
import roy.hr.RespBean;
import roy.hr.service.DepartmentService;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 0:21
 * @description:
 */
@RestController
@RequestMapping("/basic/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepartment(){
        return  departmentService.getAllDepartment();
    }

    @PostMapping("/add")
    public RespBean addDepartMent(@RequestBody Department department){
        departmentService.addDep(department);
        if (department.getResult() == 1) {
            return RespBean.success(200,"添加成功", department);
        }
        return RespBean.failure(400,"添加失败");
    }

    @DeleteMapping("/delete/{id}")
    public  RespBean deleteDepById(@PathVariable Integer id){
        Department department=new Department();
        department.setId(id);
        departmentService.deleteDepByid(department);
        if(department.getResult()==-2){
            return  RespBean.failure(400,"该部门下面有部门,删除失败");
        }else if(department.getResult()==-1){
            return RespBean.failure(400,":有员工删除失败");
        }else  if(department.getResult()==1){
            return  RespBean.success(200,"删除成功");
        }
        return RespBean.failure(400,"删除失败");
    }
}
