/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atencionpsico;

import com.mycompany.atencionpsico.Controller.PsychologistController;
import com.mycompany.atencionpsico.Controller.StudentController;
import com.mycompany.atencionpsico.Model.Conexion;
import com.mycompany.atencionpsico.Model.Psychologist;
import com.mycompany.atencionpsico.Model.Student;
import com.mycompany.atencionpsico.View.MenuInicio;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jhojan
 */
public class AtencionPsico {
    public static void main(String[] args) throws SQLException {
        Student estudiante1 = new Student("Patricia Ahumada", "patricia@email.com", "Ingeniería Civil");
        // Inicializar Menu Inicial
        new MenuInicio().setVisible(true);
        
        Connection conexion = Conexion.conectarDB();
        // Llamada al controller
        StudentController controladorEstudiante = new StudentController();
        PsychologistController controladorPasante = new PsychologistController();
        //StudentController.getInfo(estudiante1);
        //controladorEstudiante.guardar(conexion, estudiante1);
    }
}
