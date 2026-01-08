package com.xworkz.update.update;

import com.xworkz.rapidod.dto.RapidoDTO;
import com.xworkz.rapidod.dto.RapidoUserDTO;
import com.xworkz.update.runner.RapidRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRapido {
        String url = "jdbc:mysql://localhost:3306/rapido_databases";
        String userName = "root";
        String password = "Ammu@5182603";

        public String save(RapidoDTO rapidoDTO) {

            try {
                String query = "update rapido_tbles set name=? , phoneNumber=? where email=?";
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, rapidoDTO.getName());
                ps.setLong(2, rapidoDTO.getPhoneNumber());
                ps.setString(3,rapidoDTO.getEmail());

                int rows=ps.executeUpdate();
                if (rows == 1) {
                    System.out.println("Executed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
