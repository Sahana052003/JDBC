package com.xworkz.employee.external;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Employee_db";
            String username="root";
            String password="Ammu@5182603";
            String query="insert into employee_table values(2,'Nandu')";
            Connection connection=DriverManager.getConnection(url,username,password);
            if(connection!=null){
                System.out.println("employee databse ");
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
