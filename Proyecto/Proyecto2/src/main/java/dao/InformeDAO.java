package dao;

import clases.Informe;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bladimir
 */
public class InformeDAO {
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_INFORME= "INSERT INTO Informe (codigoInforme, Medico_codigoMedico,"
            + " Paciente_codigoPaciente, informe, fechaInforme, hora) "
            + "VALUES(?, ?, ?, ?, ?, ?)";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void crearAdminitrador(Informe informe){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_INFORME);
            declaracionInsertar.setString(1, informe.getCodigo());
            declaracionInsertar.setString(2, informe.getMedico());
            declaracionInsertar.setString(3, informe.getPaciente());
            declaracionInsertar.setString(4, informe.getInforme());
            declaracionInsertar.setDate(5, informe.getFecha());
            declaracionInsertar.setTime(6, informe.getHora());
            declaracionInsertar.executeUpdate();  
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
    
}
