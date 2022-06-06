/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Model;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jhojan
 */

public class Conexion {
        private static java.sql.Connection con;
        public static String driver  = "com.mysql.cj.jdbc.Driver";
        public static String user = "root";
        public static String pass = "";
        public static String url = "jdbc:mysql://localhost:3306/atencionPsico";
        
        public static boolean conectarDB() throws SQLException{
        con = null;
        try {
            con =  DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (Exception e) {
            System.out.println("Conexión no exitosa");
            return false;
        }
        return true;
    }
    
}
