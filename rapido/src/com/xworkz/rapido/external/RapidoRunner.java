package com.xworkz.rapido.external;

import com.xworkz.rapido.dto.RapidoDTO;

import java.sql.*;

public class RapidoRunner {
    public static void main(String[] args) {
//        String url="jdbc:mysql://localhost:3306/rapido_db";
//        String userName="root";
//        String password="Ammu@5182603";
//       // String query="insert into rapido_table values(?,?,?,?)";
//       // String updateQuery="update rapido_table set name=? where id=?";
//        // String deleteQuery="delete from rapido_table where id=? and name=?";
//        String readQuery="select name from rapido_table where id=?";
//        try {
//            Connection connection= DriverManager.getConnection(url, userName, password);
//            PreparedStatement preparedStatement=connection.prepareStatement(readQuery);
//            preparedStatement.setInt(1,1);
//            preparedStatement.setString(2,"nandu");
////            preparedStatement.setInt(3,19);
////            preparedStatement.setString(4,"sora234@gmail.com");
////            preparedStatement.setInt(1,2);
////            preparedStatement.setString(2,"pooja");
////            preparedStatement.setInt(3,20);
////            preparedStatement.setString(4,"pooja896@gmail.com");
////            int rows=preparedStatement.executeUpdate();
////
////                if (rows==1){
////                    System.out.println("Get executed");
////                }else{
////                    System.out.println("Not Executed");
////                }
//            ResultSet resultSet=preparedStatement.executeQuery();
//            while (resultSet.next()){
//              String name=  resultSet.getString(1);
//                System.out.println(name);
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }



        RapidoDTO rapidoDTO=new RapidoDTO(3,"soray",21,"soray45@gmail.com");
        RapidoRunner rapidoRunner=new RapidoRunner();
        rapidoRunner.save();
    }
}