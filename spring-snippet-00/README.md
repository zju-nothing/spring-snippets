1. 这个模块是一个模板模块，只提供最基础的maven开发的web目录结构，后续的模块都可能从这个模块复制后开发。
2. 如何生成这样一个模块：
    - new modules -> maven module -> 修改pom的package为war
    - 刷新maven，可以看到project structure中这个modules下面有个web facet. 里面的web resource dir 指向 src/main/webapp
    - 根据指定的路径，新建src/main/webapp/WEB-INF/web.xml
    - 刷新maven. that‘s all.