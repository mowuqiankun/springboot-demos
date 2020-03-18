1、springboot-web 搭建；
2、热部署；

3、swagger (访问：localhost:8080/swagger-ui.html)

4、集成mybatis;
   1)application.yml中添加如下
        mybatis:
          type-aliases-package: jx.stjh.demo02mybatis.model
          mapper-locations: classpath:mapper/*.xml  #classpath就是应用程序resources的路径
   2) 启动类 @MapperScan("jx.stjh.demo02mybatis.dao")
   
5、mybatis generator代码自动生成
  1）pom.xml引入 mybatis-generator-maven-plugin
  2）resources下加入generatonConfig.xml.
     可参照 https://blog.csdn.net/testcs_dn/article/details/77881776
  3）Edit Configurationsworking 
     directory: 项目路径
     command line: mybatis-generator:generate -e
     在项目中点击run既可成功。
     
6、集成Druid数据源：（访问：localhost:8080/druid/index.html）
   (为监控而生的DB池，阿里开源的JDBC应用组件，主要包含三部分)
   1)pom.xml 引入 druid-spring-boot-starter
   2)application.iml 添加配置，不需要配置类
   
7、log4j集成

8、集成pagehelper插件
  1、pom.xml引入pagehelper-spring-boot-starter，注意与Springboot版本号；
  2、application.yml加入 pagehelper相关配置；