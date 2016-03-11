package com.upao.dao.impl;

import com.moduI.jdbc.ConnectionsORA;
import com.upao.dao.IAlumno;
import com.upao.entity.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GUILLE
 */
public class AlumnoDAOoracle 
    implements IAlumno{
    Connection con;
    @Override
    public Alumno create(Alumno obj) throws SQLException {
        String insert="insert into alumno(apellidos,nombres) "
                + "values(?,?)";
        con=ConnectionsORA.getInstance();        
        PreparedStatement pt=con.prepareStatement(insert);        
         pt.setString(1, obj.getApellidos());
        pt.setString(2, obj.getNombres());
        pt.executeUpdate();
                return null;
    }

    
    @Override
    public Alumno update(Alumno obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Alumno obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
