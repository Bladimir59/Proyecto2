/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Horario;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class HorarioLaboratoristaDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_HORARIO= "INSERT INTO HorarioLab (Dia, Laboratorista_codigoLaboratorista) "
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
    public void crearHorario(Horario horario){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_HORARIO);
            declaracionInsertar.setString(1, horario.getDia());
            declaracionInsertar.setString(2, horario.getCodigLab());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
    
}
