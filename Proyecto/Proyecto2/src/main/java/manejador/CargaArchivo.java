package manejador;

import clases.Administrador;
import clases.Cita;
import clases.Especialidad;
import clases.Examen;
import clases.Informe;
import clases.Laboratorista;
import clases.Medico;
import clases.Paciente;
import clases.Resultado;
import clases.Union;
import dao.AdministradorDAO;
import dao.CitaDAO;
import dao.EspecialidadDAO;
import dao.ExamenDAO;
import dao.InformeDAO;
import dao.LaboratoristaDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import dao.ResultadoDAO;
import dao.UnionDAO;
import java.io.IOException;
import java.io.InputStream;
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
        especialidad();
        medico();
        cita();
        informe();
        resultado();
        Union();
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
        List<Cita> listaCita = new ArrayList<>();
        List<Element> lista = getDatos("cita");
        for (int i=0; i<lista.size();i++) {
            listaCita.add(new Cita(lista.get(i)));
            System.out.println(lista.toString());
        }

        CitaDAO dao = new CitaDAO();
        for (Cita info : listaCita) {
            dao.crearCita(info);
            System.out.println(info.toString());
        }
    }
    public void especialidad(){
        List<Especialidad> listaEspecialidades= new ArrayList<>();
        List<Element> lista = getDatos("consulta");
        for (int i=0; i<lista.size();i++) {
            
            listaEspecialidades.add(new Especialidad(lista.get(i)));
            System.out.println(lista.toString());
        }

        EspecialidadDAO dao = new EspecialidadDAO();
        for (Especialidad info : listaEspecialidades) {
            dao.crearEspecialidad(info);
            System.out.println(info.toString());
        }
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
        List<Informe> listaInforme= new ArrayList<>();
        List<Element> lista = getDatos("reporte");
        for (int i=0; i<lista.size();i++) {
            
            listaInforme.add(new Informe(lista.get(i)));
            System.out.println(lista.toString());
        }

        InformeDAO dao = new InformeDAO();
        for (Informe info : listaInforme) {
            dao.crearInforme(info);
            System.out.println(info.toString());
        }
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
        List<Resultado> listaResultado= new ArrayList<>();
        List<Element> lista = getDatos("resultado");
        for (int i=0; i<lista.size();i++) {
            
            listaResultado.add(new Resultado(lista.get(i)));
            System.out.println(lista.toString());
        }

        ResultadoDAO dao = new ResultadoDAO();
        for (Resultado info : listaResultado) {
            dao.crearResultado(info);
            System.out.println(info.toString());
        }
    }
    public void Union(){
        List<Union> listaEspecialidad= new ArrayList<>();
        List<Element> lista = getDatos("doctor");
        for (int i=0; i<lista.size();i++) {
            
            listaEspecialidad.add(new Union(lista.get(i)));
            System.out.println(lista.toString());
        }

        UnionDAO dao = new UnionDAO();
        for (Union info : listaEspecialidad) {
            dao.llenarUnion(info);
            System.out.println(info.toString());
        }
    }
}
