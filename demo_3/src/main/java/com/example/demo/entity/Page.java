package com.example.demo.entity;

public class Page {
    private Integer page_id;
    private String page_name;
    private String content;

    public Integer getPage_id() {
        return page_id;
    }

    public String getPage_name() {
        return page_name;
    }

    public String getContent() {
        return content;
    }

    public void setPage_id(Integer page_id) {
        this.page_id = page_id;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Page{" +
                "page_id=" + page_id +
                ", page_name='" + page_name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
