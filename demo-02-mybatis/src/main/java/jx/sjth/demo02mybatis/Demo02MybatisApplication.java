package jx.sjth.demo02mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"jx.sjth.demo02mybatis.*"})
@SpringBootApplication
public class Demo02MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo02MybatisApplication.class, args);
    }
}
