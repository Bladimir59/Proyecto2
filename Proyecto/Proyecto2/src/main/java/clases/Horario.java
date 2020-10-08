/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Time;
import org.jdom2.Element;

/**
 *
 * @author bladimir
 */
public class Horario {
    private String codigoMedico;
    private String codigLab;
    private String dia;
    private Time horaEntrada;
    private Time horaSalida;
    //para el medico

    public Horario(String codigoMedico, String dia, Time horaEntrada, Time horaSalida) {
        this.codigoMedico = codigoMedico;
        this.dia = dia;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    //este es un constructor para los archivos de xml
    public Administrador(Element dato) {
        this.codigo = dato.getChildText("CODIGO");
        this.DPI = dato.getChildText("DPI");
        this.nombre = dato.getChildText("NOMBRE");
        this.passwoed = dato.getChildText("PASSWORD");
    }
    
    public Horario(String codigLab, String dia) {
        this.codigLab = codigLab;
        this.dia = dia;
    }

    public String getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public String getCodigLab() {
        return codigLab;
    }

    public void setCodigLab(String codigLab) {
        this.codigLab = codigLab;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }
    
}
