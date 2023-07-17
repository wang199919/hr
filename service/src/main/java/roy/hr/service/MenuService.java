package roy.hr.service;

import org.springframework.stereotype.Service;
import roy.hr.Menu;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/17 16:54
 * @description:
 */
@Service
public interface MenuService {
public List<Menu> getMenusByHrId();

public  List<Menu> getAllMenusWithRole();

public  List<Integer> getMidsById(Integer rid);

public  boolean updateMenuRole(Integer rid, Integer [] mids);

public  List <Menu> gerAllMunes();
}
