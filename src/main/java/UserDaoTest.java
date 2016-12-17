import springbook.user.dao.ConnectionMaker;
import springbook.user.dao.DConnectionMaker;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

import java.sql.SQLException;

/**
 * Created by hreeman on 12/17/16.
 */
public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDao userDao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("hreeman");
        user.setName("JOHN LEE");
        user.setPassword("test");

        userDao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = userDao.get(user.getId());

        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공");
    }
}
