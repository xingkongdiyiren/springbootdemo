package com.hr.springbootfreemarker.pojo;

/**
 * @author 周恒哲
 * @date 2019/12/12
 **/
public class Users {

    private String username;
    private String usersex;
    private String userage;

    public Users() {
    }

    public Users(String username, String usersex, String userage) {
        this.username = username;
        this.usersex = usersex;
        this.userage = userage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }
}
