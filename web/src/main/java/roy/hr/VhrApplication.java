package roy.hr;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: roy
 * @date: 2023/7/15 21:44
 * @description:
 */
@MapperScan(basePackages = "roy.hr.mapper")
@SpringBootApplication
public class VhrApplication {
    public static void main(String[] args) {
        SpringApplication.run(VhrApplication.class,args);
    }
}
