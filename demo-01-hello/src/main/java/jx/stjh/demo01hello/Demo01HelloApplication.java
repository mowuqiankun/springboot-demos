package jx.stjh.demo01hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
1、热部署；
2、springboot利用idea创建
3、github如果创建分类
4、Springboot入门

 * @author zlk
 */
@SpringBootApplication
@ComponentScan(basePackages={"jx.stjh.*"})
public class Demo01HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo01HelloApplication.class, args);
    }


}
