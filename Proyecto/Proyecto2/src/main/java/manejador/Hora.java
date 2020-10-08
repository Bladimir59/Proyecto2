/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import java.text.SimpleDateFormat;

/**
 *
 * @author bladimir
 */
public class Hora {
    public static java.sql.Time getHora(String hora){
        java.sql.Time dato=null;
        try {
            SimpleDateFormat formato=new SimpleDateFormat("HH:mm");
            java.util.Date fecha=formato.parse(hora);
            dato=new java.sql.Time(fecha.getTime());
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return dato;
    }
}
