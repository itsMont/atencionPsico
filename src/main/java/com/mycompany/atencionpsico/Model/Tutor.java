/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Model;

/**
 *
 * @author jhojan
 */
public class Tutor {
    private String nombre;
    private String email;

    public Tutor(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
     public Tutor(String nombre) {
        this.nombre = nombre;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    

    
    
}
