package dao;

import clases.Administrador;
import clases.Laboratorista;
import conexion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bladimir
 */
public class LaboratoristaDAO {
    //datos de los nombres de los queris
    private final String nombreTabla="Laboratorista";
    private final String codigo="codigoLaboratorista";
    private final String nombre="nombre";
    private final String numeroLab="numeroRegistro";
    private final String DPI="DPI";
    private final String telefono="telefono";
    private final String correo="correoElectronico";
    private final String fecha="fechaInicioTrabajo";
    private final String password="password";
    private final String examen="Examen_codigo";
    private static Connection cn;
    private static conexion.Conectar login;
    private static final String NUEVO_LABORATORISTA= "INSERT INTO Laboratorista (codigoLaboratorista,nombre,numeroRegistro"
            + ",DPI,telefono,correoElectronico,fechaInicioTrabajo,password,Examen_codigo) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, (SELECT codigo FROM Examen WHERE nombre=? LIMIT 1))";
    
    //conexion para la base de datos
    public static Connection obtenerConexion(){
        login= new Conectar();
        cn = login.getConnection();
        return cn;
    }
    //variables que son los queris o metodos de insecercion de sql
    
    //verificar usuario
    
    //insertar Medico
    public void crearlaboratorista(Laboratorista laboratorista){
        obtenerConexion();
        try{
            PreparedStatement declaracionInsertar = cn.prepareStatement(NUEVO_LABORATORISTA);
            declaracionInsertar.setString(1, laboratorista.getCodigo());
            declaracionInsertar.setString(2, laboratorista.getNombre());
            declaracionInsertar.setString(3, laboratorista.getNumeroRegistro());
            declaracionInsertar.setString(4, laboratorista.getDPI());
            declaracionInsertar.setString(5, laboratorista.getTelefono());
            declaracionInsertar.setString(6, laboratorista.getCorreoElectronico());
            declaracionInsertar.setDate(7, laboratorista.getFechaInico());
            declaracionInsertar.setString(8, laboratorista.getPassword());
            declaracionInsertar.setString(9, laboratorista.getExamen());
            declaracionInsertar.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
    public List<Laboratorista> listadoLaboratorista(){
        obtenerConexion();
        List<Laboratorista> listado = new ArrayList<>();
        String query="SELECT * FROM "+nombreTabla;
        PreparedStatement obtener=null;
        ResultSet rs=null;
        try{
            obtener=cn.prepareStatement(query);
            rs=obtener.executeQuery(query);
            while(rs.next()){
                String codigoDB=rs.getString(codigo);
                String nombreDB= rs.getString(nombre);
                String numeroLabDB= rs.getString(numeroLab);
                String DPIDB=rs.getString(DPI);
                String telefonoDB= rs.getString(telefono);
                String correoDB= rs.getString(correo);
                Date fechaDB=manejador.Fecha.getDate(rs.getString(fecha));
                String passwordDB= rs.getString(password);
                String examneDB= rs.getString(examen);
                Laboratorista lab=new Laboratorista(numeroLabDB, fechaDB, examneDB, codigoDB, nombreDB, DPIDB, correoDB, telefonoDB, passwordDB);
                lab.setCodigo(codigoDB);
                lab.setNombre(nombreDB);
                lab.setDPI(DPIDB);
                lab.setCorreoElectronico(correoDB);
                lab.setTelefono(telefonoDB);
                lab.setPassword(passwordDB);
                lab.setNumeroRegistro(numeroLabDB);
                lab.setFechaInico(fechaDB);
                lab.setExamen(examneDB);
                listado.add(lab);
            }    
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        return listado;
    }
}
