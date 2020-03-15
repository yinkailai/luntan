package com.coderyin.luntan.mapper;

import com.coderyin.luntan.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    /**
     * 增加用户
     * @param user
     */
    @Insert("insert into user(name,account_id,bio,avatar_url,token,create_date,update_date) values (#{name},#{accountId},#{bio},#{avatarUrl},#{token},#{createDate},#{updateDate})")
    void insert(User user);

    /**
     * 根据token查找用户
     * @param token
     * @return
     */
    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    /**
     * 根据账户id查找用户
     * @param user
     * @return
     */
    @Select("select * from user where account_id = #{accountId}")
    User findByAccountId(User user);

    /**
     * 更新用户
     * @param user
     */
    @Update("update user set avatar_url = #{avatarUrl},name = #{name}," +
            "bio = #{bio},token = #{token},update_date = #{updateDate} where id = #{id}")
    void update(User user);
}
