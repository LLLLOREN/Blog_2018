package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class RequestController {
    @RequestMapping("/index")
    public String index(HttpSession session)
    {
        session.setAttribute("fatherPage","10");
        return "index";
    }

    @RequestMapping("/")
    public String index2(HttpSession session)
    {
        session.setAttribute("fatherPage","10");
        return "index";
    }

    @RequestMapping("/Personal_profile")
    public String Personal_profile(HttpSession session)
    {
        session.setAttribute("fatherPage","12");
        return "Personal_profile";
    }

    @RequestMapping("/food_content")
    public String food_content(HttpSession session)
    {
        session.setAttribute("fatherPage","9");
        return "food_content";
    }

    @RequestMapping("/food_content_l")
    public String food_content_l(HttpSession session,Map<String,Object>map)
    {
        session.setAttribute("fatherPage","9");
        map.put("msg","用户名密码错误");
        System.out.println(map.isEmpty());
        return "food_content";
    }

    @RequestMapping("/Sign_in")
    public String Sign_in()
    {
        return "Sign_in";
    }

    @RequestMapping("/Log_in")
    public String Log_in()
    {
        return "Log_in";
    }

    @RequestMapping("/Chinese_home2_What_is_home_cooking")
    public String Chinese_home2_What_is_home_cooking(HttpSession session)
    {
        session.setAttribute("fatherPage","4");
        return "redirect:/findComment";
    }

    @RequestMapping("/Chinese_home3_meat_ball_with_soy_sauce")
    public String Chinese_home3_meat_ball_with_soy_sauce(HttpSession session)
    {
        session.setAttribute("fatherPage","5");
        return "redirect:/findComment";
    }

    @RequestMapping("/Chinese_hone_2Fried_pork_with_pepper")
    public String Chinese_hone_2Fried_pork_with_pepper(HttpSession session)
    {
        session.setAttribute("fatherPage","8");
        return "redirect:/findComment";
    }

    @RequestMapping("/Chinese_drink_tea")
    public String Chinese_drink_tea(HttpSession session)
    {
        session.setAttribute("fatherPage","2");
        return "redirect:/findComment";
    }

    @RequestMapping("/Chinese_drink_Usu_beer")
    public String Chinese_drink_Usu_beer(HttpSession session)
    {
        session.setAttribute("fatherPage","3");
        return "redirect:/findComment";
    }

    @RequestMapping("/Western_food_sirloinsteak")
    public String Western_food_sirloinsteak(HttpSession session)
    {
        session.setAttribute("fatherPage","19");
        return "redirect:/findComment";
    }

    @RequestMapping("/Western_food_foiegras")
    public String Western_food_foiegras(HttpSession session)
    {
        session.setAttribute("fatherPage","17");
        return "redirect:/findComment";
    }

    @RequestMapping("/Western_food_macaroni")
    public String Western_food_macaroni(HttpSession session)
    {
        session.setAttribute("fatherPage","18");
        return "redirect:/findComment";
    }

    @RequestMapping("/Western_drink_lafite")
    public String Western_drink_lafite(HttpSession session)
    {
        session.setAttribute("fatherPage","16");
        return "redirect:/findComment";
    }

    @RequestMapping("/Western_drink_cappuccino")
    public String Western_drink_cappuccino(HttpSession session)
    {
        session.setAttribute("fatherPage","15");
        return "redirect:/findComment";
    }

    @RequestMapping("/Chinese_drink_A_rice_wine")
    public String  Chinese_drink_A_rice_wine(HttpSession session)
    {
        session.setAttribute("fatherPage","1");
        return "redirect:/findComment";
    }

    @RequestMapping("/Chinese_home_buddha_jump_wall")
    public String  Chinese_home_buddha_jump_wall(HttpSession session)
    {
        session.setAttribute("fatherPage","6");
        return "redirect:/findComment";
    }

    @RequestMapping("/Chinese_home_Fish_aubergine")
    public String  Chinese_home_Fish_aubergine(HttpSession session)
    {
        session.setAttribute("fatherPage","7");
        return "redirect:/findComment";
    }

    @RequestMapping("/Search")
    public String  Search(HttpSession session)
    {
        session.setAttribute("fatherPage","13");
        return "Search";
    }

    @RequestMapping("/{id}")
    public String getID(@PathVariable("id") Integer id)
    {
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
}
