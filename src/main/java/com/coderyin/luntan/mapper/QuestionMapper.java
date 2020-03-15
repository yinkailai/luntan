package com.coderyin.luntan.mapper;

import com.coderyin.luntan.model.Question;
import com.coderyin.luntan.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    /**
     * 发布问题
     * @param question
     */
    @Insert("insert into question(title,content,creator,tag,create_date,update_date)" +
            "values(#{title},#{content},#{creator.id},#{tag},#{createDate},#{updateDate})")
    void create(Question question);

    /**
     * 查出所有问题
     * @return
     */
    @Select("select * from question")
    List<Question> findAllList();

    /**
     * 根据登录用户查问题
     * @param user
     * @return
     */
    @Select("select * from question where creator = #{id}")
    List<Question> findListByUser(User user);

    /**
     * 根据id查找
     * @param qid
     * @return
     */
    @Select("select * from question where id = #{qid}")
    Question findById(@Param("qid") Integer qid);
}
