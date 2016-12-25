import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;

import java.sql.SQLException;

/**
 * Created by hreeman on 12/17/16.
 */
public class UserDaoTest {
    final static Logger logger = LoggerFactory.getLogger(UserDaoTest.class);

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DaoFactory daoFactory = new DaoFactory();
        UserDao dao1 = daoFactory.userDao();
        UserDao dao2 = daoFactory.userDao();

        logger.debug(dao1.toString());
        logger.debug(dao2.toString());

        /*
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);

        UserDao userDao = context.getBean("userDao", UserDao.class);

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
        */
    }
}
