package com.tutorial.config;

import java.sql.*;

public class MySQLConfig {

    private String dbUrl = "jdbc:mysql://127.0.0.1:3306/titanium";
    private String dbUser = "root";
    private String dbPassword = "T1tanium";

    private Connection conectarALaBD() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(dbUrl,dbUser,dbPassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    public ResultSet ejecutarQuery(String query) throws SQLException {
        Connection con = conectarALaBD();
        Statement stm = con.createStatement();
        return stm.executeQuery(query);
    }
}
