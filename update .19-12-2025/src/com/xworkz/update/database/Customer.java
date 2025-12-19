package com.xworkz.update.database;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Order_db";
            String username="root";
            String password="Ammu@5182603";
            //String query="update order_table set oder_item='iPhone' where order_id = 'O001'";
            //String query="update order_table set address='KGF' where order_id = 'O002'";
            //String query="update order_table set amount=25000 where order_id = 'O003'";
            //String query="update order_table set name='pooja' where order_id = 'O004'";
            String query="update order_table set oder_item='SmartWatch' where order_id = 'O005'";
            Connection connection=DriverManager.getConnection(url,username,password);
            if(connection!=null){
                System.out.println("Updating the customer data ");
            }
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(query);
            if(rows==1) {
                System.out.println(rows);
            }else {
                System.out.println("not found");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException a){
            a.printStackTrace();
        }
    }
}
