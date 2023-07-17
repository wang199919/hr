package roy.hr.controller.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import roy.hr.Menu;
import roy.hr.service.MenuService;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/17 17:17
 * @description:
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService service;

    @GetMapping("/setmenu")

    public List<Menu> getMenuByHid(){
        return  service.getMenusByHrId();
    }
}
