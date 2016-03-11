/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.cliente;

import com.upao.dao.IAlumno;
import com.upao.dao.ICargo;
import com.upao.dao.ICarrera;
import com.upao.dao.ICiudad;
import com.upao.dao.ICurso;
import com.upao.dao.IDocente;
import com.upao.entity.Alumno;
import com.upao.entity.Cargo;
import com.upao.entity.Carrera;
import com.upao.entity.Ciudad;
import com.upao.entity.Curso;
import com.upao.entity.Docente;
import com.upao.factory.AbstractFactory;
import com.upao.factory.FactoryType;
import java.sql.SQLException;

/**
 *
 * @author GUILLE
 */
public class ClienteTrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException {
        // TODO code application logic here
        IAlumno al=AbstractFactory.getFactory(FactoryType.ORA_Fac).getAlumnoDAO();
        ICarrera ca=AbstractFactory.getFactory(FactoryType.ORA_Fac).getCarreraDAO();
        ICurso cu=AbstractFactory.getFactory(FactoryType.MYSQL_Fac).getCursoDAO();             
        IDocente doc=AbstractFactory.getFactory(FactoryType.MYSQL_Fac).getDocenteDAO();             
        ICiudad ci=AbstractFactory.getFactory(FactoryType.SQL_Fac).getCiudadDAO();             
        ICargo cg=AbstractFactory.getFactory(FactoryType.SQL_Fac).getCargoDAO();             
    
        
        Alumno alu=new Alumno(1,"Quiroz Vera","Pedro");
        Carrera carre=new Carrera(1, "Enfermería Técnica","3 años");
        Curso cur=new Curso(1, "Biología");
        Docente doce=new Docente(1, "Vásquez Roncal","Maribel");
        Ciudad ciud=new Ciudad(1, "Trujillo");
        Cargo carg=new Cargo(1, "Jefe de Área","Responsable de la carrera profesional a la que pertenece");
                //Proceso
       al.create(alu);//oracle
       ca.create(carre);//oracle
       cu.create(cur);//mysql
       doc.create(doce);//mysql
       ci.create(ciud);//SQLSERVER
       cg.create(carg);//SQLSERVER
               
        
        
    }
    
}
