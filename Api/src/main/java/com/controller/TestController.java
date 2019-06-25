package com.controller;

import com.bean.User;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    TestService service1;

    @RequestMapping("/list")
    @ResponseBody
    List<User> list(){
        return service1.list();
    }

    @RequestMapping("/add")
    @ResponseBody
    boolean add(@RequestBody User user){
        return service1.addUser(user);
    }

    @RequestMapping("/delete")
    @ResponseBody
    boolean delete(@RequestBody int id){
        return service1.deleteUserById(id);
    }

    @RequestMapping("/count")
    @ResponseBody
    int count(){
        return service1.count();
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    boolean update(User user){
        return service1.updateUserById(user);
    }
}
