package com.upao.dao.impl;

import com.moduI.jdbc.ConnectionsMySQL;
import com.upao.dao.IEmpleado;
import com.upao.entity.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Upao
 */
public class EmpleadoDAOmysql
    implements IEmpleado{

    Connection con;

    @Override
    public Empleado create(Empleado obj) throws SQLException {
        String insert="insert into empleado(nombre,apellido) "
                + "values(?,?)";
        con=ConnectionsMySQL.getInstance();
        PreparedStatement pt=con.prepareStatement(insert);
        pt.setString(1, obj.getNombre());
        pt.setString(2, obj.getApellido());
        
        pt.executeUpdate();
        
        return null;
    }

    @Override
    public Empleado update(Empleado obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Empleado obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> getAllbyDep(String nomdepa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
