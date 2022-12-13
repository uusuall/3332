package com.test.service;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.test.util.JsonResponseBody;
import com.test.util.JsonResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public JsonResponseBody<User> login(User user) {
        User login = userMapper.login(user);
        if(null==login)
        {
            return new JsonResponseBody(JsonResponseStatus.NULLACCOUNT.getCode(),JsonResponseStatus.NULLACCOUNT.getMsg());
        }else
        {
            if(user.getUpwd().equals(login.getUpwd()))
            {
                return new JsonResponseBody(login);
            }else
            {
                return new JsonResponseBody(JsonResponseStatus.PWDERROR.getCode(),JsonResponseStatus.PWDERROR.getMsg());
            }
        }

    }

    @Override
    public JsonResponseBody<User> register(User user) {

        User login = userMapper.login(user);

        if (null != login) {
            System.out.println(1);
            return new JsonResponseBody(JsonResponseStatus.ACCOUNTEXIT.getCode(), JsonResponseStatus.ACCOUNTEXIT.getMsg());
        } else {
            User regi = userMapper.register(user);
            System.out.println(2);
            return new JsonResponseBody(JsonResponseStatus.SUCCESS.getCode(), JsonResponseStatus.SUCCESS.getMsg());
        }
    }
}
