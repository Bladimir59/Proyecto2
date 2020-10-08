package clases;

import java.sql.Date;
import java.sql.Time;
import org.jdom2.Element;

/**
 *
 * @author bladimir
 */
public class Informe {
    private String codigo;
    private String medico;
    private String paciente;
    private String informe;
    private Date fecha;
    private Time hora;

    public Informe(String codigo, String medico, String paciente, String informe, Date fecha, Time hora) {
        this.codigo = codigo;
        this.medico = medico;
        this.paciente = paciente;
        this.informe = informe;
        this.fecha = fecha;
        this.hora = hora;
    }
    //este es un constructor para los archivos de xml
    public Administrador(Element dato) {
        this.codigo = dato.getChildText("CODIGO");
        this.DPI = dato.getChildText("DPI");
        this.nombre = dato.getChildText("NOMBRE");
        this.passwoed = dato.getChildText("PASSWORD");
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
}
