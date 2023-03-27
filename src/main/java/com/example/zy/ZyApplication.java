package com.example.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.example.zy.mapper")
@RestController
public class ZyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZyApplication.class, args);
    }

}
