package com.test.demoq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.test.demoq.mapper")
public class DemoqApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoqApplication.class, args);
    }

}
