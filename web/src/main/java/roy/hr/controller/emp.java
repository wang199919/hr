package roy.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import roy.hr.*;
import roy.hr.service.*;

import java.util.Date;
import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/21 12:47
 * @description:
 */
@RestController
@RequestMapping("/employee/basic")
public class emp {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    NationService nationService;
    @Autowired
    PoliticsstatusService politicsstatusService;
    @Autowired
    JobLevelService jobLevelService;
    @Autowired
    PositionService positionService;
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/")
    public RespPageBean getEmployeeByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer size, Employee employee, Date[] beginDateScope){
     return   employeeService.getEmployeeByPage(page,size,employee,beginDateScope);
    }
    @PostMapping("/add")
    public RespBean addEmployee(@RequestBody  Employee employee){
        if(employeeService.addEmp(employee)==1)return RespBean.success(200,"添加成功");
        return RespBean.failure(400,"添加失败");
    }
    @DeleteMapping("/deleteById/{id}")
    public  RespBean deleteById(@PathVariable Integer id){
        if(employeeService.deleteEmpByEid(id)==1)return  RespBean.success(200,"删除失败");
        return  RespBean.failure(400,"删除成功");
    }
    @PutMapping("/update")
    public  RespBean update(@RequestBody Employee employee){
        if(employeeService.updateEmp(employee)==1)return RespBean.success(200,"修改成功");
        return RespBean.failure(400,"修改失败");
    }
    @GetMapping("/nations")
    public List<Nation> getAllNation(){
        return nationService.getAllNation();
    }
    @GetMapping("/joblevels")
    public  List<Joblevel> getAllJobLevel(){
        return jobLevelService.getAllJobLevel();
    }
    @GetMapping("/politicsstatus")
    public  List<Politicsstatus> getAllpoliticssatus(){
        return politicsstatusService.getAllPoliticssatus();
    }
    @GetMapping("/positions")
    public List<Position> getAllPositions() {
        return positionService.getAllPosition();
    }

    @GetMapping("/maxWorkID")
    public RespBean maxWorkID() {
        Object o=String.format("%08d", employeeService.maxWorkID() + 1);

        return RespBean.success(200,"成功",o);
    }

    @GetMapping("/deps")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartment();
    }




}
