package com.xworkz.order.intern;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrdersDetails {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Order_db";
            String username="root";
            String password="Ammu@5182603";
            //String query="insert into order_table values('O001','Ram','Bangalore','Mobile',3000)";
          //String query="insert into order_table values('O002','Nandu','Kolar','Dress',1500)";
          //String query="insert into order_table values('O003','Raju','Mysore','Laptop',30000)";
            //String query="insert into order_table values('O004','Tom','Srinivaspur','Camera',12000)";
            String query="insert into order_table values('O005','David','TamilNadu','TV',35000)";
            Connection connection=DriverManager.getConnection(url,username,password);
            if(connection!=null){
                System.out.println("Table is created");
            }
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(query);
            if(rows==1) {
                System.out.println(rows);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException a){
            a.printStackTrace();
        }
    }
}
