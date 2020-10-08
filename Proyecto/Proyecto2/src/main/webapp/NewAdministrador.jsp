<%-- 
    Document   : NewAdministrador
    Created on : 7/10/2020, 10:07:24
    Author     : bladimir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="formulario1" action="AdministradorControl" method="post">
            <fieldset>
                <legend>
                    <h1>Administrador:</h1>
                </legend>
                Codigo: <br/>
                <input type="text" size="30" name="codigo" />
                <br/> Nombre: 
                <br/><input type="text" size="30" name="nombre" />
                <br/> DPI: 
                <br/><input type="text" size="30" name="DPI" />
                <br/> Contrase;a: 
                <br/><input type="password" size="30" name="password" />
                <br/>
                <button type="submit" name="accion" value="nuevoAdministrador">Aceptar</button>
            </fieldset>
    </form>
    </body>
</html>
