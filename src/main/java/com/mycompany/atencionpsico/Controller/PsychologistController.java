/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Controller;

import com.mycompany.atencionpsico.Model.Conexion;
import com.mycompany.atencionpsico.Model.Psychologist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeSet;


/**
 *
 * @author jhojan
 */
public class PsychologistController {
    private String tabla = "Psychologists";
    public TreeSet<Psychologist> listaPracticantes;
    
    public TreeSet<Psychologist> verPracticantes() throws SQLException{
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
        }
        catch(Exception e){
            System.out.println(e);
        }
        return listaPracticantes;        
    }
    
    
}
