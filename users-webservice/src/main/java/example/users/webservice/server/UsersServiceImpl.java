package example.users.webservice.server;

import example.users.webservice.model.ResponseUser;
import example.users.webservice.model.User;
import example.users.webservice.persistence.DAOException;
import example.users.webservice.persistence.IUsersDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//For SOAP
//@WebService(endpointInterface = "example.users.webservice.server.IUsersService", serviceName = "usersService")
//@WebService(endpointInterface = "example.users.webservice.server.IUsersService")

public class UsersServiceImpl implements IUsersService {

    private IUsersDao usersDao;
    private ResponseUser response;
    public static final String GET_USERS = "getUsers";
    public static final String INSERT_USER = "insertUser";

    Log logger = LogFactory.getLog(this.getClass());

    public IUsersDao getUsersDao() {
        return usersDao;
    }

    public void setUsersDao(IUsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public ResponseUser getUsersList() {
        response = new ResponseUser(GET_USERS);
        try {
            response.setUsers(this.usersDao.loadAllUsers());
        } catch (DAOException daoe) {
            errors(response, daoe);
        }
        return response;
    }

    @Override
    public ResponseUser insertUser(User user) {
        response = new ResponseUser(INSERT_USER);
        try {
            usersDao.insertUser(user);
        } catch (DAOException daoe) {
            errors(response, daoe);
        }
        return response;
    }

    private void errors(ResponseUser response, Exception e) {
        if (e instanceof DAOException) {
            logger.error("Problem with persistence " + e.getMessage());
        } else {
            logger.error(e.getMessage());
        }
        response.setResult(false);
    }

}
