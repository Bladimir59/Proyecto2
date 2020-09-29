package clases;

/**
 *
 * @author bladimir
 * esta clase es de laboratorista y hereda de persona ademas tiene sus propios metodos
 */
public class Laboratorista extends Persona{
    private String numeroRegistro;
    private String fechaInico;

    public Laboratorista(String codigo, String nombre, String DPI, String cooreoElectronico, String telefono, String password) {
        super(codigo, nombre, DPI, cooreoElectronico, telefono, password);
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getFechaInico() {
        return fechaInico;
    }

    public void setFechaInico(String fechaInico) {
        this.fechaInico = fechaInico;
    }
    
}
