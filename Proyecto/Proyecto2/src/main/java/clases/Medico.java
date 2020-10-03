package clases;

//clases importadas para fecha
import java.sql.Date;

/**
 *
 * @author Bladimir
 * esta clase es de doctor y hereda de persona ademas tiene sus propios metodos
 */
public class Medico extends Persona{
    
    
    private String numeroColegiado;
    private String horaInicio;
    private String horaFin;
    private Date fechaInico;

    //este metodo funciona como fucion del padre
    //contructor para nuevo Medico

    public Medico(String numeroColegiado, String horaInicio, String horaFin, Date fechaInico, String codigo, String nombre, String DPI, String correoElectronico, String telefono, String password) {
        super(codigo, nombre, DPI, correoElectronico, telefono, password);
        this.numeroColegiado = numeroColegiado;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fechaInico = fechaInico;
    }
        
    
    
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Date getFechaInico() {
        return fechaInico;
    }

    public void setFechaInico(Date fechaInico) {
        this.fechaInico = fechaInico;
    }

    
}
