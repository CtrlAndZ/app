package com.xzfw.app.entity;

import java.util.List;

/**
 * 用户实体类
 * @author 刘靖
 */

public class User {

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号码
     */
    private String iphone;

    /**
     * 用户密码
     */
    private String passWord;

    /**
     * 交易密码
     */
    private String tsPassword;

    /**
     * 头像链接
     */
    private String headUrl;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getTsPassword() {
        return tsPassword;
    }

    public void setTsPassword(String tsPassword) {
        this.tsPassword = tsPassword;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", iphone='" + iphone + '\'' +
                ", passWord='" + passWord + '\'' +
                ", tsPassword='" + tsPassword + '\'' +
                ", headUrl='" + headUrl + '\'' +
                '}';
    }
}
