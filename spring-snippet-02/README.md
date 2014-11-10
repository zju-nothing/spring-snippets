Very first demo to show the spring-test with junit.

* Spring和junit的整合测试，需要lib： spring-text
* 测试类中，不需要手动去new ApplicationContext，通过注解方式去做容器初始化以及获取bean的操作。
    * @RunWith(SpringJUnit4ClassRunner.class) 改变junit的classRunner，让它集成spring
    * @ContextConfiguration("classpath:spring/snippet-02-config.xml") 指定配置文件的位置。
    注意，这里可以在test下建立配置文件将main下的配置文件override掉，用test的逻辑mock掉main中的逻辑。
    * @Resource 声明式获取某个bean