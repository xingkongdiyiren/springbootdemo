package com.hr.springbootmybatis.service;

import com.hr.springbootmybatis.pojo.Users;

import java.util.List;

/**
 * @author 周恒哲
 * @date 2019/12/14
 **/
public interface UsersService {
    void addUsers(Users users);
    List<Users> findUserAll();
    Users preUpdateUsers(Integer id);
    void modifyUsers(Users users);
    void dropUsersById(Integer id);
}
