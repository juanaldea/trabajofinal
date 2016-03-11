package com.upao.entity;

/**
 *
 * @author Upao
 */
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    
    //Surge de la ASOACION la ENTIDAD EMPLEADO----DEPARTAMENTO
    private Departamento departamento;

    public Empleado(int id,String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
