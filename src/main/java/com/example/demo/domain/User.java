package com.example.demo.domain;

/**
* @Description: User实体
* @Author: klx
* @Date: 2019/3/28
*/
public class User {
    private int id;

    private String username;

    private String password;

    private String content;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String psw) {
        this.password = psw;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String c) {
        this.content = c;
    }
}
