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
public class Cargo {
    private int id;
    private String nombrecargo;
    private String detalles;

    public Cargo(int id, String nombrecargo, String detalles) {
        this.id = id;
        this.nombrecargo = nombrecargo;
        this.detalles = detalles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecargo() {
        return nombrecargo;
    }

    public void setNombrecargo(String nombrecargo) {
        this.nombrecargo = nombrecargo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Cargo{" + "id=" + id + ", nombrecargo=" + nombrecargo + ", detalles=" + detalles + '}';
    }
    
}
