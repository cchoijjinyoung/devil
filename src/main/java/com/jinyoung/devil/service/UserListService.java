package com.jinyoung.devil.service;

import com.jinyoung.devil.domain.User;

import java.util.List;

public interface UserListService {
    List<User> findUser() throws Exception;

    int test2() throws Exception;

}
