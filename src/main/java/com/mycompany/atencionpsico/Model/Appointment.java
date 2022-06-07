/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Model;

/**
 *
 * @author jhojan
 */
public class Appointment {
    private Student estudiante;
    private Psychologist practicante;
    private String fecha;
    private String hora;

    public Appointment(Student estudiante, Psychologist practicante, String fecha, String hora) {
        this.estudiante = estudiante;
        this.practicante = practicante;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Student getEstudiante() {
        return estudiante;
    }

    public Psychologist getPracticante() {
        return practicante;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setEstudiante(Student estudiante) {
        this.estudiante = estudiante;
    }

    public void setPracticante(Psychologist practicante) {
        this.practicante = practicante;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
    
    
}
