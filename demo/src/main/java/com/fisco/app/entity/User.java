package com.fisco.app.entity;

public class User {
    private int id;

    private String username;

    private String signUserId;

    private String publicAddress;

    private String privateKey;

    private String status;

    public User() {
    }

    public User(int id, String username, String signUserId, String publicAddress, String privateKey, String status) {
        this.id = id;
        this.username = username;
        this.signUserId = signUserId;
        this.publicAddress = publicAddress;
        this.privateKey = privateKey;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", signUserId='" + signUserId + '\'' +
                ", publicAddress='" + publicAddress + '\'' +
                ", privateKey='" + privateKey + '\'' +
                ", status='" + status + '\'' +
                '}';
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

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
