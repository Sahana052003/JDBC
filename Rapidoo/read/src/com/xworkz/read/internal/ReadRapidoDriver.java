package com.xworkz.read.internal;

import com.xworkz.rapidoinst.dto.RapidoDriverDTO;

import java.sql.*;

public class ReadRapidoDriver {
    String url = "jdbc:mysql://localhost:3306/rapido_dbase";
    String userName = "root";
    String password = "Ammu@5182603";

    public String getPhoneByEmail(String email) {
        String name = "null";
        try {
            String query = "select mobile from rapido_tabble where email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,email);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                long mobile=resultSet.getLong(1);
                System.out.println(mobile);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}