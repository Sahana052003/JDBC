package com.xworkz.rapidoinst.internal;

import com.xworkz.rapidoinst.dto.RapidoUserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RapidoUserInsert {
    String url = "jdbc:mysql://localhost:3306/rapido_databas";
    String userName = "root";
    String password = "Ammu@5182603";

    public String stop(RapidoUserDTO rapidoUserDTO) {
        String name = "null";
        try{
            String query="insert into rapido_tabless values(?,?,?,?,?,?,?,?,?,?)";
            Connection connection= DriverManager.getConnection(url,userName,password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,rapidoUserDTO.getId());
            ps.setString(2,rapidoUserDTO.getName());
            ps.setString(3,rapidoUserDTO.getLastName());
            ps.setInt(4,rapidoUserDTO.getAge());
            ps.setString(5,rapidoUserDTO .getEmail());
            ps.setLong(6,rapidoUserDTO.getPhoneNUmber());
            ps.setString(7,rapidoUserDTO.getPincode());
            ps.setInt(8,rapidoUserDTO.getNoOfUser());
            ps.setInt(9,rapidoUserDTO.getOtp());
            ps.setDouble(10,rapidoUserDTO.getPrice());
            int rows = ps.executeUpdate();
            if(rows==1){
                System.out.println("Being executed");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return name;
    }
}
