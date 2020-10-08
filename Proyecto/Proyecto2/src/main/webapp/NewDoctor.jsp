<%-- 
    Document   : Doctor
    Created on : 6/10/2020, 20:57:09
    Author     : bladimir
--%>
<%-- formulario para nuevo doctor--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="formulario1" action="DoctorControl" method="post">
        <fieldset>
            <legend>
                <h1>DOCTOR:</h1>
            </legend>
            Codigo: <br/>
            <input type="text" size="30" name="codigo"/>
            <br/> Nombre: 
            <br/><input type="text" size="30" name="nombre"/>
            <br/> Colegiado: 
            <br/><input type="text" size="30" name="colegiado"/>
            <br/> DPI: 
            <br/><input type="text" size="30" name="dpi"/>
            <br/> Listado Especialidad: 
            <br/><input type="text" size="30" name="lista"/>
            <br/> Correo: 
            <br/><input type="text" size="30" name="correo"/>
            <br/> Telefono: 
            <br/><input type="text" size="30" name="telefono"/>
            <br/> Horario
            <br/> Inicio: 
            <br/><input type="text" size="30" name="horaInicio"/>
            <br/> Fin: 
            <br/><input type="text" size="30" name="horaSalida"/>
            <br/>
            <label for="start">Fecha Inico:</label>
            <input type="date" id="start" name="fecha" value="2018-07-22">
            <br/> contrase;a: 
            <br/><input type="text" size="30" name="contra"/>
            <br/>
            <button type="submit" name="accion" value="nuevoDoctor">
                enviar datos
            </button>
        </fieldset>
    </form>
    </body>
</html>
