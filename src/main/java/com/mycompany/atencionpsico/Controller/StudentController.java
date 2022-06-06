/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Controller;

import com.mycompany.atencionpsico.Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jhojan
 */
public class StudentController {
    final String  tabla = "Students";
    
    public static void getInfo(Student estudiante){
        System.out.println(estudiante.getNombre() + "\nEmail:" + estudiante.getEmail() + "\nCarrera:" + estudiante.getCarrera());
    }
    
    public void guardar(Connection conexion, Student student){
        try {
 
        PreparedStatement consulta;
        // Query de MySQL
        consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(nombre, email, carrera) VALUES(?,?,?)");
        
        // Inserción de datos en BD
        consulta.setString(1, student.getNombre());
        consulta.setString(2, student.getEmail());
        consulta.setString(3, student.getCarrera());
        
        // Ejecutar Consulta
        consulta.executeUpdate();
        
        System.out.println("Escritura exitosa");
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
    
}
