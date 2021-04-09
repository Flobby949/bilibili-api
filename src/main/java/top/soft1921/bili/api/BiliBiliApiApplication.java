package top.soft1921.bili.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Flobby
 */
@SpringBootApplication
@MapperScan("top.soft1921.bili.api.mapper")
public class BiliBiliApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiliBiliApiApplication.class, args);
    }

}
