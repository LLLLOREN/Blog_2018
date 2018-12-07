package com.example.demo.controller;

import com.example.demo.entity.Page;
import com.example.demo.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class PageController {
    @Autowired
    private PageService pageService;

    @PostMapping(value = "/page/findPage")
    public String findPage(Page page, HttpServletRequest request,
                           HttpSession session,Model model){
        String keyword =request.getParameter("keyword");
        session.setAttribute("searches",keyword);
        page.setPage_name(keyword);
        Collection<Page> pages = this.pageService.dofindPage(page);
        model.addAttribute("pages",pages);
        return "Search";
    }
}
