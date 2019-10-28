package cn.mybatisplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/list")
    public String list(){
        System.out.println("列出信息");
        return "/index.jsp";
    }
}
