package roy.hr.mapper;


import org.apache.ibatis.annotations.Param;
import roy.hr.HrRole;

/**
 * @author: roy
 * @date: 2023/7/16 11:34
 * @description:
 */
public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    void  deleteByHrid (Integer hrid);

    Integer addRole(@Param("hrid") Integer hrid, @Param("rids") Integer[] rids);
}