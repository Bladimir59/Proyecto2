package main;

import clases.Administrador;
import clases.Examen;
import clases.Medico;
import clases.Paciente;
import conexion.Conectar;
import dao.AdministradorDAO;
import dao.ExamenDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Bladimir
 */
public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        //llamar para ver los usos de ejemplo del proyecto
//        MedicoDAO insertar=new MedicoDAO();
//        Medico llenar=new Medico("hola prueba", "hola prueba", "hola prueba", "hola prueba", "hola prueba", "hola prueba"
//                , "hola prueba", "hola prueba", "hola prueba", "hola prueba");
//        insertar.crearMedico(llenar);
//para llenar a PACIENTE
//        String fechaPrueba="2020-02-10";
//        PacienteDAO insertar=new PacienteDAO();
//        Paciente llenar=new Paciente("a",manejador.Fecha.getDate(fechaPrueba), "a","A" , "d", "a", "a", "a", "a");
//        insertar.crearPaciente(llenar);
//        PARA NUEVO ADMINISTRADOR
//        AdministradorDAO insertar=new AdministradorDAO();
//        Administrador llenar=new Administrador("codigo","dpi", "nombre", "contyrase;a");
//        insertar.crearAdminitrador(llenar);
        //NUEVO EXAMEN
        ExamenDAO insertar=new ExamenDAO();
        Examen llenar=new Examen("a", "saber", true, "descripcion", 600, "pdf");
        insertar.crearExamen(llenar);
        
    }
    
    
}
