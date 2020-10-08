package dao;

import clases.Administrador;
import clases.Laboratorista;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class LaboratoristaDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_LABORATORISTA= "INSERT INTO Laboratorista (codigoLaboratorista,nombre,numeroRegistro"
            + ",DPI,telefono,correoElectronico,fechaInicioTrabajo,password,Examen_codigo) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, (SELECT codigo FROM Examen WHERE nombre=? LIMIT 1))";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void crearlaboratorista(Laboratorista laboratorista){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_LABORATORISTA);
            declaracionInsertar.setString(1, laboratorista.getCodigo());
            declaracionInsertar.setString(2, laboratorista.getNombre());
            declaracionInsertar.setString(3, laboratorista.getNumeroRegistro());
            declaracionInsertar.setString(4, laboratorista.getDPI());
            declaracionInsertar.setString(5, laboratorista.getTelefono());
            declaracionInsertar.setString(6, laboratorista.getCorreoElectronico());
            declaracionInsertar.setDate(7, laboratorista.getFechaInico());
            declaracionInsertar.setString(8, laboratorista.getPassword());
            declaracionInsertar.setString(9, laboratorista.getExamen());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
}
