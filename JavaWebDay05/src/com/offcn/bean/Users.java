package com.offcn.bean;

import java.util.Date;

public class Users {
    private int id;
    private String username;
    private String password;
    private String name;
    private String telephone;
    private Date birthday;

    public Users() {
    }

    public Users(int id, String username, String password, String name, String telephone, Date brithday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.telephone = telephone;
        this.birthday = brithday;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uname='" + name + '\'' +
                ", phone='" + telephone + '\'' +
                ", brithday=" + birthday +
                '}';
    }
}
