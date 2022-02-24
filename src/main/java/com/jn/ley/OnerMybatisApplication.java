package com.jn.ley;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Mybatis试验
 * @author Lee
 * @version 0.0.1
 */

@SpringBootApplication
@MapperScan("com.jn.ley.mapper")
public class OnerMybatisApplication {
    public static void main(String[] args){
        SpringApplication.run(OnerMybatisApplication.class, args);
    }
}
