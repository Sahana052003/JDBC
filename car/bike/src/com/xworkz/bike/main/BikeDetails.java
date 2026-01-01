package com.xworkz.bike.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BikeDetails {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/car_db";
        String username="root";
        String password="Ammu@5182603";
        String query="update car_table set car_name=? where car_id=?";
        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,"BMW");
            preparedStatement.setInt(2,1);

//            preparedStatement.setInt(3,2000000);
            int rows=preparedStatement.executeUpdate();
            if(rows==1){
                System.out.println("Executed");
            }else{
                System.out.println("Not Executed");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
