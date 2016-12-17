package springbook.user.dao;

/**
 * Created by hreeman on 12/18/16.
 */
public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);

        return userDao;
    }
}
