package com.xworkz.update.internal;



import com.xworkz.rapidoinst.dto.RapidoDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRapido {
        String url = "jdbc:mysql://localhost:3306/rapido_databases";
        String userName = "root";
        String password = "Ammu@5182603";

        public String save(RapidoDTO rapidoDTO) {
String name=null;
            try {
                String query = "update rapido_tbles set name=? , phoneNumber=? where email=?";
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, rapidoDTO.getName());
                ps.setLong(2, rapidoDTO.getphoneNumber());
                ps.setString(3,rapidoDTO.getEmail());

                int rows=ps.executeUpdate();
                if (rows>0) {
                    name="Executed";
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return name;
        }
    }
