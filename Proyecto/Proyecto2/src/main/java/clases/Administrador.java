package clases;

/**
 *
 * @author Bladimir
 */
public class Administrador {
    private String codigo;
    private String DPI;
    private String nombre;
    private String passwoed;

    public Administrador(String codigo, String DPI, String nombre, String passwoed) {
        this.codigo = codigo;
        this.DPI = DPI;
        this.nombre = nombre;
        this.passwoed = passwoed;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswoed() {
        return passwoed;
    }

    public void setPasswoed(String passwoed) {
        this.passwoed = passwoed;
    }    
}
