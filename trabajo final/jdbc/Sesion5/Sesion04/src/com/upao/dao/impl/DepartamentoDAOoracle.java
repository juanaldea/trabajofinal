package com.upao.dao.impl;

import com.moduI.jdbc.ConnectionsORA;
import com.upao.dao.IDepartamento;
import com.upao.entity.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Upao
 */
public class DepartamentoDAOoracle 
 implements IDepartamento{

     Connection con;
    @Override
    public Departamento create(Departamento obj) throws SQLException {
        String insert="insert into departamento(nombredep) "
                + "values(?)";
        con=ConnectionsORA.getInstance();        
        PreparedStatement pt=con.prepareStatement(insert);        
        pt.setString(1, obj.getNombredep());
                
        pt.executeUpdate();
        
        return null;
    }

    @Override
    public Departamento update(Departamento obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departamento find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Departamento obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Departamento> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
