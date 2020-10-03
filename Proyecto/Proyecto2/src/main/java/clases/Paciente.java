package clases;

import java.sql.Date;

/**
 *
 * @author Pladimir
 * esta clase es de Paciente y hereda de persona ademas tiene sus propios metodos
 */
public class Paciente extends Persona{
    private String sexo;
    private Date fechaNacimiento;
    private String peso;
    private String tipoSangre;

    public Paciente(String sexo, Date fechaNacimiento, String peso, String tipoSangre, String codigo, String nombre, String DPI, String correoElectronico, String telefono) {
        super(codigo, nombre, DPI, correoElectronico, telefono);
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
    }

    


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
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
