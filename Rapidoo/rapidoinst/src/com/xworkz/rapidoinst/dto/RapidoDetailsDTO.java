package com.xworkz.rapidoinst.dto;

import java.util.Objects;

public class RapidoDetailsDTO {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private long phoneNUmber;
    private String gender;
    private String country;
    private String city;
    private double price;

    public RapidoDetailsDTO(int id, String name, String lastName, int age, String email, long phoneNUmber, String gender, String country, String city, double price) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNUmber = phoneNUmber;
        this.gender = gender;
        this.country = country;
        this.city = city;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RapidoDetailsDTO)) return false;
        RapidoDetailsDTO that = (RapidoDetailsDTO) o;
        return id == that.id && age == that.age && Double.compare(price, that.price) == 0 && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(phoneNUmber, that.phoneNUmber) && Objects.equals(gender, that.gender) && Objects.equals(country, that.country) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, age, email, phoneNUmber, gender, country, city, price);
    }

    @Override
    public String toString() {
        return "RapidoDetailsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNUmber='" + phoneNUmber + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }
}
