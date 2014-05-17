/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.users.webservice.persistence.mock;

import example.users.webservice.model.User;
import example.users.webservice.persistence.DAOException;
import example.users.webservice.persistence.IUsersDao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author antonio
 */
public class UsersMockDao implements IUsersDao {

    List<User> users = new ArrayList<User>();
    Log logger = LogFactory.getLog(this.getClass());

    public UsersMockDao() {
        initUsers();
    }

    @Override
    public List<User> loadAllUsers() throws DAOException {
        return this.users;
    }

    private void initUsers() {
        Calendar calendar = new GregorianCalendar();
        calendar.setLenient(false);
        calendar.set(1984, 1, 23);
        try {
            User user1 = new User("Antonio", "Genovese", "Regist", calendar.getTime());
            calendar.set(1981, 6, 25);
            User user2 = new User("Gianluca", "Genovese", "Gianblues", calendar.getTime());
            calendar.set(2011, 7, 7);
            User user3 = new User("Gabriele", "Genovese", "Gaby", calendar.getTime());
            this.users.add(user1);
            this.users.add(user2);
            this.users.add(user3);
        } catch (IllegalArgumentException ex) {
            logger.error("Exception Calendar " + ex.getMessage());
        }

    }

    @Override
    public void insertUser(User usr) throws DAOException {
        try {
            this.users.add(usr);
        } catch (Exception ex) {
            logger.error("Exception insert user " + ex.getMessage());
            throw new DAOException(ex);
        }
    }

}
