package roy.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.jaas.SecurityContextLoginModule;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import roy.hr.Hr;
import roy.hr.Menu;
import roy.hr.mapper.MenuMapper;
import roy.hr.mapper.MenuRoleMapper;
import roy.hr.service.MenuService;
import sun.plugin.liveconnect.SecurityContextHelper;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/17 17:05
 * @description:
 */

@Service
public class MenuServiceImpl  implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Autowired
    MenuRoleMapper menuRoleMapper;

    @Override
    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    @Override
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    @Override
    public List<Integer> getMidsById(Integer rid) {
        return menuMapper.getMidsByRid(rid);
    }

    @Override
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.deleteByRid(rid);
        if(mids==null||mids.length==0){
            return  true;
        }
        Integer result =menuRoleMapper.insertRecord(rid,mids);
        return  result==mids.length;
    }

    @Override
    public List<Menu> gerAllMunes() {
        return menuMapper.getAllMenus();
    }
}
