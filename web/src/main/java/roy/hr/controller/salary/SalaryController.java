package roy.hr.controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import roy.hr.RespBean;
import roy.hr.Salary;
import roy.hr.service.SalaryService;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 0:40
 * @description:
 */
@RestController
@RequestMapping("salary")
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @GetMapping("/")
    public List<Salary> getAllSalaries(){
        return  salaryService.getAllSalaries();
    }

    @PostMapping("/")
    public RespBean addSalary(@RequestBody Salary salary){
        if(salaryService.addSalary(salary)==1)return RespBean.success(200,"添加成功");
        return RespBean.failure(400,"添加失败");
    }

    @DeleteMapping("/{id}")
    public  RespBean deleteSalary(@PathVariable  Integer id){
        if(salaryService.deleteSalaryByID(id)==1)return  RespBean.success(200,"删除成功");
        return RespBean.failure(400,"删除失败");
    }

    @PutMapping
    public  RespBean updateSalary(@RequestBody Salary salary){
        if(salaryService.updateSalary(salary)==1)return  RespBean.success(200,"修改成功");
        return RespBean.failure(400,"修改失败");
    }
}
