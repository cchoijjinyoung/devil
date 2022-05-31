package com.jinyoung.devil.dao;

import com.jinyoung.devil.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> selectUser();
}
