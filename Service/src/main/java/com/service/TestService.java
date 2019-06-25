package com.service;

import com.bean.User;
import com.dao.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    Mapper mapper;

    public User getUserById(int id){
        return mapper.getUserById(id);
    }

    public User getUserByName(String name){
        return mapper.getUserByName(name);
    }

    public boolean addUser(User user){
        return mapper.addUser(user);
    }

    public boolean deleteUserById(int id){
        return mapper.deleteUserById(id);
    }

    public boolean updateUserById(User user){
        return mapper.updateUserById(user);
    }

    public List<User> list(){
        return mapper.list();
    }

    public int count(){
        return mapper.count();
    }
}
