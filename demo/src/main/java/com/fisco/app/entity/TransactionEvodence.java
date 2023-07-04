package com.fisco.app.entity;

public class TransactionEvodence {
    private int id;

    //存证key
    private String evidenceKey;

    //存证value
    private String evidenceValue;

    private String needSigners;

    private String hasSigners;

    private String txId;

    public TransactionEvodence(int id, String evidenceKey, String evidenceValue, String needSigners, String hasSigners, String txId) {
        this.id = id;
        this.evidenceKey = evidenceKey;
        this.evidenceValue = evidenceValue;
        this.needSigners = needSigners;
        this.hasSigners = hasSigners;
        this.txId = txId;
    }

    @Override
    public String toString() {
        return "TransactionEvodence{" +
                "id=" + id +
                ", evidenceKey='" + evidenceKey + '\'' +
                ", evidenceValue='" + evidenceValue + '\'' +
                ", needSigners='" + needSigners + '\'' +
                ", hasSigners='" + hasSigners + '\'' +
                ", txId='" + txId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvidenceKey() {
        return evidenceKey;
    }

    public void setEvidenceKey(String evidenceKey) {
        this.evidenceKey = evidenceKey;
    }

    public String getEvidenceValue() {
        return evidenceValue;
    }

    public void setEvidenceValue(String evidenceValue) {
        this.evidenceValue = evidenceValue;
    }

    public String getNeedSigners() {
        return needSigners;
    }

    public void setNeedSigners(String needSigners) {
        this.needSigners = needSigners;
    }

    public String getHasSigners() {
        return hasSigners;
    }

    public void setHasSigners(String hasSigners) {
        this.hasSigners = hasSigners;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }
}
