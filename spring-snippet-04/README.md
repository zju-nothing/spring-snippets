This demo shows spring mvc with login-demo  and inspect-ApplicationContext-demo.

* 添加slf4j 和 logback 日志系统。   
    * 添加dependency，slf4j为日志api，不添加实现也不会报错，但是日志会打不出来。 
    * 添加logback依赖，在resources下添加logback.xml，这个文件为logback系统默认寻找的文件。
* 添加spring-mvc的支持，mvc的web层的容器配置文件在WEB-INF下，命名规则为 <DispatcherServletName>-servlet.xml。 
  可以参考 [Spring MVC Doc](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html)
* 添加登陆更能，页面==>localhost:8080/spring-snippet-04/login.html
* 添加DB层的使用，使用最简单的jdbcTemplate来查询数据库，数据库文件在 database/init.dll
* 添加容器观察页面==>localhost:8080/spring-snippet-04/inspect.html. 
* 最后，这里例子中还添加了 事务处理。 对service层的操作，添加了事务，可以在UserService.loginSuccess()方法最后行debug住，
  可以看到对user表的操作并没有生效，只有当整个方法运行完后，才会commit，user表和login表才会一起被改变。
  配置主要在login-demo-service.xml中，用到的lib主要有 aspectjweaver、cglib 两个包。
