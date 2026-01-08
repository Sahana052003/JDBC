package com.xworkz.rapidod.internal;

import com.xworkz.rapidod.dto.RapidoDTO;
import com.xworkz.rapidod.dto.RapidoDetailsDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RapidoInsert {
    String url = "jdbc:mysql://localhost:3306/rapido_databases";
    String userName = "root";
    String password = "Ammu@5182603";

    public String run(RapidoDTO rapidoDTO) {
        String name = "null";
        try{
            String query="insert into rapido_tbles values(?,?,?,?,?,?,?,?,?,?)";
            Connection connection= DriverManager.getConnection(url,userName,password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,rapidoDTO.getId());
            ps.setString(2,rapidoDTO.getName());
            ps.setString(3,rapidoDTO.getAppVersion());
            ps.setInt(4,rapidoDTO.getAge());
            ps.setString(5,rapidoDTO .getEmail());
            ps.setLong(6,rapidoDTO.getPhoneNumber());
            ps.setString(7,rapidoDTO.getLanguages());
            ps.setString(8,rapidoDTO.getCountry());
            ps.setString(9,rapidoDTO.getJoinDate());
            ps.setDouble(10,rapidoDTO.getPrice());
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
