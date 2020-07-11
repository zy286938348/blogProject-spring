package com.nuc.bean;

import java.util.Date;

public class User {
    //流水id
    private int id;
    //登录id
    private int lId;
    //头像
    private String portrait;
    //昵称
    private String nickName;
    //姓名
    private String name;
    private Date birthday;
    private int sex;
    private String school;
    //注册时间
    private Date registrationTime;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lId=" + lId +
                ", portrait='" + portrait + '\'' +
                ", nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", school='" + school + '\'' +
                ", registrationTime=" + registrationTime +
                '}';
    }
}
