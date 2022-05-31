package com.jinyoung.devil.controller;

import com.jinyoung.devil.domain.User;
import com.jinyoung.devil.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserListService userListService;

    @GetMapping("/hello")
    public String userList(Model model) throws Exception {
        List<User> user = userListService.findUser();
        model.addAttribute("user", user);
        return "hello";
    }
}
