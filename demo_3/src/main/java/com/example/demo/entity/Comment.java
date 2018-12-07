package com.example.demo.entity;

public class Comment {
    private Integer page_id;
    private String user_id;
    private String content;

    public Integer getPage_id() {
        return page_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getContent() {
        return content;
    }

    public void setPage_id(Integer page_id) {
        this.page_id = page_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "page_id=" + page_id +
                ", user_id='" + user_id + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
