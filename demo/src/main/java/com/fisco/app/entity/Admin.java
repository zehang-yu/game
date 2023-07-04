package com.fisco.app.entity;

public class Admin {
    private int id;

    private String name;

    private String password;

    private String signUserId;

    //公钥地址
    private String publicAddress;

    public Admin(int id, String name, String password, String signUserId, String publicAddress) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.signUserId = signUserId;
        this.publicAddress = publicAddress;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", signUserId='" + signUserId + '\'' +
                ", publicAddress='" + publicAddress + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSignUserId() {
        return signUserId;
    }

    public void setSignUserId(String signUserId) {
        this.signUserId = signUserId;
    }

    public String getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }
}
