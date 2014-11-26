This is a reminder for how to using spring.

In idea:
这个是所有模块的父pom
* 先在idea中新建一个maven module，这个要作为project的首个module来创建。
* 将pom.xml的package改为pom,删除对应的src等目录，只保留pom.xml.
* 之后创建的module都会这个pom.xml的modules下面新增一个module.

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

### snippet-06
    是一个使用内存数据库，hsql来做单元测试的例子。
    NEED FIX， 如何从代码层面添加数据库的初始化脚本。