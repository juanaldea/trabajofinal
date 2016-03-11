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
public class Carrera {
    private int id;
    private String nombrecarre;
    private String duracion;

    public Carrera(int id, String nombrecarre, String duracion) {
        this.id = id;
        this.nombrecarre = nombrecarre;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecarre() {
        return nombrecarre;
    }

    public void setNombrecarre(String nombrecarre) {
        this.nombrecarre = nombrecarre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombrecarre=" + nombrecarre + ", duracion=" + duracion + '}';
    }
    
}
