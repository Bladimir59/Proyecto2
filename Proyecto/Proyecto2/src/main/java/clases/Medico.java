package clases;

//clases importadas para fecha
import java.sql.Date;
import org.jdom2.Element;

/**
 *
 * @author Bladimir
 * esta clase es de doctor y hereda de persona ademas tiene sus propios metodos
 */
public class Medico extends Persona{
    
    private String numeroColegiado;
    private Date fechaInico;

    public Medico(String numeroColegiado, Date fechaInico, String codigo, String nombre, String DPI, String correoElectronico, String telefono, String password) {
        super(codigo, nombre, DPI, correoElectronico, telefono, password);
        this.numeroColegiado = numeroColegiado;
        this.fechaInico = fechaInico;
    }
    //este es un constructor para los archivos de xml
    public Medico(Element dato) {
        super(dato);
        this.numeroColegiado = dato.getChildText("COLEGIADO");
        this.fechaInico = manejador.Fecha.getDate(dato.getChildText("TRABAJO"));
    }
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public Date getFechaInico() {
        return fechaInico;
    }

    public void setFechaInico(Date fechaInico) {
        this.fechaInico = fechaInico;
    }
    
}
