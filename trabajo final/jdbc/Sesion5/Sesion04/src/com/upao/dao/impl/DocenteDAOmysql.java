/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.dao.impl;

import com.moduI.jdbc.ConnectionsMySQL;
import com.upao.dao.IDocente;
import com.upao.entity.Docente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GUILLE
 */
public class DocenteDAOmysql 
implements IDocente{
    Connection con;

    @Override
    public Docente create(Docente obj) throws SQLException {
        String insert="insert into docente(apellidos,nombres) "
                + "values(?,?)";
        con=ConnectionsMySQL.getInstance();
        PreparedStatement pt=con.prepareStatement(insert);
        pt.setString(1, obj.getApellidos());
        pt.setString(2, obj.getNombres());
        
        pt.executeUpdate();
        
        return null;
    }

    @Override
    public Docente update(Docente obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Docente find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Docente obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Docente> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
