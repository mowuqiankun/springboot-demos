package jx.stjh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: Zlk
 * @Date: 2020/3/12 00:15
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot！！";
    }
}