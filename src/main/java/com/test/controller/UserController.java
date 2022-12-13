package com.test.controller;

import com.test.model.User;
import com.test.service.IUserService;
import com.test.util.JsonResponseBody;
import com.test.util.JsonResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public JsonResponseBody login(User user)
    {
        return userService.login(user);
    }

    @RequestMapping("/regi")
    public JsonResponseBody register(User user)
    {

        return userService.register(user);
    }


}
