package roy.hr.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import roy.hr.Hr;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/16 11:19
 * @description:
 */
@Service
public interface HrService extends UserDetailsService {

    public List<Hr> getAllHrs(String key);

    public  Integer updateHr(Hr hr);

    public  boolean updateHrRole(Integer hrid,Integer [] rid);

    public  Integer deleteById(Integer id);

    public  List<Hr>  getAllHrsExceptCurrentHr();

    public  Integer updateHrById(Hr hr);

    public  boolean updateHrPasswd(String oldPass, String newPass,Integer hId);

    public Integer updateUserface(String url,Integer id);
}
