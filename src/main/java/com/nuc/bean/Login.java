package com.nuc.bean;

public class Login {
    private int id;
    //账号
    private String accountNumber;
    private int phone;
    private String email;
    private int qq;
    private String weChat;
    private String password;
    //状态
    private int status;

    public Login() {

    }

    public Login(String accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", qq=" + qq +
                ", weChat='" + weChat + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
