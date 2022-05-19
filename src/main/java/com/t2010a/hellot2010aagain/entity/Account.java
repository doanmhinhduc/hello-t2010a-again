package com.t2010a.hellot2010aagain.entity;

public class Account {
    private String username;
    private String password;
    private String Email;
    private String Phone;

    public Account() {

    }

    public Account(String username, String password, String email, String phone) {
        this.username = username;
        this.password = password;
        Email = email;
        Phone = phone;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
