package jx.stjh.demo02mybatis.config;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: Druid 数据源配置类
 * DruidConfig
 * @author: Zlk
 * @date: 2020/3/1614:53
 */
public class DruidConfig {
    /**
     * 将自定义的 Druid 数据源添加到容器中，不再让 Spring Boot 自动创建
     * 这样做的目的是：绑定全局配置文件中的 druid 数据源属性到 com.alibaba.druid.pool.DruidDataSource
     * 从而让它们生效
     *
     * @return
     * @ConfigurationProperties(prefix = "spring.datasource")：作用就是将 全局配置文件中 前缀为 spring.datasource
     * 的属性值注入到 com.alibaba.druid.pool.DruidDataSource 的同名参数中
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    /**
     * 配置一个druid的监控
     * 1.配置一个druid的后台管理Servlet
     * 2.配置一个druid的filter
     */
    //1. 使用StatViewServlet配置一个druid的后台管理Servlet
    @Bean
    public ServletRegistrationBean statViewServlet() {
        //配置/druid/*请求
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //设置初始化参数值
        Map<String, String> initParam = new HashMap<>();
        //配置登录用户名
        initParam.put(StatViewServlet.PARAM_NAME_USERNAME, "root");
        //配置登录密码
        initParam.put(StatViewServlet.PARAM_NAME_PASSWORD, "1234");
        //如果不写，则默认所有ip都可以访问
        initParam.put(StatViewServlet.PARAM_NAME_ALLOW, "");
        //禁止访问的IP地址
        initParam.put(StatViewServlet.PARAM_NAME_DENY, "192.168.3.8");

        //设置初始化参数
        bean.setInitParameters(initParam);
        return bean;
    }

    //2.使用WebStatFilter配置一个druid的filter
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        //添加过滤器
        bean.setFilter(new WebStatFilter());

        //设置初始化参数
        Map<String, String> initParam = new HashMap<>();
        //设置不拦截的请求
        initParam.put(WebStatFilter.PARAM_NAME_EXCLUSIONS, "*.js,*.css,/druid/*");
        //设置初始化参数
        bean.setInitParameters(initParam);

        //设置拦截请求
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
