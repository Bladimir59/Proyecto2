package dao;

import clases.Medico;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Bladimir
 */
public class MedicoDAO extends Conectar{
    //variables para el uso dao del medico
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_MEDICO= "INSERT INTO Medico (codigoMedico, nombre, numeroColegiado, DPI, telefono,"
            + " correoElectronico, fechaInicioTrabajo, password) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    
    //private static final String NUEVO_ESPECIALIDAD
    //private static final String TABLA_UNION
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
   
    public void crearMedico(Medico medico){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_MEDICO);
            declaracionInsertar.setString(1, medico.getCodigo());
            declaracionInsertar.setString(2, medico.getNombre());
            declaracionInsertar.setString(3, medico.getNumeroColegiado());
            declaracionInsertar.setString(4, medico.getDPI());
            declaracionInsertar.setString(5, medico.getTelefono());
            declaracionInsertar.setString(6, medico.getCorreoElectronico());
            declaracionInsertar.setDate(7, medico.getFechaInico());
            declaracionInsertar.setString(8, medico.getPassword());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }    
}
