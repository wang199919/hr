package roy.hr.controller.basic;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import roy.hr.Menu;
import roy.hr.RespBean;
import roy.hr.Role;
import roy.hr.service.MenuService;
import roy.hr.service.RoleService;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 15:46
 * @description:
 */
@RestController
@RequestMapping("/basic/permiss")
public class PermissController {
@Autowired
    RoleService roleService;
@Autowired
    MenuService menuService;
@GetMapping ("/")
    public List<Role> getAllRole(){
    return  roleService.getAllRoles();
}
@GetMapping("/menus")
    public  List<Menu> getAllMunes(){
    return menuService.gerAllMunes();
}

//根据role id找到 munes 的编号
@GetMapping("/mids/{rid}")
    public  List <Integer> getMidsByRid(@PathVariable Integer rid){
    return menuService.getMidsById(rid);
}

//修改role 与 menu 的 关联关系
@PutMapping("/role")
public RespBean updateMuneRole(Integer rid,Integer[] mids){
    if(menuService.updateMenuRole(rid,mids))return  RespBean.success(200,"修改成功");
    return  RespBean.failure(400,"修改失败");
}

@PostMapping("/role")
    public  RespBean addRole(@RequestBody Role role){
    if(roleService.addRole(role)==1)return  RespBean.success(200,"添加成功");
    return  RespBean .failure(400,"添加失败");
}

@DeleteMapping("/deleteRole/{rid}")
    public  RespBean  deleteRoleByRid(@PathVariable Integer  rid){
    if(roleService.deleteRoleById(rid)==1)return  RespBean.success(200,"添加成功");
        return RespBean.failure(400,"删除失败");
}

}
