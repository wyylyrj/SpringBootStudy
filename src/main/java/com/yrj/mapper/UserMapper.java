package com.yrj.mapper;

import com.yrj.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users where id = #{id}")
    User getUserById(@Param("id") Integer id);

    @Select("select * from users")
    List<User> getUserAll();

    @Insert("insert into users(name,age) values(#{name},#{age})")
    void insertUser(@Param("name") String name,@Param("age") Integer age);

    @Update("update users set name = #{name},age = #{age} where id = #{id}")
    void updateUser(@Param("id") Integer id,@Param("name") String name,@Param("age") Integer age);

    @Delete("delete from users where id = #{id}")
    void delUser(@Param("id") Integer id);
}
