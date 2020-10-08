<%-- 
    Document   : NewAdministrador
    Created on : 7/10/2020, 10:07:24
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
                <h1>Administrador:</h1>
            </legend>
            Codigo: <br/>
            <input type="text" size="30" name="nombre" />
            <br/> DPI: 
            <br/><input type="text" size="30" name="email" />
            <br/> Nombre: 
            <br/><input type="text" size="30" name="email" />
            <br/> Contrase;a: 
            <br/><input type="text" size="30" name="telefono" />
            <br/>
            <button type="submit">
                enviar datos
            </button>
        </fieldset>
    </form>
    </body>
</html>
