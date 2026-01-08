package com.xworkz.Rapidoo.delete.internal;

import com.xworkz.rapidoinst.dto.RapidoUserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRapidoUser {
    String url = "jdbc:mysql://localhost:3306/rapido_databas";
    String userName = "root";
    String password = "Ammu@5182603";

    public void byId(int id) {
        try {
            String query = "delete from rapido_tabless where id=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows == 1) {
                System.out.println("deleted rows with id : " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}