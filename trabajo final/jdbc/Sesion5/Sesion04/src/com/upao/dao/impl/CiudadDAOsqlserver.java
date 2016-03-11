/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.dao.impl;

import com.moduI.jdbc.ConnectionsSQLServer;
import com.upao.dao.ICiudad;
import com.upao.entity.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GUILLE
 */
public class CiudadDAOsqlserver 
   implements  ICiudad{
    Connection con;

    @Override
    public Ciudad create(Ciudad obj) throws SQLException {
            String insert="insert into ciudad(nombreciudad) "
                + "values(?)";
        con=ConnectionsSQLServer.getInstance();
        PreparedStatement pt=con.prepareStatement(insert);
        pt.setString(1, obj.getNombreciudad());
        
        
        pt.executeUpdate();
        
        return null;
    }

    @Override
    public Ciudad update(Ciudad obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ciudad find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Ciudad obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ciudad> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
