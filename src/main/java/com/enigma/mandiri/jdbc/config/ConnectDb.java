package com.enigma.mandiri.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {

    public static Connection connection;

    public Connection getConnection() {
        if(connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                String urlDB = "jdbc:postgresql://localhost:5432/gold_pocket";
                String userName = "postgres";
                String password = "";
                connection = DriverManager.getConnection(urlDB, userName, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}
