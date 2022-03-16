package cn.xie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.xie.domain.User;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM users WHERE username = #{username}")
    public User getByUsername(String username);
}
