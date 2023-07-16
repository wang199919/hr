package roy.hr.mapper;

import org.apache.ibatis.annotations.Param;
import roy.hr.Hr;
import roy.hr.Role;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/16 11:34
 * @description:
 */
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);

    List<Role> getHrRoleById(Integer id);

    List<Hr> getAllHrs(@Param("hrid") Integer hrid,@Param("keywords")String keyword);

    List<Hr> getAllHrsExceptCurrentHr(Integer id);


    Integer updatePasswd(@Param("hrid") Integer hrid, @Param("encodePass") String encodePass);

    Integer updateUserface(@Param("url") String url, @Param("id") Integer id);
}