package com.coderyin.luntan.mapper;

import com.coderyin.luntan.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
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
    @Select("select * from question")
    List<Question> findAllList();
}
