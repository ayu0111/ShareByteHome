package com.offcn.dao;



import com.offcn.bean.User;
import com.offcn.bean.Users;

import java.util.List;

public interface UsersDao {

   //注册(添加)数据
   int insertUser(Users user);

   //查询全部数据
   List<Users> selectUsersAll();

   //根据Id查询数据
   Users selectUsersById(int id);

   //更新数据
   int upDateUsers(Users user);

   //根据id删除书据
   int deleteUsers(int id);

   //通过用户名密码查询(登录)
   Users selectByUsernameAndPassword(String username,String password);
}
