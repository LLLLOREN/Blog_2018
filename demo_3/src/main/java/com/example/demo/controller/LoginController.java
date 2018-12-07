package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/login")
    public String login(User user, HttpSession session,
                        HttpServletRequest request,
                        Map<String,Object>map){
        String user_id = request.getParameter("username");
        String user_password = request.getParameter("password");
        Integer id = Integer.parseInt(String.valueOf(session.getAttribute("fatherPage")));
        user.setUser_id(user_id);
        user.setUser_password(user_password);
        user = this.userService.dologin(user);
        if(user!= null){
            session.setAttribute("LoginUser",user_id);
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
        else{
            map.put("msg","用户名密码错误");
            return "Log_in";
        }
    }

    @PostMapping(value = "/user/register")
    public String register(User user,HttpServletRequest request,
                           Map<String,Object> map,HttpSession session){
        String user_id = request.getParameter("username");
        String user_email = request.getParameter("email");
        String user_password = request.getParameter("password");
        Integer id = Integer.parseInt(String.valueOf(session.getAttribute("fatherPage")));
        user.setUser_id(user_id);
        user.setUser_email(user_email);
        user.setUser_password(user_password);
        User u = this.userService.dofindID(user);
        if(u==null){
            this.userService.doaddUser(user);
            session.setAttribute("LoginUser",user_id);
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
        }else {
            map.put("msg","用户名已被注册");
            return "Sign_in";
        }
    }
}
