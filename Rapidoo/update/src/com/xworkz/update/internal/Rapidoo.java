package com.xworkz.update.internal;


import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Rapidoo {
    String url = "jdbc:mysql://localhost:3306/rapido_database";
    String userName = "root";
    String password = "Ammu@5182603";

    public String stop(RapidoDetailsDTO rapidoDetailsDTO) {
        String result =null;
        try {
            String query = "update rapido_tble set name=? , phoneNUmber=?,email=? where id=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, rapidoDetailsDTO.getName());
            ps.setLong(2, rapidoDetailsDTO.getPhoneNUmber());
            ps.setString(3,rapidoDetailsDTO.getEmail());
            ps.setInt(4,rapidoDetailsDTO.getId());


            int rows = ps.executeUpdate();
            if (rows == 1) {
                result = "Executed";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
