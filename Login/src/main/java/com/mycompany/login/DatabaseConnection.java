/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            
            String url = "jdbc:mysql://local:3306/login";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url,user,password);
        }catch (SQLException ex){
            System.out.println("Error al conectar la base de datos" + ex.getMessage());
        }
        return conn;
    }
    
}
