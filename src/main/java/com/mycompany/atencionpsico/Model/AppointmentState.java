/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Model;

/**
 *
 * @author jhojan
 */
public class AppointmentState {
    private enum estado{
        Creada,
        EnProceso,
        Finalizada,
        Reasignada
    }
    
    private estado estadoCita;

    public AppointmentState(estado estadoCita) {
        this.estadoCita = estadoCita;
    }

    public estado getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(estado estadoCita) {
        this.estadoCita = estadoCita;
    }
    
    
}
