package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    // 登录
    public User login(String user_id, String user_password);
    // 查询
    public User findID(String user_id);
    // 注册
    public boolean addUser(String user_id,String user_email,String user_password);
}
