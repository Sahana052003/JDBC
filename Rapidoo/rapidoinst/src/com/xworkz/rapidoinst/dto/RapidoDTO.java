package com.xworkz.rapidoinst.dto;

import java.util.Objects;

public class RapidoDTO{
    private int id;
    private String name;
    private String appVersion;
    private int age;
    private String email;
    private long phoneNumber;
    private String languages;
    private String country;
    private String joinDate;
    private double price;

    @Override
    public String toString() {
        return "RapidoDTO{" +
                "appVersion='" + appVersion + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNUmber='" + phoneNumber + '\'' +
                ", languages='" + languages + '\'' +
                ", country='" + country + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RapidoDTO)) return false;
        RapidoDTO rapidoDTO = (RapidoDTO) o;
        return id == rapidoDTO.id && age == rapidoDTO.age && Double.compare(price, rapidoDTO.price) == 0 && Objects.equals(name, rapidoDTO.name) && Objects.equals(appVersion, rapidoDTO.appVersion) && Objects.equals(email, rapidoDTO.email) && Objects.equals(phoneNumber, rapidoDTO.phoneNumber) && Objects.equals(languages, rapidoDTO.languages) && Objects.equals(country, rapidoDTO.country) && Objects.equals(joinDate, rapidoDTO.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, appVersion, age, email, phoneNumber, languages, country, joinDate, price);
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

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
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

    public long getphoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNUmber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RapidoDTO(int id, String name, String appVersion, int age, String email, long phoneNumber, String languages, String country, String joinDate, double price) {
        this.id = id;
        this.name = name;
        this.appVersion = appVersion;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.languages = languages;
        this.country = country;
        this.joinDate = joinDate;
        this.price = price;
    }
}
