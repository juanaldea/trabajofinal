package com.upao.dao;

import com.upao.entity.Empleado;
import java.util.List;

/**
 *
 * @author Upao
 */
public interface IEmpleado 
    extends  DAO<Empleado>{
    List<Empleado> getAllbyDep(String nomdepa );
}
