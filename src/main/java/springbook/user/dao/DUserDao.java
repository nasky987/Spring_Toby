package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by hreeman on 12/17/16.
 */
public class DUserDao extends UserDao {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //D사 DB 커넥션 생성코드
        return null;
    }
}
