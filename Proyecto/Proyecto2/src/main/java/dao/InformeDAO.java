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
    private static final String NUEVO_INFORME= "INSERT INTO Informe ( codigoInforme, Medico_codigoMedico,"
            + " Paciente_codigoPaciente, informe, fechaInforme, hora, Especialidad_idEspecialidad)"
            + "VALUES(?, ?, ?, ?, ?, ?, (SELECT idEspecialidad FROM Especialidad WHERE nombreEspecialidad=? LIMIT 1))";
    //INSERT INTO Informe(codigoInforme , Medico_codigoMedico , Paciente_codigoPaciente , informe ,fechaInforme,hora,Especialidad_idEspecialidad) 
    //VALUES('469607','MED-852','177840','Sed tellus magna, fermentum ut nisl ut, cursus sagittis justo. In dapibus porttitor ex, eu porttitor nisi rhoncus non. In mattis risus lacus, id aliquet lectus egestas tincidunt. Aenean arcu risus, ultricies non vestibulum vel, ultricies sit amet lorem. Quisque laoreet, dolor at mollis elementum, ex libero sagittis mi, at viverra ipsum odio ut sapien. Donec posuere dui at nisl euismod, volutpat placerat lectus tincidunt. Vestibulum eleifend quam laoreet velit mattis sagittis.','2020-01-10','16:00','4');
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void crearInforme(Informe informe){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_INFORME);
            declaracionInsertar.setString(1, informe.getCodigo());
            declaracionInsertar.setString(2, informe.getMedico());
            declaracionInsertar.setString(3, informe.getPaciente());
            declaracionInsertar.setString(4, informe.getInforme());
            declaracionInsertar.setDate(5, informe.getFecha());
            declaracionInsertar.setTime(6, informe.getHora());
            declaracionInsertar.setString(7, informe.getTipo());
            declaracionInsertar.executeUpdate();  
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
    
}
