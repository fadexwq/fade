package cn.xwq.red.test;

import cn.xwq.red.mapper.UserMapper;
import cn.xwq.red.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void insert() {

        User user = new User();
        user.setName("sss");
        user.setAge(23);
        user.setPassword("123");
        userMapper.insert(user);
    }

    @Test
    public void delete(){
        userMapper.deleteByPrimaryKey(11L);
    }


}