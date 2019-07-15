package top.hting.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    /**
     * xml 文件配置bean的依赖关系
     */
    @Test
    public void serviceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("one-two.xml");

        TwoService twoService = context.getBean(TwoService.class);

        twoService.sayHello();


    }

}
