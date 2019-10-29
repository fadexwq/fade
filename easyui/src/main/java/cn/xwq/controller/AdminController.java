package cn.xwq.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/addAdmin")
    public String addAdmin(){
        System.out.println("增加管理");
        return "user_manager";
    }
}
