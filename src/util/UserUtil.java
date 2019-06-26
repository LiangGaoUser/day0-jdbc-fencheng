package util;

import model.User;

import java.util.Scanner;

public class UserUtil {

    Scanner sc=new Scanner(System.in);
    public User getUser(){
        User user=new User();
        System.out.println("请输入用户学号:");
        user.setId(sc.nextLine());
        System.out.println("请输入用户姓名:");
        user.setName(sc.nextLine());
        System.out.println("请输入用户密码:");
        user.setPassword(sc.nextLine());
        return user;
    }
    public String getId(){
        System.out.println("请输入用户的id");
        String id=sc.nextLine();
        return id;
    }

}
