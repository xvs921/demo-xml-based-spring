package hu.vg.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld obj=(HelloWorld) context.getBean("helloWorld");
        obj.hello();
    }

}
