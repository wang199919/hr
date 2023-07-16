package roy.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import roy.hr.Hr;
import roy.hr.mapper.HrMapper;
import roy.hr.mapper.HrRoleMapper;
import roy.hr.mapper.RoleMapper;
import roy.hr.service.HrService;
import roy.hr.utils.HrUtils;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/16 11:31
 * @description:
 */
public class HrServiceImpl implements HrService {
    @Autowired
    HrMapper hrMapper;
    @Autowired
    HrRoleMapper hrRoleMapper;

    @Override
    public List<Hr> getAllHrs(String key) {
        return hrMapper.getAllHrs(HrUtils.getCurrentHr().getId(),key);
    }

    @Override
    public Integer updateHr(Hr hr) {
        return hrMapper.updateByPrimaryKeySelective(hr);
    }

    @Override
    public boolean updateHrRole(Integer hrid, Integer[] rid) {
        hrRoleMapper.deleteByHrid(hrid);
        return hrRoleMapper.addRole(hrid,rid)==rid.length;
    }

    @Override
    public Integer deleteById(Integer id) {
        return hrMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Hr> getAllHrsExceptCurrentHr() {
        return hrMapper.getAllHrsExceptCurrentHr(HrUtils.getCurrentHr().getId());
    }

    @Override
    public Integer updateHrById(Hr hr) {
        return hrMapper.updateByPrimaryKeySelective(hr);
    }

    @Override
    public boolean updateHrPasswd(String oldPass, String newPass, Integer hId) {
        String password= hrMapper.selectByPrimaryKey(hId).getPassword();
        if(!oldPass.equals(password))return false;
        return hrMapper.updatePasswd(hId,newPass)==1;
    }

    @Override
    public Integer updateUserface(String url, Integer id) {
        return hrMapper.updateUserface(url,id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Hr hr=hrMapper.loadUserByUsername(username);
       if(hr==null){throw  new UsernameNotFoundException("用户名错误");
       }
       hr.setRoles(hrMapper.getHrRoleById(hr.getId()));
        return hr;
    }
}
