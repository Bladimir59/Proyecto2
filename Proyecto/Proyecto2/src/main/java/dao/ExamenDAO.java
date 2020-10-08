/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Examen;
import conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class ExamenDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_EXAMEN= "INSERT INTO Examen (codigo,nombre,orden,descripcion,costo,informe) "
            + "VALUES(?, ?, ? ,?, ?, ?)";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    public void crearExamen(Examen examen){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_EXAMEN);
            declaracionInsertar.setString(1, examen.getCodigo());
            declaracionInsertar.setString(2, examen.getNombre());
            declaracionInsertar.setBoolean(3, examen.isOrden());
            declaracionInsertar.setString(4, examen.getDescripcion());
            declaracionInsertar.setDouble(5, examen.getCosto());
            declaracionInsertar.setString(6, examen.getInforme());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
    
}
