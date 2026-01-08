package com.xworkz.rapidoinst.dto;

import java.util.Objects;

public class RapidoBookingDTO {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String location;
    private long phoneNUmber;
    private String vehicleNumber;
    private String gender;
    private String customerName;
    private double price;

    @Override
    public String toString() {
        return "RapidoBookingDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", phoneNUmber='" + phoneNUmber + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", customerName='" + customerName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RapidoBookingDTO)) return false;
        RapidoBookingDTO that = (RapidoBookingDTO) o;
        return id == that.id && age == that.age && Double.compare(price, that.price) == 0 && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(location, that.location) && Objects.equals(phoneNUmber, that.phoneNUmber) && Objects.equals(vehicleNumber, that.vehicleNumber) && Objects.equals(gender, that.gender) && Objects.equals(customerName, that.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, age, location, phoneNUmber, vehicleNumber, gender, customerName, price);
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(long phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RapidoBookingDTO(int id, String name, String lastName, int age, String location, long phoneNUmber, String vehicleNumber, String gender, String customerName, double price) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.phoneNUmber = phoneNUmber;
        this.vehicleNumber = vehicleNumber;
        this.gender = gender;
        this.customerName = customerName;
        this.price = price;
    }
}
