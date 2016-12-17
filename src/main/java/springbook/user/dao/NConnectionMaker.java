package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by hreeman on 12/17/16.
 */
public class NConnectionMaker implements ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        //N사의 독자적인 방법으로 Connection 생성
        return null;
    }
}
