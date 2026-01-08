package com.xworkz.Rapidoo.delete.internal;

import com.xworkz.rapidoinst.dto.RapidoUserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRapidoDetails {
    String url = "jdbc:mysql://localhost:3306/rapido_dbase";
    String userName = "root";
    String password = "Ammu@5182603";

    public void byEmail(String email) {
        try {
            String query = "delete from rapido_tabble where email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, email);
            int rows = ps.executeUpdate();
            if (rows == 1) {
                System.out.println("deleted rows withemail : " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}