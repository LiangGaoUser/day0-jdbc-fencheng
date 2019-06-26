import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectTest {
    Connection connect;
    Statement st;
    ResultSet rs;
    String id,username,password;
    String sql;
    public void Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e)
        {
            System.out.println("加载驱动程序失败！");
            e.printStackTrace();
        }
        try{
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
        }catch(Exception e)
        {
            System.out.println("连接数据库失败！");
            e.printStackTrace();
        }
        try{
            st=connect.createStatement();
        }catch(Exception e)
        {
            System.out.println("createStatement创建失败!");
            e.printStackTrace();
        }

    }

    public void Insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入学号");
        id=sc.nextLine();
        System.out.println("输入姓名");
        username=sc.nextLine();
        System.out.println("输入密码");
        password=sc.nextLine();
        try{
            sql="insert into user_table values("+"'"+id+"'"+" , "+"'"+username+"'"+" , "+"'"+password+"'"+" )";
            System.out.println(sql);
            st.executeUpdate(sql);

        }catch(Exception e)
        {
            System.out.println("插入失败!");
            e.printStackTrace();
        }
    }
    public void Delete(){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入学号");
        id=sc.nextLine();
        try{
            sql="delete from user_table where id="+id;
            System.out.println(sql);
            st.executeUpdate(sql);

        }catch(Exception e)
        {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
    }
    public void Query(){
        try{
            sql="select*from user_table";
            System.out.println(sql);
            rs=st.executeQuery(sql);
            while(rs.next()){
                id=rs.getString("id");
                username=rs.getString("name");
                password=rs.getString("password");
                System.out.println("学号"+id+"姓名"+username+"密码"+password);
            }
        }catch(Exception e)
        {
            System.out.println("查询失败!");
            e.printStackTrace();
        }
    }
    public void Change(){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入学号");
        id=sc.nextLine();
        System.out.println("输入新密码");
        password=sc.nextLine();
        try{
            sql="update user_table set password="+password+" where id="+id;
            System.out.println(sql);
            st.executeUpdate(sql);

        }catch(Exception e)
        {
            System.out.println("修改密码失败!");
            e.printStackTrace();
        }
    }




    public static void main(String args[]){
        ConnectTest ct=new ConnectTest();
        ct.Connect();
        Scanner sc=new Scanner(System.in);
        int choose=0;
        while(true){
            System.out.println("请选择功能");
            System.out.print("1.增加用户\n"+"2.删除用户\n"+"3.查询用户信息\n"+"4.修改密码\n");
            choose=sc.nextInt();
            switch (choose){
                case 1:
                    ct.Insert();
                    break;
                case 2:
                    ct.Delete();
                    break;

                case 3:
                    ct.Query();
                    break;

                case 4:
                    ct.Change();
                    break;
            }
        }





    }

}
