/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upao.dao.impl;

import com.moduI.jdbc.ConnectionsMySQL;
import com.upao.dao.ICurso;
import com.upao.entity.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GUILLE
 */
public class CursoDAOmysql 
  implements ICurso{
    Connection con;
    @Override
    public Curso create(Curso obj) throws SQLException {
         String insert="insert into curso(nombrecurso) "
                + "values(?)";
        con=ConnectionsMySQL.getInstance();
        PreparedStatement pt=con.prepareStatement(insert);
        pt.setString(1, obj.getNombrecurso());
       
        
        pt.executeUpdate();
        
        return null;
    }

    @Override
    public Curso update(Curso obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Curso find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Curso obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Curso> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
