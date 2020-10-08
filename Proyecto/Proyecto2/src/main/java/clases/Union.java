/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.jdom2.Element;

/**
 *
 * @author bladimir
 */
public class Union {
    private String idMedico;
    private String nombreEspecialidad;

    public Union(String idMedico, String nombreEspecialidad) {
        this.idMedico = idMedico;
        this.nombreEspecialidad = nombreEspecialidad;
    }
    //este es un constructor para los archivos de xml
    public Union(Element dato) {
        this.idMedico = dato.getChildText("CODIGO");
        this.nombreEspecialidad = dato.getChildText("TITULO");
    }
    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    
}
