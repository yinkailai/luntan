package com.coderyin.luntan.mapper;

import com.coderyin.luntan.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user(name,account_id,token,create_date,update_date) values (#{name},#{accountId},#{token},#{createDate},#{updateDate})")
    void isnert(User user);
}
