package com.upao.cliente;

//import com.upao.dao.DAO;
import com.upao.dao.IDepartamento;
import com.upao.dao.IEmpleado;
import com.upao.entity.Departamento;
import com.upao.entity.Empleado;
import com.upao.factory.AbstractFactory;
import com.upao.factory.FactoryType;
import java.sql.SQLException;

public class Cliente2 {
    public static void main(String[] args) throws SQLException {
     
        /*DAO<Empleado> e1= AbstractFactory
                .getFactory(FactoryType.MYSQL_Fac)
                .getEmpleadoDAO();*/
        
        //Fabrica de Objetos DAO ( Contenedor)
        IEmpleado e= AbstractFactory
               .getFactory(FactoryType.MYSQL_Fac)
                .getEmpleadoDAO();        
        IDepartamento d= AbstractFactory
                .getFactory(FactoryType.ORA_Fac)
                .getDepartamentoDAO();
        //Entidades
        Empleado emp=new Empleado(1,"Patricia","Perez");
        Departamento dep=new Departamento(1, "Telecomunicaciones");
        
        //Proceso
        e.create(emp);//MYSQL
        d.create(dep);//ORACLE
        
    }
}
