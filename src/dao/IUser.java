package dao;

import model.User;

public interface  IUser {
     void insertUser(User newUser) throws Exception;
     void deleteUser(String id) throws Exception;
     void selectAll() throws Exception;
     void selectById(String id) throws Exception;
     void changePassword(String id,String newpassword) throws Exception;
     boolean getHaveUser(String name,String password) throws Exception;
}
