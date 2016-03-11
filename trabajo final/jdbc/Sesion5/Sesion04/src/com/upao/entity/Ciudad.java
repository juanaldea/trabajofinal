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
public class Ciudad {
    private int id;
    private String nombreciudad;
       

    public Ciudad(int id, String nombreciudad) {
        this.id = id;
        this.nombreciudad = nombreciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", nombreciudad=" + nombreciudad + '}';
    }
    
}
