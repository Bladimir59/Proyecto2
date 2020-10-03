/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Administrador;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class AdministradorDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_ADMINISTRADOR= "INSERT INTO Administrador (idAdministrador,DPI, nombre, password) "
            + "VALUES(?, ?, ?, ?)";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void crearAdminitrador(Administrador administrador) throws SQLException, IOException{
        obtenerConexion();
        PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_ADMINISTRADOR);
        declaracionInsertar.setString(1, administrador.getCodigo());
        declaracionInsertar.setString(2, administrador.getDPI());
        declaracionInsertar.setString(3, administrador.getNombre());
        declaracionInsertar.setString(4, administrador.getPasswoed());
        declaracionInsertar.executeUpdate();
    }
}