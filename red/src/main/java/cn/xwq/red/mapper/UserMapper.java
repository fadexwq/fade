package cn.xwq.red.mapper;

import cn.xwq.red.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Delete("delete from user where id = #{id}")
    int deleteByPrimaryKey(Long userId);

    @Insert("insert into user(id,name password,age) values(#{id},#{name},#{password},#{age})")
    int insert(User record);

    @Select("select * from user where id = #{id}")
    User selectByPrimaryKey(Long userId);

    @Select("select * from user")
    List<User> selectList();

    @Update("")
    int updateByPrimaryKey(User record);
}
