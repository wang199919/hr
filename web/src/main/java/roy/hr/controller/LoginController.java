package roy.hr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import roy.hr.RespBean;
import roy.hr.config.VerificationCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author: roy
 * @date: 2023/7/15 22:32
 * @description:
 */
@RestController
public class LoginController {
@GetMapping("/login")
    public RespBean login(){
    System.out.println("123456");
    return  RespBean.failure(400,"请先登录");
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