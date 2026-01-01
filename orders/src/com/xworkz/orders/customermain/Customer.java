package com.xworkz.orders.customermain;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class Customer {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/customer_db";
            String username="root";
            String password="Ammu@5182603";
            String query1="insert into customer_table values(1,'Nandu',1234567891,'vivo',12000)";
            String query2="insert into customer_table values(2,'Karthik',3427186319,'iphone',34000)";
            String query3="insert into customer_table values(3,'sora',6723980123,'dress',1100)";
            String query4="insert into customer_table values(4,'muktha',6721983648,'smarttv',18000)";
            String query5="insert into customer_table values(5,'pooja',8901236732,'watch',6000)";
            String query6="insert into customer_table values(6,'raj',5638192348,'earbuds',1500)";
            String query7="insert into customer_table values(7,'prabhas',4567129836,'snacks',500)";
            String query8="insert into customer_table values(8,'swetha',4562198362,'laptop',50000)";
            String query9="insert into customer_table values(9,'bindhu',6723916283,'pens',300)";
            String query10="insert into customer_table values(10,'ram',6471930252,'bags',1000)";
            Connection connection= DriverManager.getConnection(url,username,password);
          Statement statement= connection.createStatement();
         int rows= statement.executeUpdate(query10);
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