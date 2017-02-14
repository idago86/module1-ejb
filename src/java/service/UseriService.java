/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import dto.UserDTO;
import entitiesDB.UserDB;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Israel Dago
 */
@Stateless
public class UseriService implements UseriServiceRemote {

    @EJB private UserDao userDao;
        
    @Override
    public boolean registerUser(UserDTO userDTO) {
        UserDB user = userDao.findUserByName(userDTO.getUsername());
        if (user == null) {
            userDao.create(new UserDB(userDTO.getUsername(), userDTO.getParola(), userDTO.isAdmin()));
            return true;
        }
        return false;
}

    @Override
    public UserDTO loginUser(UserDTO userDTO) {
        UserDB user = userDao.findUserByName(userDTO.getUsername());
        if (user != null) {
            if (user.getParola().equals(userDTO.getParola())) {
                return new UserDTO(user.getId(), user.getUsername(), user.getParola(), user.getAdmin());
            }
        }
        return null;
}

    

  
    
}
