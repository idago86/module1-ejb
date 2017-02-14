/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entitiesDB.UserDB;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Israel Dago
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class UserDao extends AbstractFacade<UserDB> {

    @PersistenceContext(unitName = "server1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserDao() {
        super(UserDB.class);
    }
    
    public UserDB findUserByName(String username){
        Query q = getEntityManager().createNamedQuery("UserDB.findByUsername", UserDB.class);
        q.setParameter("username", username);
        List<UserDB> res = q.getResultList();
        return res.isEmpty()?null:res.get(0);
    }
}
