package dao;

import clases.Medico;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
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
            + "correoElectronico,fechaInicioTrabajo,,password) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void crearMedico(Medico medico) throws SQLException, IOException{
        obtenerConexion();
        PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_MEDICO);
        declaracionInsertar.setString(1, medico.getCodigo());
        declaracionInsertar.setString(2, medico.getNombre());
        declaracionInsertar.setString(3, medico.getNumeroColegiado());
        declaracionInsertar.setString(4, medico.getDPI());
        declaracionInsertar.setString(5, medico.getTelefono());
        declaracionInsertar.setString(4, medico.getCorreoElectronico());
        declaracionInsertar.setDate(5, medico.getFechaInico());
        declaracionInsertar.setString(4, medico.getPassword());
        declaracionInsertar.executeUpdate();
    }
    
}
