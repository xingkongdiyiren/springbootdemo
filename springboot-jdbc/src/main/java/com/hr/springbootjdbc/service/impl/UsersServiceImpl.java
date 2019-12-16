package com.hr.springbootjdbc.service.impl;

import com.hr.springbootjdbc.dao.UsersDao;
import com.hr.springbootjdbc.pojo.Users;
import com.hr.springbootjdbc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户管理业务层
 * @author 周恒哲
 * @date 2019/12/13
 **/
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    /**
     * 添加用户
     * @param users
     */
    @Override
    @Transactional
    public void addUser(Users users) {
        this.usersDao.insert(users);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Users> findAllUsers() {
        return this.usersDao.selectAllUser();
    }

    /**
     * 根据id查询用户
     * @param userid
     * @return
     */
    @Override
    public Users selectUserById(Integer userid) {
        return this.usersDao.selectUserById(userid);
    }

    /**
     * 修改用户
     * @param users
     */
    @Override
    public void updateUser(Users users) {
        this.usersDao.updateUser(users);
    }

    /**
     * 删除用户
     * @param userid
     */
    @Override
    public void deleteUser(Integer userid) {
        this.usersDao.deleteUser(userid);
    }
}
