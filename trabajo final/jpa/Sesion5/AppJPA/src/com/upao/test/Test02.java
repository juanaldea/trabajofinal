package com.upao.test;

import com.upao.entity.Departamento;
import com.upao.entity.Empleado;
import com.upao.util.JPAutil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Upao
 */
public class Test02 {

    public static void main(String[] args) {
        // TODO code application logic here
        EntityManager manager = JPAutil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        
        //Entidades
        Departamento dep=new Departamento();
        dep.setNombredep("Departamento Prueba Final");
        
        Empleado emp=new Empleado();
        emp.setNombre("Empleado Final");
        emp.setApellido("Apellido Final");
        emp.setIddep(dep);
        
        //Proceso
        manager.persist(dep);
        manager.persist(emp);
        
        tx.commit();
        manager.close();
        JPAutil.close();

    }

}
