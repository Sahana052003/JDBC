package com.xworkz.Rapidoo.delete.internal;

import com.xworkz.rapidoinst.dto.RapidoUserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRapidoDriver {
    String url = "jdbc:mysql://localhost:3306/rapido_databases";
    String userName = "root";
    String password = "Ammu@5182603";

    public void byNameAndPhone(String name,long phoneNumber) {
        try {
            String query = "delete from rapido_tbles where name=? and phoneNumber=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,name);
            ps.setLong(2, phoneNumber);
            int rows = ps.executeUpdate();
            if (rows >0) {

                System.out.println("deleted rows with phoneNumber is : " + name+ " " +phoneNumber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}