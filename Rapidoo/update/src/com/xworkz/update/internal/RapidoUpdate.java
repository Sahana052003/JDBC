package com.xworkz.update.update;



import com.xworkz.rapidoinst.dto.RapidoUserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RapidoUpdate {
    String url = "jdbc:mysql://localhost:3306/rapido_databas";
    String userName = "root";
    String password = "Ammu@5182603";

    public String stop(RapidoUserDTO rapidoUserDTO) {
        String name = "null";
        try {
            String query = "update rapido_tabless set age=? , email=? where id=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, rapidoUserDTO.getAge());
            ps.setString(2, rapidoUserDTO.getEmail());
            ps.setInt(3,rapidoUserDTO.getId());

            int rows = ps.executeUpdate();
            if (rows == 1) {
                System.out.println("Executed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}
