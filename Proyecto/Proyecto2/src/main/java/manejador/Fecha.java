package manejador;

import java.text.SimpleDateFormat;

/**
 *
 * @author bladimir
 */
public class Fecha {
    public static java.sql.Date getDate(String fechainicial){
        java.sql.Date dato=null;
        try {
            SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fecha=formato.parse(fechainicial);
            dato=new java.sql.Date(fecha.getTime());
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return dato;
    }
    
}
