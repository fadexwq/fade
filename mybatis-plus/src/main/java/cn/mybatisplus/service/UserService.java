package cn.mybatisplus.service;

import cn.mybatisplus.mapper.UserMapper;
import cn.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    
    public void insert(){
        User user=new User();
        user.setName("杨过");
        user.setPassword("123");
        user.setAge(23);
        userMapper.insert(user);
    }

    
    public void deleteById(){
        int i = userMapper.deleteById(1);
        System.out.println(i);
    }

    
    public void deleteByName(){
        //条件作为删除、更新使用UpdateWrapper、如果查询的条件使用QueryWrapper作为条件
        UpdateWrapper<User> wrapper=new UpdateWrapper<>();
        wrapper.eq("name", "杨过");
        int i = userMapper.delete(wrapper);
        System.out.println(i);
    }

    
    public void update(){
        //注意事项：更新的时候，如果属性值为null那么久不会更新。
        User user=new User();
        user.setName("小龙女");
        user.setId(12);

        userMapper.updateById(user);
    }

    
    public void findById(){
        User user = userMapper.selectById(2);
        System.out.println("用户名："+user.getName());
    }

    
    public void findByName(){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name", "%雪%");
        List<User> users = userMapper.selectList(queryWrapper);
        for (User user : users) {
            System.out.println("用户名："+user.getName());
        }

    }

    
    public void findByPage(){
        IPage<User> page = userMapper.selectPage(new Page<>(0, 5), null);
        List<User> users = page.getRecords();
        for (User user : users) {
            System.out.println("用户名："+user.getName());
        }

    }

    
    public  void findUsers(){
        List<Map<String, Object>> users = userMapper.findUsers();
        for (Map<String, Object> user : users) {
            System.out.println("用户名："+user.get("name"));
        }

    }
    
}
