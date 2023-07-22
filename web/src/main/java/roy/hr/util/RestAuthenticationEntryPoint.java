package roy.hr.util;

import cn.hutool.json.JSONUtil;
import org.checkerframework.checker.units.qual.C;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import roy.hr.RespBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: roy
 * @date: 2023/7/22 21:52
 * @description: 未登录,自定义返回结果
 */
@Component
public class RestAuthenticationEntryPoint  implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JSONUtil.parse(RespBean.failure(401,"未登录或token过期")));
        response.getWriter().flush();
    }
}
