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
public class Consulta {
    private String nombre;
    private Double monto;

    public Consulta(String nombre, Double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }
    //este es un constructor para los archivos de xml
    public Administrador(Element dato) {
        this.codigo = dato.getChildText("CODIGO");
        this.DPI = dato.getChildText("DPI");
        this.nombre = dato.getChildText("NOMBRE");
        this.passwoed = dato.getChildText("PASSWORD");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
                
}
