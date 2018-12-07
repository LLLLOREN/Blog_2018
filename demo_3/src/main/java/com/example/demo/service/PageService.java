package com.example.demo.service;

import com.example.demo.dao.PageDao;
import com.example.demo.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PageService {
    @Autowired
    private PageDao pageDao;

    public Collection<Page> dofindPage(Page page){
        Collection<Page> pages = this.pageDao.findPage(page.getPage_name());
        return pages;
    }
}
