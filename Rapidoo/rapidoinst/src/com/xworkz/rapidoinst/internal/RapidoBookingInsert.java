package com.xworkz.rapidoinst.internal;

import com.xworkz.rapidoinst.dto.RapidoBookingDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RapidoBookingInsert {
    String url = "jdbc:mysql://localhost:3306/rapido_datab";
    String userName = "root";
    String password = "Ammu@5182603";

    public String save(RapidoBookingDTO rapidoBookingDTO) {
        String name=null;
        try {
            String query = "insert into rapido_tb values(?,?,?,?,?,?,?,?,?,?)";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,rapidoBookingDTO.getId());
            ps.setString(2,rapidoBookingDTO.getName());
            ps.setString(3,rapidoBookingDTO.getLastName());
            ps.setInt(4,rapidoBookingDTO.getAge());
            ps.setString(5,rapidoBookingDTO.getLocation());
            ps.setLong(6,rapidoBookingDTO.getPhoneNUmber());
            ps.setString(7,rapidoBookingDTO.getVehicleNumber());
            ps.setString(8,rapidoBookingDTO.getGender());
            ps.setString(9,rapidoBookingDTO.getCustomerName());
            ps.setDouble(10,rapidoBookingDTO.getPrice());
            int rows = ps.executeUpdate();
            if (rows == 1) {
                name="Being Executed";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}