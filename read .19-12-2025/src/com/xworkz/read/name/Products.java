package com.xworkz.read.name;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Products {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Order_db";
            String username="root";
            String password="Ammu@5182603";
            String query="select * from order_table";
            Connection connection=DriverManager.getConnection(url,username,password);
            if(connection!=null){
                System.out.println("Updating the customers data ");
            }
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"  \t"+resultSet.getString(3)
                        +"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException a){
            a.printStackTrace();
        }
    }
}
