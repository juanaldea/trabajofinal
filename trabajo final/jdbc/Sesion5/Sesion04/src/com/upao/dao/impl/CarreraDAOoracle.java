/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.dao.impl;

import com.moduI.jdbc.ConnectionsORA;
import com.upao.dao.ICarrera;
import com.upao.entity.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GUILLE
 */
public class CarreraDAOoracle
implements ICarrera{
    Connection con;
    @Override
    public Carrera create(Carrera obj) throws SQLException {
        String insert="insert into carrera(nombrecarre,duracion) "
                + "values(?,?)";
        con=ConnectionsORA.getInstance();        
        PreparedStatement pt=con.prepareStatement(insert);        
        pt.setString(1, obj.getNombrecarre());
         pt.setString(2, obj.getDuracion());
        pt.executeUpdate();
        
        return null;
    }

    @Override
    public Carrera update(Carrera obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carrera find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Carrera obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Carrera> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
