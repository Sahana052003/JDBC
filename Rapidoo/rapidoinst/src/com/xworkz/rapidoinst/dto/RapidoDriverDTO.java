package com.xworkz.rapidoinst.dto;

import java.util.Objects;

public class RapidoDriverDTO {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private long adharNumber;
    private long mobile;
    private String experience;
    private String location;
    private double price;

    @Override
    public String toString() {
        return "RapidoDriverDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", adharNumber='" + adharNumber + '\'' +
                ", mobile='" + mobile + '\'' +
                ", experience='" + experience + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RapidoDriverDTO)) return false;
        RapidoDriverDTO that = (RapidoDriverDTO) o;
        return id == that.id && age == that.age && Double.compare(price, that.price) == 0 && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(adharNumber, that.adharNumber) && Objects.equals(mobile, that.mobile) && Objects.equals(experience, that.experience) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, age, email, adharNumber, mobile, experience, location, price);
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

    public String getemail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(long adharNumber) {
        this.adharNumber = adharNumber;
    }

    public long getmobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RapidoDriverDTO(int id, String name, String lastName, int age, String email,
                           long adharNumber, long mobile, String experience, String location, double price) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.adharNumber = adharNumber;
        this.mobile = mobile;
        this.experience = experience;
        this.location = location;
        this.price = price;
    }
}
