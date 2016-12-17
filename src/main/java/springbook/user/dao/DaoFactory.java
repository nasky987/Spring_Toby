package springbook.user.dao;

/**
 * Created by hreeman on 12/18/16.
 */
public class DaoFactory {
    public UserDao userDao() {
        return new UserDao(new DConnectionMaker());
    }

    public AccountDao accountDao() {
        return new AccountDao(new DConnectionMaker());
    }

    public MessageDao messageDao() {
        return new MessageDao(new DConnectionMaker());
    }
}
