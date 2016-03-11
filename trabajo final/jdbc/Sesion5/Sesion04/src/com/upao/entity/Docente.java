/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.entity;

/**
 *
 * @author GUILLE
 */
public class Docente {
    private int id;
    private String apellidos;
    private String nombres;

    public Docente(int id, String apellidos, String nombres) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Docente{" + "id=" + id + ", apellidos=" + apellidos + ", nombres=" + nombres + '}';
    }
    
}
