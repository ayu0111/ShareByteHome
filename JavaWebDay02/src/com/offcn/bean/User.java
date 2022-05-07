package com.offcn.bean;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private String uname;
    private String phone;
    private Date brithday;

    public User() {
    }

    public User(int id, String username, String password, String uname, String phone, Date brithday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.uname = uname;
        this.phone = phone;
        this.brithday = brithday;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uname='" + uname + '\'' +
                ", phone='" + phone + '\'' +
                ", brithday=" + brithday +
                '}';
    }
}
