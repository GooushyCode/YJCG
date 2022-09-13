package com.yijia.management.vo;

public class Order {
    private int id;
    private int orderno;
    private String name;
    private int phone;
    private String address;
    private int status;
    private String disigner;
    private String desc;
    private int allPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderno() {
        return orderno;
    }

    public void setOrderno(int orderno) {
        this.orderno = orderno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDisigner() {
        return disigner;
    }

    public void setDisigner(String disigner) {
        this.disigner = disigner;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(int allPrice) {
        this.allPrice = allPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderno=" + orderno +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", disigner='" + disigner + '\'' +
                ", desc='" + desc + '\'' +
                ", allPrice=" + allPrice +
                '}';
    }
}
