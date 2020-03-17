package jx.stjh.demo02mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@ComponentScan(basePackages = {"jx.stjh.demo02mybatis.*"})
@SpringBootApplication
@MapperScan("jx.stjh.demo02mybatis.dao")    // 扫描DAO
public class Demo02MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo02MybatisApplication.class, args);
    }
}
