package me.tianle.login.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotBlank;

public class User {
    private String name;
    private String password;
    private String phonenum;
    private String email;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @NotBlank(message = "用户名不能为空")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message = "密码不能为空")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
