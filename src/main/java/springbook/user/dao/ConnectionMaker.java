package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by hreeman on 12/17/16.
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
