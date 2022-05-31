package com.jinyoung.devil.dao;

import com.jinyoung.devil.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
     public List<User> selectUser() throws Exception;

     public int test2() throws Exception;
}
