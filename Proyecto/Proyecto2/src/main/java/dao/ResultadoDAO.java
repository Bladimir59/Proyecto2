/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Resultado;
import conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class ResultadoDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_ADMINISTRADOR= "INSERT INTO Resultado ( codigo, informe, Paciente_codigoPaciente, Laboratorista_codigoLaboratorista,"
            + " examenRealizado, hora, fecha, Examen_codigo,Medico_codigoMedico) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?,?)";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    
    //metodo que carga la coneccion

     
    
    //insertar Medico
    public void crearResultado(Resultado resultado){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_ADMINISTRADOR);
            declaracionInsertar.setString(1, resultado.getCodigo());
            declaracionInsertar.setBlob(2, resultado.getInforme());
            declaracionInsertar.setString(3, resultado.getPaciente());
            declaracionInsertar.setString(4, resultado.getLaborarotista());
            declaracionInsertar.setString(5, resultado.getExamen());
            declaracionInsertar.setTime(6, resultado.getHora());
            declaracionInsertar.setDate(7, resultado.getFecha());
            declaracionInsertar.setString(8, resultado.getExamen());
            declaracionInsertar.setString(9, resultado.getMedico());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
}
