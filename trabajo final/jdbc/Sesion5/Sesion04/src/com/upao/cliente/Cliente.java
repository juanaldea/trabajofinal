package com.upao.cliente;

import com.upao.dao.IDepartamento;
import com.upao.dao.IEmpleado;
import com.upao.dao.impl.DepartamentoDAOoracle;
import com.upao.dao.impl.EmpleadoDAOmysql;
import com.upao.entity.Departamento;
import com.upao.entity.Empleado;
import java.sql.SQLException;

/**
 *
 * @author Upao
 */
public class Cliente {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        IEmpleado e1 = new EmpleadoDAOmysql();
        IDepartamento d2 = new DepartamentoDAOoracle();

        Empleado emp1 = new Empleado(1, "Henry", "Mendoza Puerta");
        Departamento dep = new Departamento(1, "SISTEMAS");

        e1.create(emp1);//MYSQL
        d2.create(dep);//ORACLE

    }

}
