package cn.xwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories//启动SpringDate-JDBC
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
