/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.factory;

import com.upao.dao.IAlumno;
import com.upao.dao.ICargo;
import com.upao.dao.ICarrera;
import com.upao.dao.ICiudad;
import com.upao.dao.ICurso;
import com.upao.dao.IDepartamento;
import com.upao.dao.IDocente;
import com.upao.dao.IEmpleado;
import com.upao.dao.impl.CargoDAOsqlserver;
import com.upao.dao.impl.CiudadDAOsqlserver;

/**
 *
 * @author GUILLE
 */
public class FactorySQL extends AbstractFactory{

    @Override
    public IEmpleado getEmpleadoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IDepartamento getDepartamentoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IAlumno getAlumnoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICarrera getCarreraDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICurso getCursoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IDocente getDocenteDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICiudad getCiudadDAO() {
         return new CiudadDAOsqlserver();
    }

    @Override
    public ICargo getCargoDAO() {
         return new CargoDAOsqlserver();
         
    }
    
}
