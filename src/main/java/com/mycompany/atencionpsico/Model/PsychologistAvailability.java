/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Model;

/**
 *
 * @author jhojan
 */
public class PsychologistAvailability {
    private enum Disponibilidad{
        Ocupado,
        Disponible
    }
    private Disponibilidad DisponibilidadPracticante;

    public PsychologistAvailability(Disponibilidad DisponibilidadPracticante) {
        this.DisponibilidadPracticante = DisponibilidadPracticante;
    }

    public Disponibilidad getDisponibilidadPracticante() {
        return DisponibilidadPracticante;
    }

    public void setDisponibilidadPracticante(Disponibilidad DisponibilidadPracticante) {
        this.DisponibilidadPracticante = DisponibilidadPracticante;
    }
    
    
}
