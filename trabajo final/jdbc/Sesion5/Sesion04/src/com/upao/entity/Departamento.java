package com.upao.entity;

/**
 *
 * @author Upao
 */
public class Departamento {
    private int id;
    private String nombredep;

    public Departamento(int id, String nombredep) {
        this.id = id;
        this.nombredep = nombredep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombredep() {
        return nombredep;
    }

    public void setNombredep(String nombredep) {
        this.nombredep = nombredep;
    }

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombredep=" + nombredep + '}';
    }
    
    
}
