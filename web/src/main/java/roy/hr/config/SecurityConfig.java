package roy.hr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author: roy
 * @date: 2023/7/16 11:18
 * @description:
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

}
