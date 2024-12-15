package com.blog.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主启动类
 *
 * @author nhh
 */
@SpringBootApplication
@MapperScan("com.blog.*.mapper")
@ComponentScan("com.blog.*")
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
