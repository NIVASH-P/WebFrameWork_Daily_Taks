package com.homeexample.home.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Home {
    @Id
    private int carId;
    private String carName;
    private String carType;
    private int owners;
    private String curentOwnerName;
    private long mobile;
    private String address;
    public Home() {
    }
    public Home(int carId, String carName, String carType, int owners, String curentOwnerName, long mobile,
            String address) {
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        this.owners = owners;
        this.curentOwnerName = curentOwnerName;
        this.mobile = mobile;
        this.address = address;
    }
    public int getCarId() {
        return carId;
    }
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public int getOwners() {
        return owners;
    }
    public void setOwners(int owners) {
        this.owners = owners;
    }
    public String getCurentOwnerName() {
        return curentOwnerName;
    }
    public void setCurentOwnerName(String curentOwnerName) {
        this.curentOwnerName = curentOwnerName;
    }
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
