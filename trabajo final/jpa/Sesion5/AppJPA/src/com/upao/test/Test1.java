package com.upao.test;

import com.upao.entity.Vehiculo;
import com.upao.util.JPAutil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Upao
 */
public class Test1 {

    public static void main(String[] args) {
      //Fabrica Persistencia
        //Persistence.createEntityManagerFactory("AppJPAPU");

        EntityManager manager = JPAutil.getEntityManager();
        EntityTransaction tx=manager.getTransaction();
        tx.begin();
        
        Vehiculo vehiculo=new Vehiculo();
        vehiculo.setFabricante("Otro");
        vehiculo.setModelo("Civic Otro");
        
        //manager.persist(vehiculo);
        
        tx.commit();
        
        System.out.println("Buscar un vehiculo");
        Vehiculo ve=manager.find(Vehiculo.class, 2);
        System.out.println("Modelo:"+ve.getModelo());
        
        manager.close();
        JPAutil.close();
        

    }
}
