package com.offcn.service;

import com.offcn.bean.User;

import java.util.List;

public interface UserService {
    //创建service接口
    List<User> selectUserAll();
}
