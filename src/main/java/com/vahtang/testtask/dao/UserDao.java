package com.vahtang.testtask.dao;

import com.vahtang.testtask.model.User;

import java.util.List;

/**
 * Created by VAH on 07.03.2017.
 */
public interface UserDao {
    public void addUser(User user);
    public void updateUser(User user);
    public void removeUser(int id);
    public User getUserById(int id);
    public List<User> listUsers();
    public List<User> findByName(String userName);
}
