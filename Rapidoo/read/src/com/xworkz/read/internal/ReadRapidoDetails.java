package com.xworkz.read.internal;

import java.sql.*;

public class ReadRapidoDetails {
    String url = "jdbc:mysql://localhost:3306/rapido_database";
    String userName = "root";
    String password = "Ammu@5182603";

    public String getNameAndPhoneAndEmailById(int id) {
        String name = null;
        try {
            String query = "select name,phoneNumber,email from rapido_tble where id=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
          ResultSet resultSet= preparedStatement.executeQuery();
          while (resultSet.next()){
            String userName=  resultSet.getString(1);
            long number=  resultSet.getLong(2);
             String email= resultSet.getString(3);
              System.out.println(userName+" "+ number+" "+email);
          }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}