package roy.hr.controller.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import roy.hr.Joblevel;
import roy.hr.RespBean;
import roy.hr.service.JobLevelService;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/18 14:38
 * @description:
 */
@RestController
@RequestMapping("/basic/joblevel")
public class JobLevelController {
    @Autowired
    private JobLevelService jobLevelServicel;




    @GetMapping("/")
    public List<Joblevel> getAllJoblevel(){

        return jobLevelServicel.getAllJobLevel();

    }
    @PostMapping("/add")
    public RespBean addJobLevel(Joblevel joblevel){
        if(jobLevelServicel.addJobLevel(joblevel)==1){
            return RespBean.success(200,"添加成功");
        }
        return  RespBean.failure(400,"添加失败");
    }
    @GetMapping("/deleteJobLevel/{id}")
    public  RespBean deleteJobLevelById(@PathVariable Integer id){
        Joblevel joblevel= jobLevelServicel.selectJobLevelById(id);
        System.out.println(id);
        if(jobLevelServicel.selectJobLevelById(id)==null)return  RespBean.failure(400,"删除失败");
        jobLevelServicel.deleteJobLevelByid(id);
        return RespBean.success(200,"删除成功",joblevel);
    }
    @DeleteMapping("/deleteJoblevelByids")
    public RespBean deleteJobLevelsByIds(Integer[] ids) {
        if (jobLevelServicel.deleteJobLevelByIds(ids) == ids.length) {
            return RespBean.success(200,"删除成功!");
        }
        return RespBean.failure(400,"删除失败!");
    }
    @GetMapping("/{id}")
    public  RespBean a(@PathVariable Integer id){
       Joblevel joblevel= jobLevelServicel.selectJobLevelById(id);
    return RespBean.success(200,"操作成功",joblevel);
    }
    @PutMapping("/")
    public RespBean updateJobLevelById(@RequestBody Joblevel jobLevel) {
        if (jobLevelServicel.updateJobLevel(jobLevel) == 1) {
            return RespBean.success(200,"更新成功!");
        }
        return RespBean.failure(400,"更新失败!");
    }

}