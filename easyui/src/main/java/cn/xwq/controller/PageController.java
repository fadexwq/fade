package cn.xwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping(value = "{page}")
    public String showPage(@PathVariable String page){
        System.out.println("页面跳转" + page);
        return page;
    }

}
