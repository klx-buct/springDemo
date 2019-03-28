package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * @description: 访问user数据库接口
 * @author: klx
 * @create: 2019-03-28 19:15
 **/
public interface UserMapper {
    @Insert("INSERT INTO user(username, password, content) VALUES(#{username}, #{password}, #{content})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(User user);
}
