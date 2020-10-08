package main;

import clases.Administrador;
import clases.Especialidad;
import clases.Examen;
import clases.Horario;
import clases.Laboratorista;
import clases.Medico;
import clases.Paciente;
import clases.Union;
import conexion.Conectar;
import dao.AdministradorDAO;
import dao.EspecialidadDAO;
import dao.ExamenDAO;
import dao.HorarioMedicoDAO;
import dao.LaboratoristaDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import dao.UnionDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import manejador.Verificar;

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



        //NUEVO EXAMEN
        String codigo="b"; 
        ExamenDAO insertar=new ExamenDAO();
        Examen llenar=new Examen(codigo, "saber", true, "descripcion", 600, "pdf");
        insertar.crearExamen(llenar);

//        nueva especialidad
//        EspecialidadDAO insetar=new EspecialidadDAO();
//        Especialidad llenar=new Especialidad("nombre", "desc");
//        insetar.crearEspecialidad(llenar);

        String codigolab="ho";
        String nombre="bladimir";
        String colegiado="dass";
        String DPI="dass";
        String especialidade="como";
        String horae="08:30";
        String horas="08:30";
        String fecha="2020-10-01";
        String contra="no se";
//        dao.MedicoDAO insertar=new MedicoDAO();
//        Medico llenar=new Medico(colegiado, manejador.Fecha.getDate(fecha), codigo, nombre, DPI, colegiado, colegiado, contra);
//        insertar.crearMedico(llenar);
//        dao.HorarioMedicoDAO ins=new HorarioMedicoDAO();
//        Horario llen=new Horario(codigo, DPI, manejador.Hora.getHora(horae), manejador.Hora.getHora(horas));
//        ins.crearHorario(llen);
//        
//        //llenando especialidade3s
//        List<String> lista=new ArrayList<>();
//        lista.add("hola");
//        lista.add("como");
//        lista.add("esta");
//        lista.add("esta");
//        lista.add("papa");
//        EspecialidadDAO llenando =new EspecialidadDAO();
//        
//        for(int i=0;i<lista.size();i++){
//            Especialidad lleno=new Especialidad(lista.get(i), codigo,50);
//            llenando.crearEspecialidad(lleno);
//        }
//        dao.UnionDAO llena=new UnionDAO();
//        Union nuevo=new Union(codigo,especialidade);
//        llena.llenarUnion(nuevo);
        //aqui empieza para el laboratorista
        
        LaboratoristaDAO llamar=new LaboratoristaDAO();
        Laboratorista llenado=new Laboratorista(colegiado, manejador.Fecha.getDate(fecha), codigo, codigolab, nombre, DPI, colegiado, colegiado, contra);
        llamar.crearlaboratorista(llenado);
//    manejador.Verificar llamar=new Verificar();
//    System.out.println("que es "+llamar.siExiste());
    }   
    
    
}
