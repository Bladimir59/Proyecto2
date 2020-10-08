package dao;

import clases.Administrador;
import clases.Consulta;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class ConsultaDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_ADMINISTRADOR= "INSERT INTO Consulta (Especialidad_idEspecialidad, costo) "
            + "VALUES(?, ?)";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void crearConsulta(Consulta consulta){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_ADMINISTRADOR);
            declaracionInsertar.setString(1, consulta.getNombre());
            declaracionInsertar.setDouble(2, consulta.getMonto());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
}
