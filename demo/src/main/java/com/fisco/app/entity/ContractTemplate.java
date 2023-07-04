package com.fisco.app.entity;

import java.security.SecureRandom;

public class ContractTemplate {
    private int id;

    private String contractName;

    private String contractAbi;

    private String contractBin;

    private String contractBase64;

    private String contractAddress;

    public ContractTemplate(int id, String contractName, String contractAbi, String contractBin, String contractBase64, String contractAddress) {
        this.id = id;
        this.contractName = contractName;
        this.contractAbi = contractAbi;
        this.contractBin = contractBin;
        this.contractBase64 = contractBase64;
        this.contractAddress = contractAddress;
    }

    @Override
    public String toString() {
        return "ContractTemplate{" +
                "id=" + id +
                ", contractName='" + contractName + '\'' +
                ", contractAbi='" + contractAbi + '\'' +
                ", contractBin='" + contractBin + '\'' +
                ", contractBase64='" + contractBase64 + '\'' +
                ", contractAddress='" + contractAddress + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractAbi() {
        return contractAbi;
    }

    public void setContractAbi(String contractAbi) {
        this.contractAbi = contractAbi;
    }

    public String getContractBin() {
        return contractBin;
    }

    public void setContractBin(String contractBin) {
        this.contractBin = contractBin;
    }

    public String getContractBase64() {
        return contractBase64;
    }

    public void setContractBase64(String contractBase64) {
        this.contractBase64 = contractBase64;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }
}
