package cn.xwq.red.service;

import cn.xwq.red.pojo.User;

import java.util.List;

public interface UserService {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    User selectByPrimaryKey(Long userId);

    List<User> selectList();

    int updateByPrimaryKey(User record);
}
