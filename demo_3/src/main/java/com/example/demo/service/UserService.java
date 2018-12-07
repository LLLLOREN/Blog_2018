package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User dologin(User user){
        user = this.userDao.login(user.getUser_id(),user.getUser_password());
        return user;
    }

    public boolean doaddUser(User user){
        boolean flag = this.userDao.addUser(user.getUser_id(),user.getUser_email(),user.getUser_password());
        return flag;
    }

    public User dofindID(User user){
            user = this.userDao.findID(user.getUser_id());
            return user;
    }
}
