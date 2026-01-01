package com.xworkz.items.runner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class OrderItems {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/customer_db";
            String username="root";
            String password="Ammu@5182603";
            String query1="update customer_table set phonenumber=6729163829 where customer_id = '1'";
            String query2="update customer_table set amount=30000 where customer_id = '3'";
            String query3="update customer_table set customer_name='seeta' where customer_id = '7'";
            String query4="update customer_table set product_name='iPhone' where customer_id = '4'";
            String query5="update customer_table set amount=2000 where customer_id = '9'";
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            int rows= statement.executeUpdate(query5);
            if(rows==1){
                System.out.println("Inserted values");
            }else {
                System.out.println("Not inserted values");
            }
        } catch (ClassNotFoundException obj) {
            obj.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}