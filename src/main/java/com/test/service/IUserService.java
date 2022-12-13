package com.test.service;

import com.test.model.User;
import com.test.util.JsonResponseBody;
import org.springframework.stereotype.Service;


public interface IUserService {
    JsonResponseBody<User> login(User user);
    JsonResponseBody<User> register(User user);
}
