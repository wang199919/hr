package roy.hr.mapper;

import roy.hr.Role;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/15 0:05
 * @description:
 */
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    List<Role> getAllRoles();
    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}