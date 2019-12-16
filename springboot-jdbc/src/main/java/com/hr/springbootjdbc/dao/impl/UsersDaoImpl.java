package com.hr.springbootjdbc.dao.impl;

import com.hr.springbootjdbc.dao.UsersDao;
import com.hr.springbootjdbc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 用户管理持久层
 * @author 周恒哲
 * @date 2019/12/13
 **/
@Repository
public class UsersDaoImpl implements UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加用户
     * @param users
     */
    @Override
    public void insert(Users users) {
        String sql="insert into users(username,usersex) values(?,?)";
        this.jdbcTemplate.update(sql,users.getUsername(),users.getUsersex());
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Users> selectAllUser() {
        String sql="select * from users";
        return this.jdbcTemplate.query(sql, new RowMapper<Users>() {
            /**
             * 结果集的映射
             * @param resultSet
             * @param i
             * @return
             * @throws SQLException
             */
            @Override
            public Users mapRow(ResultSet resultSet, int i) throws SQLException {
                Users users=new Users();
                users.setUserid(resultSet.getInt("userid"));
                users.setUsername(resultSet.getString("username"));
                users.setUsersex(resultSet.getString("usersex"));
                return users;
            }
        });
    }

    /**
     * 根据id查询用户
     * @param userid
     * @return
     */
    @Override
    public Users selectUserById(Integer userid) {
        Users user = new Users();
        String sql="select * from users where userid=?";
        Object[] arr=new Object[]{userid};
        this.jdbcTemplate.query(sql, arr, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setUsername(resultSet.getString("username"));
                user.setUsersex(resultSet.getString("usersex"));
                user.setUserid(resultSet.getInt("userid"));
            }
        });
        return user;
    }

    @Override
    public void updateUser(Users users) {
        String sql="update users set username=? , usersex=? where userid=?";
        this.jdbcTemplate.update(sql,users.getUsername(),users.getUsersex(), users.getUserid());
    }

    @Override
    public void deleteUser(Integer userid) {
        String sql="delete from users where userid=?";
        this.jdbcTemplate.update(sql,userid);
    }
}
