package dao;

import clases.Especialidad;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class EspecialidadDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_ESPECIALIDAD= "INSERT INTO Especialidad (nombreEspecialidad,Descripcion,costo)"
            + "VALUES(?, ?, ?)";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    
    //insertar Medico
    public void crearEspecialidad(Especialidad especialidad) throws SQLException, IOException{
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_ESPECIALIDAD);
            declaracionInsertar.setString(1, especialidad.getNombre());
            declaracionInsertar.setString(2, especialidad.getDescripcion());
            declaracionInsertar.setDouble(3, especialidad.getCosto());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
}
