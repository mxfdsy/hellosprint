package com.hellosprint.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 平凡的世界 on 2018/4/2.
 */
public class Main {
    public static void main(String[] args) {
        //告诉idea你的sprint在哪里
        ApplicationContext context = new ClassPathXmlApplicationContext("./com/hellosprint/resource/hellowsprintconflg.xml");
        //获取对象的两种的方式获取对象
        User user = (User) context.getBean("user");
//        User user1 = context.getBean(User.class);
        //获取内容
        System.out.println(user.getName());
        System.out.println(user.getAge());

        UserFather uf = context.getBean(UserFather.class);
        System.out.println(uf.getFatherName());

        User bU =  context.getBean(User.class);
        List<String> list = bU.getList();
        for (String ls:list
             ) {
            System.out.println(ls);
        }
    }
}
