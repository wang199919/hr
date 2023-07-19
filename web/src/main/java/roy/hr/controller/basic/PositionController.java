package roy.hr.controller.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import roy.hr.Position;
import roy.hr.RespBean;
import roy.hr.service.PositionService;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/19 15:34
 * @description:
 */
@RestController
@RequestMapping("/basic/position")
public class PositionController {
    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public List<Position> getAllPosition(){
        return  positionService.getAllPosition();
    }

    @PostMapping("/add")
    public RespBean addPosition(Position position){
        if(positionService.addPositaion(position)==1)return RespBean.success(200,"添加成功");
        return  RespBean.failure(400,"添加失败");
    }

    @PutMapping("/update")
    public  RespBean updatePosition(Position position){
        if(positionService.updatePosition(position)==1)return  RespBean.success(200,"修改成功");
        return  RespBean.failure(400,"修改失败");
    }

    @DeleteMapping("/deleteById/{id}")
    public  RespBean deletePositionById(@PathVariable Integer id){
        if(positionService.deletePositionById(id)==1)return  RespBean.success(200,"删除成功");
        return  RespBean.failure(400,"删除失败");
    }

    @DeleteMapping("/deleteByIds")
    public  RespBean deletePositionByIds(Integer [] ids){
        if(positionService.deletePositionByIds(ids)==ids.length)return RespBean.success(200,"删除成功");
        return  RespBean.failure(400,"删除失败");
    }
}
