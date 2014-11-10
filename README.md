This is a reminder for how to using spring.

In idea:
这个是所有模块的父pom
    * 先在idea中新建一个maven module，这个要作为project的首个module来创建。
    * 将pom.xml的package改为pom,删除对应的src等目录，只保留pom.xml.
    * 之后创建的module都会这个pom.xml的modules下面新增一个module.
