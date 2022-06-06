/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atencionpsico;

import com.mycompany.atencionpsico.Model.Conexion;
import com.mycompany.atencionpsico.View.MenuInicio;
import java.sql.SQLException;

/**
 *
 * @author jhojan
 */
public class AtencionPsico {

    public static void main(String[] args) throws SQLException {
        // Inicializar Menu Inicial
        new MenuInicio().setVisible(true);
        Conexion.conectarDB();
    }
}
