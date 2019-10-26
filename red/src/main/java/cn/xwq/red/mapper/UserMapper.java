package cn.xwq.red.mapper;

import cn.xwq.red.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    User selectByPrimaryKey(Long userId);

    List<User> selectList();

    int updateByPrimaryKey(User record);
}
