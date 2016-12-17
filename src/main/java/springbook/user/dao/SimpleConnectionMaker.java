package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by hreeman on 12/17/16.
 */
public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mariadb://mariadb.my.to:3306/toby_spring", "toby", "toby");

        return connection;
    }
}
