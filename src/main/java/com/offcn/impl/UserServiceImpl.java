package com.offcn.impl;

import com.offcn.dao.UserDao;
import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;


    @Override
    public List<User> getAllUser() {
        return userDao.findAll();
    }

    @Override
    public User getOneUser(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public void update(Long id, User user) {
        user.setId(id);
        userDao.saveAndFlush(user);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}
