package com.vahtang.testtask.service;

import com.vahtang.testtask.model.User;

import java.util.List;

/**
 * Created by VAH on 08.03.2017.
 */
public interface UserService {
    public void addUser(User user);
    public void updateUser(User user);
    public void removeUser(int id);
    public User getUserById(int id);
    public List<User> listUsers();
    public List<User> findByName(String userName);
}

