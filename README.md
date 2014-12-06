This is a reminder for how to using spring.

In idea:
这个是所有模块的父pom
* 先在idea中新建一个maven module，这个要作为project的首个module来创建。
* 将pom.xml的package改为pom,删除对应的src等目录，只保留pom.xml.
* 之后创建的module都会这个pom.xml的modules下面新增一个module.

或者使用maven命令行直接生成maven工程，再导入idea

### snippet-00
    是一个web开发的模板，只有目录结构，内容是空的。

### snippet-01 & snippet-03
    可以看成是互补的，1是用了servlet，在servlet中直接写html。 3是用了jsp，在jsp中直接写java语言。
    servlet和jsp区别可以参见 http://www.ntu.edu.sg/home/ehchua/programming/java/JSPByExample.html
    
### snippet-02
    是一个简单的spring集成junit4的spring-text项目。
    
### snippet-04
    是一个spring-mvc的例子。 mvc，jdbcTemplate，logback。
    
### snippet-05
    是一个简单的spring集成ibatis的demo。 
    有一些注意点
    - mapper文件中的命名，数据库中的操作最好大写，java中的变量小写
    - 对于dataObject，要记得必须提供无参的构造函数（默认构造函数），否则映射resultMap时，调用无参构造函数会出错。

### snippet-06 & snippet-07
    是一个使用内存数据库，hsql来做单元测试的例子: 
- 6中使用的 jdbc:embedded 的namespace来配置内存数据库，初始化脚本直接配置在xml文件中。
- 7中使用的是 datasourceFactoryBean 来配置内存数据库，暴露populator给javacode，让javacode有机会来用不同的初始化脚本填充内存数据库。


### snippet-08
    是一个spring-aop的例子，从代码AspectJProxyFactory中获取代理是通过cglib代理的。
    从Spring容器默认获取代理是通过jdk动态代理获得的，可以通过修改proxy-target-class属性修改代理方式：cglib or jdk