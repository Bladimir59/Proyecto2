package dao;

import clases.Union;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class UnionDAO {        
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String UNION_ESPECIALIDAD="INSERT INTO MedicoEspecialidad(Medico_codigoMedico,Especialidad_idEspecialidad) "
            + "VALUES(?,(SELECT idEspecialidad FROM Especialidad WHERE nombreEspecialidad=? LIMIT 1))";
    
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void llenarUnion(Union union){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(UNION_ESPECIALIDAD);
            declaracionInsertar.setString(1, union.getIdMedico());
            declaracionInsertar.setString(2, union.getNombreEspecialidad());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
}
