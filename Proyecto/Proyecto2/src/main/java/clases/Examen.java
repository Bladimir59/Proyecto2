
package clases;

import java.io.Serializable;
import org.jdom2.Element;

/**
 *
 * @author bladimir
 */
public class Examen implements Serializable{
    private String codigo;
    private String nombre;
    private boolean orden;
    private String descripcion;
    private double costo;
    private String informe;

    public Examen(String codigo, String nombre, boolean orden, String descripcion, double costo, String informe) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.orden = orden;
        this.descripcion = descripcion;
        this.costo = costo;
        this.informe = informe;
    }
    //este es un constructor para los archivos de xml
    public Examen(Element dato) {
        this.codigo = dato.getChildText("CODIGO");
        this.nombre = dato.getChildText("NOMBRE");
        this.orden = Boolean.parseBoolean(dato.getChildText("ORDEN"));
        this.descripcion = dato.getChildText("DESCRIPCION");
        this.costo = Double.parseDouble(dato.getChildText("COSTO"));
        this.informe=dato.getChildText("INFORME");
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isOrden() {
        return orden;
    }

    public void setOrden(boolean orden) {
        this.orden = orden;
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

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
       
    
}
