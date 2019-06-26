package util;

import java.sql.*;

public class DBUtil {
    private String id;
    private String name;
    private String password;
    public Connection getConn() {
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
        }catch(Exception e){
            System.out.println("数据库连接失败!");
            e.printStackTrace();
        }
        return conn;

    }
    public void Close(PreparedStatement psmt, ResultSet rs, Connection conn){
        try{
            if(rs!=null){
                rs.close();
            }
            if(psmt!=null){
                psmt.close();
            }
            if(conn!=null){
                conn.close();
            }
        }catch(Exception e){
            System.out.println("数据库关闭失败!");
        }
    }



}
