package clases;

import java.io.Serializable;
import org.jdom2.Element;

/**
 *
 * @author Bladimir
 * clase generica de persona que heredara a mas clases
 */
public class Persona implements Serializable{
    private String codigo;
    private String nombre;
    private String DPI;
    private String correoElectronico;
    private String telefono;
    private String password;

    public Persona(String codigo, String nombre, String DPI, String correoElectronico, String telefono, String password) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.DPI = DPI;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.password = password;
    }
//para el ingreso de un paciente que no necesita contrase;a
    public Persona(String codigo, String nombre, String DPI, String correoElectronico, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.DPI = DPI;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }
    //para la carga de archivo
    public Persona(Element persona) {
        this.codigo = persona.getChildText("CODIGO");
        this.nombre = persona.getChildText("NOMBRE");
        this.DPI = persona.getChildText("DPI");
        this.correoElectronico = persona.getChildText("CORREO");
        this.telefono=persona.getChildText("TELEFONO");
        this.password = persona.getChildText("PASSWORD");
    }
    
    //constructor para medicos
    
    public Persona(String codigo, String nombre, String cooreoElectronico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
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

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String cooreoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
            
}
