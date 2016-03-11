package com.upao.factory;

import com.upao.dao.IAlumno;
import com.upao.dao.ICargo;
import com.upao.dao.ICarrera;
import com.upao.dao.ICiudad;
import com.upao.dao.ICurso;
import com.upao.dao.IDepartamento;
import com.upao.dao.IDocente;
import com.upao.dao.IEmpleado;

/**
 *
 * @author Upao
 */
public abstract class AbstractFactory {
    
    //Metodos ==> Retornan Interfaces
    public abstract IEmpleado getEmpleadoDAO();
    public abstract IDepartamento getDepartamentoDAO();
    public abstract IAlumno getAlumnoDAO();
    public abstract ICarrera getCarreraDAO();
    public abstract ICurso getCursoDAO();
    public abstract IDocente getDocenteDAO();
    public abstract ICiudad getCiudadDAO();
    public abstract ICargo getCargoDAO();
    //Retorna La Factoria de Objetos Segun el Tipo
    public static AbstractFactory getFactory(FactoryType type){
        if(type.equals(FactoryType.MYSQL_Fac))
            return new FactoryMySQL();
        if(type.equals(FactoryType.ORA_Fac))
            return new FactoryOra();
        if(type.equals(FactoryType.SQL_Fac))
            return new FactorySQL();
        
        return null;
    }
}
