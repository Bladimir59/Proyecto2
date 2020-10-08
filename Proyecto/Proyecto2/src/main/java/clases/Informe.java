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
    private String tipo;
    private String informe;
    private Date fecha;
    private Time hora;

    public Informe(String codigo, String medico, String paciente, String tipo, String informe, Date fecha, Time hora) {
        this.codigo = codigo;
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
        this.informe = informe;
        this.fecha = fecha;
        this.hora = hora;
    }

    
    //este es un constructor para los archivos de xml
    public Informe(Element dato) {
        this.codigo = dato.getChildText("CODIGO");
        this.medico = dato.getChildText("MEDICO");
        this.paciente = dato.getChildText("PACIENTE");
        this.tipo=dato.getChildText("TIPO");
        this.informe = dato.getChildText("INFORME");
        this.fecha = manejador.Fecha.getDate(dato.getChildText("FECHA"));
        this.hora = manejador.Hora.getHora(dato.getChildText("HORA"));
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
