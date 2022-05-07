package com.offcn.dao;

import com.offcn.bean.UserList;

import java.util.List;

public interface UserListDao {
    //查询全部数据
    List<UserList> selectUserListAll();

    //删除数据
    int deleteUserListById(int id);

}
