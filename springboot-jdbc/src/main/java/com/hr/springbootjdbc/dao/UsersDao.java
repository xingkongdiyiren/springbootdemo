package com.hr.springbootjdbc.dao;

import com.hr.springbootjdbc.pojo.Users;

import java.util.List;

/**
 * @author 周恒哲
 * @date 2019/12/13
 **/
public interface UsersDao {
    /**
     * 添加用户
     * @param users
     */
    public void insert(Users users);

    /**
     * 查询所有用户
     * @return
     */
    List<Users> selectAllUser();

    /**
     * 根据id查询单个用户
     * @param userid
     * @return
     */
    Users selectUserById(Integer userid);

    /**
     * 更新用户
     * @param users
     */
    void updateUser(Users users);

    /**
     * 删除用户
     * @param userid
     */
    void deleteUser(Integer userid);
}
