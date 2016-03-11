/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moduI.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GUILLE
 */
public class ConnectionsSQLServer {
     private static final String url = "jdbc:sqlserver://localhost;databaseName=trabajopoo;integrated Security=true";
     ////user=dbo;password=dbo
     
    private static final String user = "dbo";
    private static final String passwd = "dbo";
    
    private static Connection con;

    public static Connection getInstance() {
        if (con == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException | ClassNotFoundException e) {
            }
        }
        return con;
    }
}
