package roy.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roy.hr.Salary;
import roy.hr.mapper.SalaryMapper;

import java.util.Date;
import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 0:01
 * @description: 为什么不使用接口进行编程 因为接口编程会使@Service不起作用,进尔导致编程出现bean无法找到的错误
 *
 * 生成的数据库方法里面 如果以Selective结尾的表示 不能为null数据;
 */
@Service
public class SalaryService {
    @Autowired
    SalaryMapper salaryMapper;

    public List<Salary> getAllSalaries(){
        return  salaryMapper.getAllSalaries();
    }

    public  Integer addSalary(Salary salary){
        salary.setCreatedate(new Date());
        return  salaryMapper.insertSelective(salary);
    }


    public  Integer deleteSalaryByID(Integer id){
        return salaryMapper.deleteByPrimaryKey(id);
    }

    public  Integer updateSalary(Salary salary){
        return  salaryMapper.updateByPrimaryKeySelective(salary);
    }
}
