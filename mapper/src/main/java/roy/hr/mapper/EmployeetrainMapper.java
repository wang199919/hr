package roy.hr.mapper;

import roy.hr.Employeetrain;

/**
 * @author: roy
 * @date: 2023/7/19 23:00
 * @description:
 */
public interface EmployeetrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeetrain record);

    int insertSelective(Employeetrain record);

    Employeetrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeetrain record);

    int updateByPrimaryKey(Employeetrain record);
}