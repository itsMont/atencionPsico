/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atencionpsico.Model;

/**
 *
 * @author jhojan
 */
public class Student{
    private Integer codigo;
    private String nombre;
    private String email;
    private String carrera;

    public Student(String nombre, String email, String carrera) {
        this.nombre = nombre;
        this.email = email;
        this.carrera = carrera;
    }
    
    // Setters
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    // Getters
    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getCarrera() {
        return carrera;
    }   
    
}
