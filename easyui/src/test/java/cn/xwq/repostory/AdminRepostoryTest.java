package cn.xwq.repostory;

import cn.xwq.pojo.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AdminRepostoryTest {

    @Autowired
    private AdminRepostory adminRepostory;

    @Test
    public void findAll(){
        List<Admin> admins = adminRepostory.findByPage(0, 5);
        for (Admin admin : admins) {
            System.out.println("管理员" + admin.getAdminName());
        }
    }
}