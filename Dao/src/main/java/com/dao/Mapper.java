package com.dao;

import com.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mapper {
    public User getUserById(int id);
    public User getUserByName(String name);
    public boolean addUser(User user);
    public boolean deleteUserById(int id);
    public boolean updateUserById(User user);
    public List<User> list();
    public int count();
}
