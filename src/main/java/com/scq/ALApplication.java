package com.scq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName ALApplication
 * @Description
 * @Author JavaQ
 * @Date 2020/1/14 21:52
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ALApplication {
    public static void main(String[] args) {
        SpringApplication.run(ALApplication.class,args);
    }
}
