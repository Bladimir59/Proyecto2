package clases;

/**
 *
 * @author Pladimir
 * esta clase es de Paciente y hereda de persona ademas tiene sus propios metodos
 */
public class Paciente extends Persona{
    private String sexo;
    private String fechaNacimiento;
    private String peso;
    private String tipoSangre;

    public Paciente(String codigo, String nombre, String DPI, String cooreoElectronico, String telefono, String password) {
        super(codigo, nombre, DPI, cooreoElectronico, telefono, password);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    
}
