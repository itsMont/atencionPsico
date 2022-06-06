/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
        
        public static Connection conectarDB() throws SQLException{
        con = null;
        try {
            con =  DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (Exception e) {
            // Llamar un Dialogo en caso de que falle algo con la BD
            JOptionPane.showMessageDialog(null,
                "No se puede conectar correctamente a la Base de Datos.\nIntentelo nuevamente.",
                "Error de conexión con la Base de Datos",
                JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
        
        
    
}
