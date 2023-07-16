package roy.hr.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import roy.hr.Hr;

/**
 * @author: roy
 * @date: 2023/7/16 12:30
 * @description: 获取当前用户的id
  */


public class HrUtils {
    public static Hr getCurrentHr() {
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
