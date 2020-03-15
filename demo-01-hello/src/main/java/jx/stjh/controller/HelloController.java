package jx.stjh.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: Zlk
 * @Date: 2020/3/12 00:15
 */
@Api(tags = "swagger例子")  //swagger类
@RestController
public class HelloController {

    //@RequestMapping("/hello")
    @ApiOperation("swagger 方法!")  //swagger方法
    //@ApiIgnore   //屏蔽swagger接口说明
    @GetMapping("/hello")
    public String hello(){
        return "hello springboot！！";
    }
}