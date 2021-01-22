package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

public interface UserService{

//    获取所有
    public List<User> getAllUser();

//    获取单个用户
    public User getOneUser(Long id);

//    添加用户
    public void addUser(User user);

//    修改用户
    public void update(Long id,User user);

//    删除用户
    public void delete(Long id);

}
