import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springbook.user.dao.CountingConnectionMaker;
import springbook.user.dao.CountingDaoFactory;
import springbook.user.dao.UserDao;

import java.sql.SQLException;

/**
 * Created by hreeman on 1/7/17.
 */
public class UserDaoConnectionCountingTest {
    final static Logger logger = LoggerFactory.getLogger(UserDaoConnectionCountingTest.class);

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

        dao.get("hreeman");
        dao.get("hreeman");

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        logger.debug("Connection counter : {}", ccm.getCounter());
    }
}
