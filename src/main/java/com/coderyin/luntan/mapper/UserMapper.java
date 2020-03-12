package com.coderyin.luntan.mapper;

import com.coderyin.luntan.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user(name,account_id,bio,avatar_url,token,create_date,update_date) values (#{name},#{accountId},#{bio},#{avatarUrl},#{token},#{createDate},#{updateDate})")
    void insert(User user);
    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
