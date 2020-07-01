package com.ucpeo.spring5;


import com.ucpeo.spring5.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        String string =applicationContext.getBean("str",String.class);
        System.out.println(string);

        Object user =applicationContext.getBean(User.class);

        System.out.println(user);
    }
}
