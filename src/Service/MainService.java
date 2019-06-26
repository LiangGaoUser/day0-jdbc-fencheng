package Service;

import java.sql.SQLException;

public class MainService {
    public static void main(String args[]) throws SQLException {
        new UserService().userLogin();
    }

}
