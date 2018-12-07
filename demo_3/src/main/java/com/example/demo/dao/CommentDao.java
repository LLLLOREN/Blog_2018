package com.example.demo.dao;

import com.example.demo.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface CommentDao {
    // 添加内容
    boolean addComment(Integer page_id,String user_id,String content);
    // 展示内容
    Collection<Comment> findComment(Integer page_id);
}
