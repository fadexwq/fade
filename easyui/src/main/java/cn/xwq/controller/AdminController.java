package cn.xwq.controller;


import cn.xwq.service.AdminService;
import cn.xwq.vo.DataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/addAdmin")
    public String addAdmin(){
        System.out.println("增加管理");
        return "user_manager";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public DataGridResult list(int page,int rows){
        try {
            DataGridResult dataGridResult = adminService.findAdminByPage(page, rows);
            return dataGridResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}














