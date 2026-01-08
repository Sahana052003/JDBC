package com.xworkz.rapidoinst.dto;

import java.util.Objects;

public class RapidoUserDTO {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private long phoneNUmber;
    private String pincode;
    private int noOfUser;
    private int otp;
    private double price;

    public RapidoUserDTO(int id, String name, String lastName, int age, String email, long phoneNUmber, String pincode, int noOfUser, int otp, double price) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNUmber = phoneNUmber;
        this.pincode = pincode;
        this.noOfUser = noOfUser;
        this.otp = otp;
        this.price = price;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(long phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getNoOfUser() {
        return noOfUser;
    }

    public void setNoOfUser(int noOfUser) {
        this.noOfUser = noOfUser;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RapidoUserDTO)) return false;
        RapidoUserDTO that = (RapidoUserDTO) o;
        return id == that.id && age == that.age && noOfUser == that.noOfUser &&
                otp == that.otp && Double.compare(price, that.price) == 0 &&
                Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName)
                && Objects.equals(email, that.email) && Objects.equals(phoneNUmber, that.phoneNUmber)
                && Objects.equals(pincode, that.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, age, email, phoneNUmber, pincode, noOfUser, otp, price);
    }

    @Override
    public String toString() {
        return "RapidoUserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNUmber='" + phoneNUmber + '\'' +
                ", pincode='" + pincode + '\'' +
                ", noOfUser=" + noOfUser +
                ", otp=" + otp +
                ", price=" + price +
                '}';
    }
}