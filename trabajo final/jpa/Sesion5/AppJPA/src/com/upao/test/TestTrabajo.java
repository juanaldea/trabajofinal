/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.test;

import com.upao.entity.Categoria;

import com.upao.entity.Producto;

import com.upao.util.JPAutil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author GUILLE
 */
public class TestTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManager manager = JPAutil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        
        //Entidades
        Categoria cat=new Categoria();
        cat.setNombrecateg("Lácteos");
              
        Producto pro=new Producto();
        pro.setNombreprod("Yogurt Laive");
        pro.setUnidadmed("Botella de 900 ml");
        pro.setIdcat(cat);
        
        //Proceso
        manager.persist(cat);
        manager.persist(pro);
        
        tx.commit();
        manager.close();
        JPAutil.close();
    }
    
}
