package roy.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import roy.hr.Hr;
import roy.hr.RespBean;
import roy.hr.Role;
import roy.hr.service.RoleService;
import roy.hr.service.impl.HrServiceImpl;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/17 17:22
 * @description:
 */
@RestController
@RequestMapping("/hr")
public class HrController {

    @Autowired
    HrServiceImpl hrService;
    @Autowired
    RoleService roleService;

    @GetMapping("/")
    public List<Hr> getAllHrs(String keywords){
        return  hrService.getAllHrs(keywords);
    }

    @PutMapping("/update")
    public RespBean updateHr(@RequestBody Hr hr){
        if(hrService.updateHr(hr)==1)return  RespBean.success(200,"更新成功");
        return  RespBean.failure (400,"更新失败");
    }

    @GetMapping("/getRoles")
    public List<Role> getAllRoleByHr(){
        return  roleService.getAllRoles();
    }

    @PutMapping("/updateRoleWithHrId")
    public RespBean updateHrRole(Integer hrid,Integer [] rids){
        if(hrService.updateHrRole(hrid,rids)){
            return RespBean.success(200,"更新成功");
        }
        return  RespBean.failure(400,"更新失败");
    }

    @DeleteMapping("/delete/{id}")
    public  RespBean deleteHrById(@PathVariable Integer id){
        if(hrService.deleteById(id)==1)return RespBean.success(200,"删除成功");
        return  RespBean.failure(400,"删除失败");

    }
}

