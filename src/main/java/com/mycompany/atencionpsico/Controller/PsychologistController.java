/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Controller;

import com.mycompany.atencionpsico.Model.Conexion;
import com.mycompany.atencionpsico.Model.Psychologist;
import com.mycompany.atencionpsico.Model.Student;
import com.mycompany.atencionpsico.Model.Tutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JOptionPane;


/**
 *
 * @author jhojan
 */
public class PsychologistController {
    private String tabla = "Psychologists";
    public TreeSet<Psychologist> listaPracticantes;
    
    public TreeSet<Object[]> verPracticantes() throws SQLException{
        TreeSet<Object[]> resultado = new TreeSet<>();
        Connection conexion = Conexion.conectarDB();
        PreparedStatement query;
        query = conexion.prepareStatement("SELECT * FROM " + this.tabla);
        ResultSet lista;
        ResultSetMetaData meta;
        try{
            lista = query.executeQuery();
            meta = lista.getMetaData();
            
            while(lista.next()){
                Object[] fila = new Object[meta.getColumnCount()];
                for(int i = 0; i < fila.length; i++){
                    // (i+1) porque empieza a contar desde 1
                    fila[i] = lista.getObject(i+1);
                    System.out.println(fila[i]);
                };
                resultado.add(fila);
            }
            return resultado;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;        
    }
    
    public Psychologist accederPracticante(String email) throws SQLException{
        String nombre, tutorNombre;
        
        ArrayList<Object[]> resultado = new ArrayList<>();
        Connection conexion = Conexion.conectarDB();
        PreparedStatement query;
        query = conexion.prepareStatement("SELECT * FROM " + this.tabla + " WHERE email = '" + email +"'");
        ResultSet lista;
        ResultSetMetaData meta;
        try{
            lista = query.executeQuery();
            meta = lista.getMetaData();
            Object[] fila = new Object[meta.getColumnCount()];
            
            while(lista.next()){
                fila = new Object[meta.getColumnCount()];
                for(int i = 0; i < fila.length; i++){
                    // (i+1) porque empieza a contar desde 1
                    fila[i] = lista.getObject(i+1);
                    System.out.println(fila[i]);
                };
            }
            nombre = fila[0].toString();
            email = fila[1].toString();
            tutorNombre = fila[2].toString();
            Tutor tutor = new Tutor(tutorNombre);
            System.out.println(nombre + " " + email);
            Psychologist practicante = new Psychologist(nombre, email, tutor);
            return practicante;
        }
        
        catch(NullPointerException exce){
            JOptionPane.showMessageDialog(null,
                "Estás ingresando el email de un practicante inexistente",
                "Practicante no registrado",
                JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }

    
    
}
