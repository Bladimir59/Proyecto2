/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//clases a usar en este dao para el ingreso de un paciente
import clases.Paciente;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class PacienteDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_PACIENTE= "INSERT INTO Paciente (codigoPaciente, nombre, sexo, fechaNacimiento, DPI, telefono,"
            + "peso,tipoSangre,correoElectronico) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void crearPaciente(Paciente paciente) throws SQLException, IOException{
        obtenerConexion();
        PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_PACIENTE);
        declaracionInsertar.setString(1, paciente.getCodigo());
        declaracionInsertar.setString(2, paciente.getNombre());
        declaracionInsertar.setString(3, paciente.getSexo());
        declaracionInsertar.setDate(4, paciente.getFechaNacimiento());
        declaracionInsertar.setString(5, paciente.getDPI());
        declaracionInsertar.setString(6, paciente.getTelefono());
        declaracionInsertar.setString(7, paciente.getPeso());
        declaracionInsertar.setString(8, paciente.getTipoSangre());
        declaracionInsertar.setString(9, paciente.getCorreoElectronico());
        declaracionInsertar.executeUpdate();
    }
}
