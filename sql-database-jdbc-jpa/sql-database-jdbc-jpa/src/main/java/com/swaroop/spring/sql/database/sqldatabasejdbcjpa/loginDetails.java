package com.swaroop.spring.sql.database.sqldatabasejdbcjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class loginDetails {

    @Id
    @GeneratedValue
    private String username;
    private String password;

    public loginDetails(){

    }

    public loginDetails(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "loginDetails{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
