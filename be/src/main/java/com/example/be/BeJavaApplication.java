package com.example.be;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.be.mapper")
public class BeJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeJavaApplication.class, args);
    }

}
