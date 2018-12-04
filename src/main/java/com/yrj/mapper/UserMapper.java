package com.yrj.mapper;

import com.yrj.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Integer id);

    @Insert("insert into users(name,age) values(#{name},#{age})")
    void insertUser(@Param("name") String name,@Param("age") Integer age);
}
