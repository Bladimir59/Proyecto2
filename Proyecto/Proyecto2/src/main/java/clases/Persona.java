package clases;

/**
 *
 * @author Bladimir
 * clase generica de persona que heredara a mas clases
 */
public class Persona {
    private String codigo;
    private String nombre;
    private String DPI;
    private String cooreoElectronico;
    private String telefono;
    private String password;

    public Persona(String codigo, String nombre, String DPI, String cooreoElectronico, String telefono, String password) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.DPI = DPI;
        this.cooreoElectronico = cooreoElectronico;
        this.telefono = telefono;
        this.password = password;
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

    public String getCooreoElectronico() {
        return cooreoElectronico;
    }

    public void setCooreoElectronico(String cooreoElectronico) {
        this.cooreoElectronico = cooreoElectronico;
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
