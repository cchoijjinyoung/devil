package com.jinyoung.devil.service.impl;

import com.jinyoung.devil.dao.UserDao;
import com.jinyoung.devil.domain.User;
import com.jinyoung.devil.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserListServiceImpl implements UserListService {

    @Autowired
    UserDao userDao;
    @Override
    public int findUser() throws Exception {
        return userDao.selectUser();
    }
}
