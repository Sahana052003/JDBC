package com.xworkz.rapidoinst.internal;

import com.xworkz.rapidoinst.dto.RapidoBookingDTO;
import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RapidoDetailsInsert {
    String url = "jdbc:mysql://localhost:3306/rapido_database";
    String userName = "root";
    String password = "Ammu@5182603";

    public String start(RapidoDetailsDTO rapidoDetailsDTO) {
        String name=null;
try{
    String query="insert into rapido_tble values(?,?,?,?,?,?,?,?,?,?)";
   Connection connection=DriverManager.getConnection(url,userName,password);
    PreparedStatement ps = connection.prepareStatement(query);
    ps.setInt(1,rapidoDetailsDTO.getId());
    ps.setString(2,rapidoDetailsDTO.getName());
    ps.setString(3,rapidoDetailsDTO.getLastName());
    ps.setInt(4,rapidoDetailsDTO.getAge());
    ps.setString(5,rapidoDetailsDTO .getEmail());
    ps.setLong(6,rapidoDetailsDTO.getPhoneNUmber());
    ps.setString(7,rapidoDetailsDTO.getGender());
    ps.setString(8,rapidoDetailsDTO.getCountry());
    ps.setString(9,rapidoDetailsDTO.getCity());
    ps.setDouble(10,rapidoDetailsDTO.getPrice());
    int rows = ps.executeUpdate();
    if(rows==1){
        name="Being Executed";
    }
}catch (SQLException e){
    e.printStackTrace();
}
        return name;
    }
}