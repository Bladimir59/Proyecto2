package clases;

import org.jdom2.Element;

/**
 *
 * @author bladimir
 */
public class Especialidad {
    private String nombre;
    private String descripcion;
    private double costo;

    public Especialidad(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }
    //este es un constructor para los archivos de xml
    public Especialidad(Element dato) {
        this.nombre = dato.getChildText("TIPO");
        this.descripcion = dato.getChildText(null);
        this.costo = Double.parseDouble(dato.getChildText("COSTO"));
    }
    //para la carga de archivo

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }   
}
