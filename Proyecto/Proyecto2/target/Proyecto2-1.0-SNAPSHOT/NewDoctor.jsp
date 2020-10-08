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
       <form name="formulario1" action="/recursosEnServidor">
        <fieldset>
            <legend>
                <h1>DOCTOR:</h1>
            </legend>
            Codigo: <br/>
            <input type="text" size="30" name="nombre" />
            <br/> Nombre: 
            <br/><input type="text" size="30" name="email" />
            <br/> Colegiado: 
            <br/><input type="text" size="30" name="email" />
            <br/> DPI: 
            <br/><input type="text" size="30" name="email" />
            <br/> Listado Especialidad: 
            <br/><input type="text" size="30" name="email" />
            <br/> Correo: 
            <br/><input type="text" size="30" name="email" />
            <br/> Horario
            <br/> Inicio: 
            <br/><input type="text" size="30" name="email" />
            <br/> Fin: 
            <br/><input type="text" size="30" name="telefono" />
            <br/>
            <label for="start">Fecha Inico:</label>
            <input type="date" id="start" name="trip-start" value="2018-07-22" min="2018-01-01" max="2018-12-31">
            <br/> contrase;a: 
            <br/><input type="password" size="30" name="contra" />
            <br/>
            <button type="submit">
                enviar datos
            </button>
        </fieldset>
    </form>
    </body>
</html>
