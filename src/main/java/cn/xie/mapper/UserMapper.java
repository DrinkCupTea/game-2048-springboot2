package cn.xie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Select;

import cn.xie.entity.User;

public interface UserMapper extends BaseMapper<User>{
    @Select("select * from users where username = #{username}")
    public User selectByUsername(String username);
}
