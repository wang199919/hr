import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author: roy
 * @date: 2023/7/16 19:40
 * @description:
 */
public class test {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
       String s= passwordEncoder.encode("123456");
        System.out.println(s);
    }
}
