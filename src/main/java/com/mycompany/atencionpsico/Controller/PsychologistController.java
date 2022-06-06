/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Controller;

import com.mycompany.atencionpsico.Model.Psychologist;
import java.util.Set;

/**
 *
 * @author jhojan
 */
public class PsychologistController {
    public Set<Psychologist> listaPracticantes;
    public Set<Psychologist> verPracticantes(){
        return listaPracticantes;        
    }
    
}
