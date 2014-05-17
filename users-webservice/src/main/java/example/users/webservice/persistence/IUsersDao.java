/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.users.webservice.persistence;

import example.users.webservice.model.User;
import java.util.List;

/**
 *
 * @author antonio
 */
public interface IUsersDao {

    public List<User> loadAllUsers() throws DAOException;
    
    public void insertUser(User usr) throws DAOException;

}
