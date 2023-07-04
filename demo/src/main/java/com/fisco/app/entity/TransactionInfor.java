package com.fisco.app.entity;

public class TransactionInfor {
    private String certificateNUmber;

    private String userName1;

    private int userId1;

    private String signUserId1;

    private String publicAddress1;

    private String userName2;

    private int userId2;

    private String signUserId2;

    private String publicAddress2;

    private int witnessUserId;

    private String witnessSignUserId;

    private String witnessPublicAddress;

    private String status;

    public TransactionInfor(String certificateNUmber, String userName1, int userId1, String signUserId1, String publicAddress1, String userName2, int userId2, String signUserId2, String publicAddress2, int witnessUserId, String witnessSignUserId, String witnessPublicAddress, String status) {
        this.certificateNUmber = certificateNUmber;
        this.userName1 = userName1;
        this.userId1 = userId1;
        this.signUserId1 = signUserId1;
        this.publicAddress1 = publicAddress1;
        this.userName2 = userName2;
        this.userId2 = userId2;
        this.signUserId2 = signUserId2;
        this.publicAddress2 = publicAddress2;
        this.witnessUserId = witnessUserId;
        this.witnessSignUserId = witnessSignUserId;
        this.witnessPublicAddress = witnessPublicAddress;
        this.status = status;
    }

    @Override
    public String toString() {
        return "TransactionInfor{" +
                "certificateNUmber='" + certificateNUmber + '\'' +
                ", userName1='" + userName1 + '\'' +
                ", userId1=" + userId1 +
                ", signUserId1='" + signUserId1 + '\'' +
                ", publicAddress1='" + publicAddress1 + '\'' +
                ", userName2='" + userName2 + '\'' +
                ", userId2=" + userId2 +
                ", signUserId2='" + signUserId2 + '\'' +
                ", publicAddress2='" + publicAddress2 + '\'' +
                ", witnessUserId=" + witnessUserId +
                ", witnessSignUserId='" + witnessSignUserId + '\'' +
                ", witnessPublicAddress='" + witnessPublicAddress + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getCertificateNUmber() {
        return certificateNUmber;
    }

    public void setCertificateNUmber(String certificateNUmber) {
        this.certificateNUmber = certificateNUmber;
    }

    public String getUserName1() {
        return userName1;
    }

    public void setUserName1(String userName1) {
        this.userName1 = userName1;
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public String getSignUserId1() {
        return signUserId1;
    }

    public void setSignUserId1(String signUserId1) {
        this.signUserId1 = signUserId1;
    }

    public String getPublicAddress1() {
        return publicAddress1;
    }

    public void setPublicAddress1(String publicAddress1) {
        this.publicAddress1 = publicAddress1;
    }

    public String getUserName2() {
        return userName2;
    }

    public void setUserName2(String userName2) {
        this.userName2 = userName2;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    public String getSignUserId2() {
        return signUserId2;
    }

    public void setSignUserId2(String signUserId2) {
        this.signUserId2 = signUserId2;
    }

    public String getPublicAddress2() {
        return publicAddress2;
    }

    public void setPublicAddress2(String publicAddress2) {
        this.publicAddress2 = publicAddress2;
    }

    public int getWitnessUserId() {
        return witnessUserId;
    }

    public void setWitnessUserId(int witnessUserId) {
        this.witnessUserId = witnessUserId;
    }

    public String getWitnessSignUserId() {
        return witnessSignUserId;
    }

    public void setWitnessSignUserId(String witnessSignUserId) {
        this.witnessSignUserId = witnessSignUserId;
    }

    public String getWitnessPublicAddress() {
        return witnessPublicAddress;
    }

    public void setWitnessPublicAddress(String witnessPublicAddress) {
        this.witnessPublicAddress = witnessPublicAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
