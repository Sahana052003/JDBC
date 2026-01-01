package com.xworkz.car.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDetails {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/car_db";
        String username="root";
        String password="Ammu@5182603";
        String query="insert into car_table values(?,?,?)";
        try{
        Connection connection=DriverManager.getConnection(url,username,password);
         PreparedStatement preparedStatement=connection.prepareStatement(query);
//         preparedStatement.setInt(1,1);
//         preparedStatement.setString(2,"Hyundai");
//         preparedStatement.setInt(3,2000000);
//            preparedStatement.setInt(1,2);
//            preparedStatement.setString(2,"Suzuki");
//            preparedStatement.setInt(3,300000);
//            preparedStatement.setInt(1,3);
//            preparedStatement.setString(2,"Swift");
//            preparedStatement.setInt(3,100000);
//            preparedStatement.setInt(1,4);
//            preparedStatement.setString(2,"Toyoto");
//            preparedStatement.setInt(3,300000);
//            preparedStatement.setInt(1,5);
//            preparedStatement.setString(2,"Tata");
//            preparedStatement.setInt(3,300000);
//            preparedStatement.setInt(1,6);
//            preparedStatement.setString(2,"Honda");
//            preparedStatement.setInt(3,300000);
//            preparedStatement.setInt(1,7);
//            preparedStatement.setString(2,"MC");
//            preparedStatement.setInt(3,300000);
//            preparedStatement.setInt(1,8);
//            preparedStatement.setString(2,"RR");
//            preparedStatement.setInt(3,300000);
//            preparedStatement.setInt(1,9);
//            preparedStatement.setString(2,"Tesla");
//            preparedStatement.setInt(3,300000);
            preparedStatement.setInt(1,10);
            preparedStatement.setString(2,"Omni");
            preparedStatement.setInt(3,300000);

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
