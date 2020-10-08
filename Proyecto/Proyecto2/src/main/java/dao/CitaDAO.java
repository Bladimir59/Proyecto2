/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Administrador;
import clases.Cita;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class CitaDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_ADMINISTRADOR= "INSERT INTO Cita (idCita,fecha, hora,"
            + "Paciente_codigoPaciente, Medico_codigoMedico, Especialidad_idEspecialidad) "
            + "VALUES(?, ?, ?, ?, ?, (SELECT idEspecialidad FROM Especialidad WHERE nombreEspecialidad=? LIMIT 1))";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    
    public void crearCita(Cita cita){
        obtenerConexion();
        try{
        PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_ADMINISTRADOR);
        declaracionInsertar.setString(1, cita.getCodigo());
        declaracionInsertar.setDate(2, cita.getFecha());
        declaracionInsertar.setTime(3, cita.getHora());
        declaracionInsertar.setString(4, cita.getPaciente());
        declaracionInsertar.setString(5, cita.getMedico());
        declaracionInsertar.setString(6, cita.getTipo());
        declaracionInsertar.executeUpdate();  
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
}
