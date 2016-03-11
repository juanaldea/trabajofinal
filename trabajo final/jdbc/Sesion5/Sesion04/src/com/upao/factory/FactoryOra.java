package com.upao.factory;

import com.upao.dao.IAlumno;
import com.upao.dao.ICargo;
import com.upao.dao.ICarrera;
import com.upao.dao.ICiudad;
import com.upao.dao.ICurso;
import com.upao.dao.IDepartamento;
import com.upao.dao.IDocente;
import com.upao.dao.IEmpleado;
import com.upao.dao.impl.AlumnoDAOoracle;
import com.upao.dao.impl.CarreraDAOoracle;
import com.upao.dao.impl.DepartamentoDAOoracle;
import com.upao.dao.impl.EmpleadoDAOoracle;


/**
 *
 * @author Upao
 */
public class FactoryOra extends AbstractFactory{

    @Override
    public IEmpleado getEmpleadoDAO() {
        return new EmpleadoDAOoracle();
    }

    @Override
    public IDepartamento getDepartamentoDAO() {
        return new DepartamentoDAOoracle();
    }

    @Override
    public IAlumno getAlumnoDAO() {
        return new AlumnoDAOoracle();
    }

    @Override
    public ICarrera getCarreraDAO() {
      return new CarreraDAOoracle();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICargo getCargoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
