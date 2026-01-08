package com.xworkz.rapido.dto;

import java.util.Objects;

public class RapidoDTO {
    private int id;
    private String name;
    private int age;
    private String email;

    public RapidoDTO(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
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

    @Override
    public String toString() {
        return "RapidoDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RapidoDTO)) return false;
        RapidoDTO rapidoDTO = (RapidoDTO) o;
        return id == rapidoDTO.id && age == rapidoDTO.age && Objects.equals(name, rapidoDTO.name) && Objects.equals(email, rapidoDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, email);
    }
}

