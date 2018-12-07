package com.example.demo.controller;

import com.example.demo.entity.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.Map;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/comment/addComment")
    public String addComment(Comment comment,
                             HttpServletRequest request,
                             Map<String,Object> map, HttpSession session){
        Integer id = Integer.parseInt(String.valueOf(session.getAttribute("fatherPage")));
        String username = (String) session.getAttribute("LoginUser");
        String content = request.getParameter("comment");
        if(username==null)
        {
            map.put("msg","请先登录");
            return "Log_in";
        }else if(content==null) {
            map.put("msg","评论不能为空");
        }else{
            comment.setPage_id(id);
            comment.setUser_id(username);
            comment.setContent(content);
            this.commentService.doaddComment(comment);
        }
        if(id==1) {
            return "redirect:/Chinese_drink_A_rice_wine";
        } else if (id==2){
            return "redirect:/Chinese_drink_tea";
        }else if (id==3){
            return "redirect:/Chinese_drink_Usu_beer";
        }else if(id==4){
            return "redirect:/Chinese_home2_What_is_home_cooking";
        }else if(id==5){
            return "redirect:/Chinese_home3_meat_ball_with_soy_sauce";
        }else if(id==6){
            return "redirect:/Chinese_home_buddha_jump_wall";
        }else if(id==7){
            return "redirect:/Chinese_home_Fish_aubergine";
        }else if (id==8){
            return "redirect:/Chinese_hone_2Fried_pork_with_pepper";
        }else if (id==9){
            return "redirect:/food_content";
        }else if(id==10){
            return "redirect:/index";
        }else if(id==11){
            return "redirect:/Log_in";
        }else if(id==12){
            return "redirect:/Personal_profile";
        }else if (id==13){
            return "redirect:/Search";
        }else if (id==14){
            return "redirect:/Sign_in";
        }else if(id==15){
            return "redirect:/Western_drink_cappuccino";
        }else if(id==16){
            return "redirect:/Western_drink_lafite";
        }else if(id==17){
            return "redirect:/Western_food_foiegras";
        } else if (id==18) {
            return "redirect:/Western_food_macaroni";
        }else if(id==19){
            return "redirect:/Western_food_sirloinsteak";
        }else {
            return "redirect:/index";
        }
    }

    @RequestMapping("/findComment")
    public String findComment(HttpSession session,
                                HttpServletRequest request,
                                Comment comment,
                                Model model){
        Integer id = Integer.parseInt(String.valueOf(session.getAttribute("fatherPage")));
        comment.setPage_id(id);
        Collection<Comment> contents = this.commentService.dofindComment(comment);
        model.addAttribute("contents",contents);
        if(id==1) {
            return "Chinese_drink_A_rice_wine";
        } else if (id==2){
            return "Chinese_drink_tea";
        }else if (id==3){
            return "Chinese_drink_Usu_beer";
        }else if(id==4){
            return "Chinese_home2_What_is_home_cooking";
        }else if(id==5){
            return "Chinese_home3_meat_ball_with_soy_sauce";
        }else if(id==6){
            return "Chinese_home_buddha_jump_wall";
        }else if(id==7){
            return "Chinese_home_Fish_aubergine";
        }else if (id==8){
            return "Chinese_hone_2Fried_pork_with_pepper";
        }else if (id==9){
            return "food_content";
        }else if(id==10){
            return "index";
        }else if(id==11){
            return "Log_in";
        }else if(id==12){
            return "Personal_profile";
        }else if (id==13){
            return "Search";
        }else if (id==14){
            return "Sign_in";
        }else if(id==15){
            return "Western_drink_cappuccino";
        }else if(id==16){
            return "Western_drink_lafite";
        }else if(id==17){
            return "Western_food_foiegras";
        } else if (id==18) {
            return "Western_food_macaroni";
        }else if(id==19){
            return "Western_food_sirloinsteak";
        }else {
            return "index";
        }
    }
}
