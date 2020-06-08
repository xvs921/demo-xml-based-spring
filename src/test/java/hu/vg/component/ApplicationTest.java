package hu.vg.component;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.assertNotNull;

public class ApplicationTest {
    @Test
    public void helloWorldTest()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld obj=(HelloWorld) context.getBean("helloWorld");

        assertNotNull(obj);
    }
}
