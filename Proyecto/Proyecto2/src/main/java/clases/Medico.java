package clases;

/**
 *
 * @author Bladimir
 * esta clase es de doctor y hereda de persona ademas tiene sus propios metodos
 */
public class Medico extends Persona{
    
    
    private String numeroColegiado;
    private String horaInicio;
    private String horaFin;

    public Medico(String codigo, String nombre, String DPI, String cooreoElectronico, String telefono, String password) {
        super(codigo, nombre, DPI, cooreoElectronico, telefono, password);
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

    
}
