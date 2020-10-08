package clases;

import java.io.Serializable;
import java.sql.Date;
import org.jdom2.Element;

/**
 *
 * @author bladimir
 * esta clase es de laboratorista y hereda de persona ademas tiene sus propios metodos
 */
public class Laboratorista extends Persona implements Serializable{
    private String numeroRegistro;
    private Date fechaInico;
    private String examen;

    public Laboratorista(String numeroRegistro, Date fechaInico, String examen, String codigo, String nombre, String DPI, String correoElectronico, String telefono, String password) {
        super(codigo, nombre, DPI, correoElectronico, telefono, password);
        this.numeroRegistro = numeroRegistro;
        this.fechaInico = fechaInico;
        this.examen = examen;
    }
    //este es un constructor para los archivos de xml
    public Laboratorista(Element dato) {
        super(dato);
        this.numeroRegistro = dato.getChildText("REGISTRO");
        this.examen = dato.getChildText("EXAMEN");
        this.fechaInico=manejador.Fecha.getDate(dato.getChildText("FECHA"));
    }
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Date getFechaInico() {
        return fechaInico;
    }

    public void setFechaInico(Date fechaInico) {
        this.fechaInico = fechaInico;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }    
}
