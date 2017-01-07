package springbook.user.dao;

import springbook.user.domain.User;

import java.sql.*;

/**
 * Created by hreeman on 12/17/16.
 */
public class UserDao {
    private ConnectionMaker connectionMaker;
    private Connection connection;
    private User user;

    public void setConnectionMaker(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection connection = connectionMaker.makeConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into users(id, name, password) values(?, ?, ?)");

        preparedStatement.setString(1, user.getId());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getPassword());

        preparedStatement.execute();

        preparedStatement.close();
        connection.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        this.connection = connectionMaker.makeConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id = ?");

        preparedStatement.setString(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        this.user = new User();
        this.user.setId(resultSet.getString("id"));
        this.user.setName(resultSet.getString("name"));
        this.user.setPassword(resultSet.getString("password"));

        resultSet.close();
        preparedStatement.close();
        connection.close();

        return this.user;
    }
}
