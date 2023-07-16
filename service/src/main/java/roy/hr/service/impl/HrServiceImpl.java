package roy.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import roy.hr.Hr;
import roy.hr.mapper.HrMapper;
import roy.hr.mapper.HrRoleMapper;
import roy.hr.mapper.RoleMapper;

import roy.hr.utils.HrUtils;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/16 11:31
 * @description:
 */
@Service
public class HrServiceImpl implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Autowired
    HrRoleMapper hrRoleMapper;


    public List<Hr> getAllHrs(String key) {
        return hrMapper.getAllHrs(HrUtils.getCurrentHr().getId(),key);
    }


    public Integer updateHr(Hr hr) {
        return hrMapper.updateByPrimaryKeySelective(hr);
    }


    public boolean updateHrRole(Integer hrid, Integer[] rid) {
        hrRoleMapper.deleteByHrid(hrid);
        return hrRoleMapper.addRole(hrid,rid)==rid.length;
    }

    public Integer deleteById(Integer id) {
        return hrMapper.deleteByPrimaryKey(id);
    }


    public List<Hr> getAllHrsExceptCurrentHr() {
        return hrMapper.getAllHrsExceptCurrentHr(HrUtils.getCurrentHr().getId());
    }

    public Integer updateHrById(Hr hr) {
        return hrMapper.updateByPrimaryKeySelective(hr);
    }

    public boolean updateHrPasswd(String oldPass, String newPass, Integer hId) {
        String password= hrMapper.selectByPrimaryKey(hId).getPassword();
        if(!oldPass.equals(password))return false;
        return hrMapper.updatePasswd(hId,newPass)==1;
    }


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
