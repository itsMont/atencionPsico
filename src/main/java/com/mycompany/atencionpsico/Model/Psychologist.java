/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Model;

/**
 *
 * @author jhojan
 */
public class Psychologist {
    private String nombre;
    private String email;
    private Tutor tutorAsignado;

    public Psychologist(String nombre, String email, Tutor tutorAsignado) {
        this.nombre = nombre;
        this.email = email;
        this.tutorAsignado = tutorAsignado;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setTutorAsignado(Tutor tutorAsignado) {
        this.tutorAsignado = tutorAsignado;
    }
    
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Tutor getTutorAsignado() {
        return tutorAsignado;
    }
    
    
    
    
}
