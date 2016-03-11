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
public class Curso {
    private int id;
    private String nombrecurso;

    public Curso(int id, String nombrecurso) {
        this.id = id;
        this.nombrecurso = nombrecurso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombrecurso=" + nombrecurso + '}';
    }
    
}
