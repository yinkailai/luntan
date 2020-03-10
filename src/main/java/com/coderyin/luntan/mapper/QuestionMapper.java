package com.coderyin.luntan.mapper;

import com.coderyin.luntan.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title,content,creator,tag,create_date,update_date)" +
            "values(#{title},#{content},#{creator.id},#{tag},#{createDate},#{updateDate})")
    void create(Question question);
}
