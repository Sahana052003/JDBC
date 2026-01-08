package com.xworkz.update.internal;



import com.xworkz.rapidoinst.dto.RapidoDriverDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Rapido {
    String url = "jdbc:mysql://localhost:3306/rapido_dbase";
    String userName = "root";
    String password = "Ammu@5182603";

    public String stop(RapidoDriverDTO rapidoDriverDTO) {
        String name = null;
        try {
            String query = "update rapido_tabble set mobile=? where email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setLong(1, rapidoDriverDTO.getmobile());
            ps.setString(2, rapidoDriverDTO.getemail());

            int rows = ps.executeUpdate();
            if (rows>0) {
                name="Executed";
                System.out.println(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}
