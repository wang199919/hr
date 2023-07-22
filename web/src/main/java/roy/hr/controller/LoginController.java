package roy.hr.controller;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import roy.hr.Hr;
import roy.hr.LoginUser;
import roy.hr.RespBean;
import roy.hr.config.VerificationCode;
import roy.hr.service.LoginService;
import roy.hr.service.impl.HrServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: roy
 * @date: 2023/7/15 22:32
 * @description:
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Value("${jwt.tokenHeader}")
    private  String tokenHeader;
    @Value("%{jwt.tokenHead}")
    private  String tokenHead;
@PostMapping("/login")
@ResponseBody
    public RespBean login(@RequestBody String x){
    String[] nameAndPassword=x.split("&");
    String username = nameAndPassword[0].substring(9);
    String password=nameAndPassword[1].substring(9);
    System.out.println(username);

   String token= loginService.login(username,password);
    if (token == null) {
        return RespBean.failure(403,"用户名或密码错误");
    }
    Map<String, String> tokenMap = new HashMap<>();
    tokenMap.put("token", token);
    tokenMap.put("tokenHead", tokenHead);
    return  RespBean.success(400,"登录成功");
}

@GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
    VerificationCode code=new VerificationCode();
    BufferedImage image=code.getImage();
    String text=code.getText();
    HttpSession  session=request.getSession(true);
    session.setAttribute("verify_code",text);
    VerificationCode.output(image,response.getOutputStream());
}
}
