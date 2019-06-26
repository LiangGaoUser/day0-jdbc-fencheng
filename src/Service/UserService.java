package Service;

import daoimpl.UserDao;
import model.User;
import util.UserUtil;

import java.sql.SQLException;
import java.util.Scanner;

public class UserService {
    UserDao ud;
    Scanner sc;
    UserUtil ut;

    public boolean userLogin() throws SQLException {
        ud = new UserDao();
        sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();
        if (!ud.getHaveUser(name, password)) {
            System.out.println("登录失败！用户名或则密码错误");
            return false;
        }
        userMenu();
        return true;
    }

    public void userMenu() throws SQLException {
        while (true) {
            System.out.println("请选择功能");
            System.out.print("1.增加用户\n" + "2.删除用户\n" + "3.查询所有用户信息\n" + "4.查询某一用户信息\n" + "5.修改密码\n");
            int choose = sc.nextInt();
            sc = new Scanner(System.in);
            switch (choose) {
                case 1:
                    ut = new UserUtil();
                    User newUser = ut.getUser();
                    ud.insertUser(newUser);
                    break;
                case 2:
                    System.out.println("请输入删除的学号:");
                    String id = sc.nextLine();
                    ud.deleteUser(id);
                    break;

                case 3:
                    ud.selectAll();
                    break;

                case 4:
                    System.out.println("请输入查询的学号:");
                    String id1 = sc.nextLine();
                    ud.selectById(id1);
                    break;
                case 5:
                    System.out.println("请输入查询的学号:");
                    String id2 = sc.nextLine();
                    System.out.println("请新的密码:");
                    sc=new Scanner(System.in);
                    String password=sc.nextLine();
                    ud.changePassword(id2,password );
                    break;
            }


        }
    }
}






