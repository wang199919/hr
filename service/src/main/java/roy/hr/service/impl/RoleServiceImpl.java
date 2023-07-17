package roy.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roy.hr.Role;
import roy.hr.mapper.RoleMapper;
import roy.hr.service.RoleService;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/15 22:23
 * @description:
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getAllRoles() {

        return roleMapper.getAllRoles();
    }

    @Override
    public Integer addRole(Role role) {
        if(!role.getName().startsWith("ROLE_")){
            role.setName("ROLE_"+role.getName());
        }
        return roleMapper.insert(role);
    }

    @Override
    public Integer deleteRoleById(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }
}
