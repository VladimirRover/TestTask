package com.vahtang.testtask.model;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by VAH on 07.03.2017.
 */


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String userName;

    @Column(name = "age")
    private int userAge;


    @Column(name = "createDate")
    @DateTimeFormat(pattern = "yy-MM-dd HH:mm:ss")
    private Date createDate;


    @Column(name = "isAdmin")
    @Type(type = "org.hibernate.type.BooleanType")
    private Boolean admin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", createDate=" + createDate +
                ", admin=" + admin +
                '}';
    }
}
