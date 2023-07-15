package roy.hr.service;

/**
 * @author: roy
 * @date: 2023/7/15 22:19
 * @description:
 */

import org.springframework.stereotype.Service;
import roy.hr.Role;

import java.util.List;

@Service
public interface RoleService {
    public List<Role> getAllRoles();
    public Integer addRole(Role role);
    public  Integer deleteRoleById(Integer id);
}
