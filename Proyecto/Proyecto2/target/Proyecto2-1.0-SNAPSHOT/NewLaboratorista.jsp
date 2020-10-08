<%-- 
    Document   : NewLaboratorista
    Created on : 7/10/2020, 10:11:23
    Author     : bladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <br/> Registro: 
            <br/><input type="text" size="30" name="email" />
            <br/> DPI: 
            <br/><input type="text" size="30" name="email" />
            <br/> Telefono: 
            <br/><input type="text" size="30" name="email" />
            <br/> Examen: 
            <br/><input type="text" size="30" name="email" />
            <br/> Dias:
            <br/> Correo:
            <br/><input type="text" size="30" name="email" />
            <br/> Fecha Inicio: 
            <br/><input type="text" size="30" name="telefono" />
            <br/> contrase;a: 
            <br/><input type="text" size="30" name="telefono" />
            <br/>
            <button type="submit">
                enviar datos
            </button>
        </fieldset>
    </form>
    </body>
</html>
