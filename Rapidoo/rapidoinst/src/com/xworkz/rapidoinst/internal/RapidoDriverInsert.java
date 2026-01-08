package com.xworkz.rapidoinst.internal;

import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;
import com.xworkz.rapidoinst.dto.RapidoDriverDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RapidoDriverInsert {
        String url = "jdbc:mysql://localhost:3306/rapido_dbase";
        String userName = "root";
        String password = "Ammu@5182603";

        public String drive(RapidoDriverDTO rapidoDriverDTO) {
            String name = "null";
            try{
                String query="insert into rapido_tabble values(?,?,?,?,?,?,?,?,?,?)";
                Connection connection= DriverManager.getConnection(url,userName,password);
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1,rapidoDriverDTO.getId());
                ps.setString(2,rapidoDriverDTO.getName());
                ps.setString(3,rapidoDriverDTO.getLastName());
                ps.setInt(4,rapidoDriverDTO.getAge());
                ps.setString(5,rapidoDriverDTO .getemail());
                ps.setLong(6,rapidoDriverDTO.getAdharNumber());
                ps.setLong(7,rapidoDriverDTO.getmobile());
                ps.setString(8,rapidoDriverDTO.getExperience());
                ps.setString(9,rapidoDriverDTO.getLocation());
                ps.setDouble(10,rapidoDriverDTO.getPrice());
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
