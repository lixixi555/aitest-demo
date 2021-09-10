package com.lucy.aitestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"java.com.lucy.aitestdemo.dao"})
public class AitestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AitestDemoApplication.class, args);
    }
}
