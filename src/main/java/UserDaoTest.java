import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import springbook.user.dao.UserDao;

import java.sql.SQLException;

/**
 * Created by hreeman on 12/17/16.
 */
public class UserDaoTest {
    final static Logger logger = LoggerFactory.getLogger(UserDaoTest.class);

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        UserDao userDao3 = context.getBean("userDao", UserDao.class);
        UserDao userDao4 = context.getBean("userDao", UserDao.class);

        logger.debug(userDao3.toString());
        logger.debug(userDao4.toString());

        /*
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
