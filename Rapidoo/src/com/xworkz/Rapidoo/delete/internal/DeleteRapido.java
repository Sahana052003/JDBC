package com.xworkz.Rapidoo.delete.internal;

import com.xworkz.rapidoinst.dto.RapidoUserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRapido {
    String url = "jdbc:mysql://localhost:3306/rapido_database";
    String userName = "root";
    String password = "Ammu@5182603";

    public void byNameAndPhoneAndEmail(String name,long phoneNumber,String email) {
        try {
            String query = "delete from rapido_tble where name=? and phoneNumber=? and email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setLong(2,phoneNumber);
            ps.setString(3,email);
            int rows = ps.executeUpdate();
            if (rows == 1) {
                System.out.println("deleted rows with id : " + name);
                System.out.println(phoneNumber+" "+ email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}