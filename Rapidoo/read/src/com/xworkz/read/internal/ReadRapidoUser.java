package com.xworkz.read.internal;

import com.xworkz.rapidoinst.dto.RapidoUserDTO;

import java.sql.*;

public class ReadRapidoUser {

    String url = "jdbc:mysql://localhost:3306/rapido_databas";
    String userName = "root";
    String password = "Ammu@5182603";
    public String getAgeAndEmailById(int id) {

String name=null;
        String query = "SELECT age, email FROM rapido_tabless WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,id);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                int age = resultSet.getInt(1);
                String email = resultSet.getString(2);
                System.out.println(age+email);

            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
return name;
    }
}


