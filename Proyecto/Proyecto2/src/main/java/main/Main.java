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
    public static void main(String[] args){
        
        AdministradorDAO ver=new AdministradorDAO();
        List<Administrador> listado=ver.listadoAdministradore();
        for(int i=0; i<listado.size(); i++){
            System.out.println("codigo "+listado.get(i).getCodigo()+" nombre "+listado.get(i).getPasswoed()+"\n");
            if(("1234".equals(listado.get(i).getCodigo()))&&("123456".equals(listado.get(i).getPasswoed()))){
                System.out.println("existe");
            }
        }
        LaboratoristaDAO revisar=new LaboratoristaDAO();
        List<Laboratorista> lista=revisar.listadoLaboratorista();
        for(int i=0; i<lista.size(); i++){
            System.out.println("codigo "+lista.get(i).getCodigo()+" nombre "+lista.get(i).getPassword()+" fecha "+lista.get(i).getFechaInico()+"\n");
        }
    }   
    
    
}
