package jx.sjth.demo02mybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: 引入swagger2配置类
 * 通过 http://localhost:8080/swagger-ui.html#/ 进行swagger访问
 * @Auther: Zlk
 * @Date: 2020/3/15 21:19
 */
@Configuration  //@Configuration 是告诉 Spring Boot 需要加载这个配置类
@EnableSwagger2  //是启用 Swagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //对所有api进行监控,apis我们可以通过指定包名的方式，让 Swagger 只去某些包下面扫描。如：RequestHandlerSelectors.basePackage("jx.stjh.controller")
                .apis(RequestHandlerSelectors.any())
                // 对所有路径进行监控;这种方式可以通过筛选 API 的 url 来进行过滤
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * 文档信息配置，Swagger 还支持设置一些文档的版本号、联系人邮箱、网站、版权、开源协议等等信息，
     * 但与上面几条不同的是这些信息不是通过注解配置，而是通过创建一个 ApiInfo 对象，并且使用 Docket.appInfo() 方法来设置
     */

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("demo-02-mybatis RESTful APIs")
                .description("关注我 https://github.com/mowuqiankun")
                .termsOfServiceUrl("https://github.com/mowuqiankun")
                .version("1.0")
                .build();
    }
}