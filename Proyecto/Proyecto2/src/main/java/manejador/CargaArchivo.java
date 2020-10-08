package manejador;

import clases.Administrador;
import clases.Cita;
import clases.Examen;
import clases.Laboratorista;
import clases.Medico;
import clases.Paciente;
import dao.AdministradorDAO;
import dao.CitaDAO;
import dao.ExamenDAO;
import dao.LaboratoristaDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.Part;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author bladimir
 */
public class CargaArchivo {
    private final Part direccion;

    public CargaArchivo(Part direccion) {
        this.direccion = direccion;
    }
    
    public void archivo(){
        administrador();
        examen();
        laboratorista();
        paciente();
        medico();
    }
    private List<Element> getDatos(String eleccion) {
        List<Element> elementos = new ArrayList<>();
        System.out.println("datos "+elementos.size());
        try {
            SAXBuilder builder = new SAXBuilder();
            InputStream archivo = direccion.getInputStream();
            Document document = builder.build(archivo);
            Element root = document.getRootElement();
            elementos = root.getChildren(eleccion);

        } catch (JDOMException | IOException ex) {
            ex.printStackTrace(System.out);
        }
        return elementos;
    }
    public void administrador(){
        List<Administrador> listaAdministrador = new ArrayList<>();
        List<Element> lista = getDatos("admin");
        for (int i=0; i<lista.size();i++) {
            listaAdministrador.add(new Administrador(lista.get(i)));
            System.out.println(lista.toString());
        }

        AdministradorDAO dao = new AdministradorDAO();
        for (Administrador info : listaAdministrador) {
            dao.crearAdminitrador(info);
            System.out.println(info.toString());
        }
    }
    public void cita(){
//        List<Cita> listaCita = new ArrayList<>();
//        List<Element> lista = getDatos("cita");
//        for (int i=0; i<lista.size();i++) {
//            listaCita.add(new Cita(lista.get(i)));
//            System.out.println(lista.toString());
//        }
//
//        CitaDAO dao = new CitaDAO();
//        for (Cita info : listaCita) {
//            dao.crearCita(info);
//            System.out.println(info.toString());
//        }
    }
    public void consulta(){
        
    }
    public void especialidad(){
        
    }
    public void examen(){
        List<Examen> listaExamen= new ArrayList<>();
        List<Element> lista = getDatos("examen");
        for (int i=0; i<lista.size();i++) {
            
            listaExamen.add(new Examen(lista.get(i)));
            System.out.println(lista.toString());
        }

        ExamenDAO dao = new ExamenDAO();
        for (Examen info : listaExamen) {
            dao.crearExamen(info);
            System.out.println(info.toString());
        }
    }
    public void informe(){
        
    }
    public void laboratorista(){
        List<Laboratorista> listaLaboratorista= new ArrayList<>();
        List<Element> lista = getDatos("laboratorista");
        for (int i=0; i<lista.size();i++) {
            
            listaLaboratorista.add(new Laboratorista(lista.get(i)));
            System.out.println(lista.toString());
        }

        LaboratoristaDAO dao = new LaboratoristaDAO();
        for (Laboratorista info : listaLaboratorista) {
            dao.crearlaboratorista(info);
            System.out.println(info.toString());
        }
    }
    public void medico(){
        List<Medico> listaMedico = new ArrayList<>();
        List<Element> lista = getDatos("doctor");
        for (int i=0; i<lista.size();i++) {
            
            listaMedico.add(new Medico(lista.get(i)));
            System.out.println(lista.toString());
        }

        MedicoDAO dao = new MedicoDAO();
        for (Medico info : listaMedico) {
            dao.crearMedico(info);
            System.out.println(info.toString());
        }
    }
    public void paciente(){
        List<Paciente> listaPaciente= new ArrayList<>();
        List<Element> lista = getDatos("paciente");
        for (int i=0; i<lista.size();i++) {
            
            listaPaciente.add(new Paciente(lista.get(i)));
            System.out.println(lista.toString());
        }

        PacienteDAO dao = new PacienteDAO();
        for (Paciente info : listaPaciente) {
            dao.crearPaciente(info);
            System.out.println(info.toString());
        }
    }
    public void resultado(){
        
    }
}
