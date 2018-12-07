package com.example.demo.service;


import com.example.demo.dao.CommentDao;
import com.example.demo.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CommentService {
    @Autowired
    private CommentDao commentDao;

    public boolean doaddComment(Comment comment){
        boolean flag = this.commentDao.addComment(comment.getPage_id(),comment.getUser_id(),comment.getContent());
        return flag;
    }

    public Collection<Comment> dofindComment(Comment comment){
        Collection<Comment> comments = this.commentDao.findComment(comment.getPage_id());
        return comments;
    }
}
