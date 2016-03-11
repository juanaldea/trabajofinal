package com.upao.factory;

import com.upao.dao.IAlumno;
import com.upao.dao.ICargo;
import com.upao.dao.ICarrera;
import com.upao.dao.ICiudad;
import com.upao.dao.ICurso;
import com.upao.dao.IDepartamento;
import com.upao.dao.IDocente;
import com.upao.dao.IEmpleado;
import com.upao.dao.impl.CursoDAOmysql;
import com.upao.dao.impl.DepartamentoDAOmysql;
import com.upao.dao.impl.DocenteDAOmysql;
import com.upao.dao.impl.EmpleadoDAOmysql;

/**
 *
 * @author Upao
 */
public class FactoryMySQL extends AbstractFactory{

    @Override
    public IEmpleado getEmpleadoDAO() {
        return new EmpleadoDAOmysql();
    }

    @Override
    public IDepartamento getDepartamentoDAO() {
        return new DepartamentoDAOmysql();
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
        return new CursoDAOmysql();
    }

    @Override
    public IDocente getDocenteDAO() {
        return new DocenteDAOmysql();
    }

    @Override
    public ICiudad getCiudadDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICargo getCargoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    
