package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Long> {

//    根据名字获取对象
//    public User findByName();

}
