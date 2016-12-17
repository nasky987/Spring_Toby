import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

import java.sql.SQLException;

/**
 * Created by hreeman on 12/17/16.
 */
public class UserDaoTest {
    final static Logger logger = LoggerFactory.getLogger(UserDaoTest.class);

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao userDao = new DaoFactory().userDao();

        User user = new User();
        user.setId("hreeman");
        user.setName("JOHN LEE");
        user.setPassword("test");

        userDao.add(user);

        logger.debug("{} 등록 성공", user.getId());

        User user2 = userDao.get(user.getId());

        logger.debug(user2.getName());
        logger.debug(user2.getPassword());
        logger.debug("{} 조회 성공", user2.getId());
    }
}
