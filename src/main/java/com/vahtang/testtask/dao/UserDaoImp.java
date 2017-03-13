package com.vahtang.testtask.dao;

import com.vahtang.testtask.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by VAH on 07.03.2017.
 */

@Repository
public class UserDaoImp implements UserDao{
    Logger logger = LoggerFactory.getLogger(UserDaoImp.class);

    private SessionFactory sessionFactory; //The entity for connecting to Data Base

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
        logger.info("User saved. User details: " + user );
    }

    @Override
    public void updateUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
        logger.info("User update. User details: " + user);
    }

    @Override
    public void removeUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User)session.load(User.class, new Integer(id));

        if (user != null){
            session.delete(user);
        }

        logger.info("User removed. User details: " + user);
    }

    @Override
    public User getUserById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User)session.load(User.class, new Integer(id));
        logger.info("User loaded. User details: " + user);
        return user;
    }

    @Override
    @SuppressWarnings("uncheked")
    public List<User> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> userList = session.createQuery("from User").list();

        for (User user : userList){
            logger.info("User list: " + user);
        }
        return userList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> findByName(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> userList = new ArrayList<User>();
        List<User> sessonUserList = session.createQuery("from User where name like :userName").
                setParameter("userName", "%" + userName + "%").list();

        for(User user: sessonUserList){
            if (user.getUserName().equalsIgnoreCase(userName)){
                userList.add(user);
            }
            else {
                break;
            }
            logger.info("User list " + user);
        }
        return userList;

    }

}
