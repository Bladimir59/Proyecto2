package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.Time;
import org.jdom2.Element;

/**
 *
 * @author bladimir
 */
public class Resultado {
    private String codigo;
    private String paciente;
    private String examen;
    private String laborarotista;
    private String medico;
    private boolean orden;
    private InputStream informe;
    private Date fecha;
    private Time hora;

    public Resultado(String codigo, String paciente, String examen, String laborarotista, String medico, boolean orden, InputStream informe, Date fecha, Time hora) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.examen = examen;
        this.laborarotista = laborarotista;
        this.medico = medico;
        this.orden = orden;
        this.informe = informe;
        this.fecha = fecha;
        this.hora = hora;
    }
    //este es un constructor para los archivos de xml
    public Resultado(Element dato) {
        this.codigo = dato.getChildText("CODIGO");
        this.paciente = dato.getChildText("PACIENTE");
        this.examen = dato.getChildText("EXAMEN");
        this.laborarotista=dato.getChildText("LABORATORISTA");
        this.medico = dato.getChildText("MEDICO");
        this.orden = Boolean.parseBoolean(dato.getChildText("ORDEN"));
        try {
            String ord = dato.getChildText("INFORME");
            String rs = dato.getChildText("INFORME");

            if (ord.length() > 0) {
                System.out.println(ord.length());
                this.informe = new FileInputStream(new File(ord));
            }

            if (rs.length() > 0) {
                System.out.println(rs.length());
                this.informe = new FileInputStream(new File(rs));
            }

        } catch (FileNotFoundException ex) {
            //ex.printStackTrace(System.out);
            System.out.println("Pruebas sin archivos");
        }
        this.fecha = manejador.Fecha.getDate(dato.getChildText("FECHA"));
        this.hora=manejador.Hora.getHora(dato.getChildText("HORA"));
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public String getLaborarotista() {
        return laborarotista;
    }

    public void setLaborarotista(String laborarotista) {
        this.laborarotista = laborarotista;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public boolean isOrden() {
        return orden;
    }

    public void setOrden(boolean orden) {
        this.orden = orden;
    }

    public InputStream getInforme() {
        return informe;
    }

    public void setInforme(InputStream informe) {
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
