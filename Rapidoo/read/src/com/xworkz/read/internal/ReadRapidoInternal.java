package com.xworkz.read.internal;

import java.sql.*;

public class ReadRapidoInternal {
    String url = "jdbc:mysql://localhost:3306/rapido_databases";
    String userName = "root";
    String password = "Ammu@5182603";

    public void getNameAndPhoneByEmail(String email) {
        try {
            String query="select name,phoneNumber from rapido_tbles where email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,email);
            ResultSet rows= preparedStatement.executeQuery();
            while (rows.next()){
                String name=rows.getString(1);
                String phoneNumber=rows.getString(2);
                System.out.println(name + " " + phoneNumber);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
