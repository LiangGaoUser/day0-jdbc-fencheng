package daoimpl;

import dao.IUser;
import model.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao implements IUser {
    DBUtil db;
    Connection conn;
    String sql=null;
    PreparedStatement pstm;
    ResultSet rs=null;
   public void insertUser(User newUser) throws SQLException {
       db=new DBUtil();
       conn=db.getConn();
       sql="insert into user_table values(?,?,?)";
       pstm=conn.prepareStatement(sql);
       pstm.setString(1,newUser.getId());
       pstm.setString(2,newUser.getName());
       pstm.setString(3,newUser.getPassword());
       pstm.executeUpdate();
       db.Close(pstm,rs,conn);
   }
   public void deleteUser(String id) throws SQLException {
       db=new DBUtil();
       conn=db.getConn();
       sql="delete from user_table where id=?";
       pstm=conn.prepareStatement(sql);
       pstm.setString(1,id);
       pstm.executeUpdate();
       db.Close(pstm,rs,conn);
   }
    public void selectAll() throws SQLException {
        db=new DBUtil();
        conn=db.getConn();
        sql="select*from user_table";
        pstm=conn.prepareStatement(sql);
        rs=pstm.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
        }
        db.Close(pstm,rs,conn);



    }
    public void selectById(String id) throws SQLException {
        db=new DBUtil();
        conn=db.getConn();
        sql="select*from user_table where id=?";
        pstm=conn.prepareStatement(sql);
        pstm.setString(1,id);
        rs=pstm.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
        }
        db.Close(pstm,rs,conn);
    }
    public void changePassword(String id,String password) throws SQLException {
        db=new DBUtil();
        conn=db.getConn();
        sql="update user_table set password=? where id=?";
        pstm=conn.prepareStatement(sql);
        pstm.setString(1,password);
        pstm.setString(2,id);
        pstm.executeUpdate();
        db.Close(pstm,rs,conn);
    }
    public boolean getHaveUser(String name ,String password) throws SQLException {
       db=new DBUtil();
       conn=db.getConn();
       sql="select*from user_table where name=? and password=?";
       pstm=conn.prepareStatement(sql);
       pstm.setString(1,name);
       pstm.setString(2,password);
       rs=pstm.executeQuery();
       if(!rs.next()){
           db.Close(pstm,rs,conn);
           return false;

       }
        db.Close(pstm,rs,conn);
       return true;

    }
}
