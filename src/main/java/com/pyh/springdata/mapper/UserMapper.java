package com.pyh.springdata.mapper;

import com.pyh.springdata.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Insert("insert into user values(2,'haohao');")
    public void maddUser();

    @Select("select * from user;")
    public List<User> mselectUser();

    @Update("update user set name='xixi' where id=2;")
    public void mupdateUser();

    @Delete("delete from user where id=2;")
    public void mdeleteUser();
}
