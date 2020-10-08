<%-- 
    Document   : NewExamen
    Created on : 7/10/2020, 21:10:00
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
        <form name="formulario1" action="ExamenControl" method="post">
            <fieldset>
                <legend>
                    <h1>Examen:</h1>
                </legend>
                Codigo: <br/>
                <input type="text" size="30" name="codigo" />
                <br/> Nombre: 
                <br/><input type="text" size="30" name="nombre" />
                <br/> Orden: 
                <br/><input type="text" size="30" name="orden" />
                <br/> costo: 
                <br/><input type="text" size="30" name="costo" />
                <br/> Informe: 
                <br/><input type="text" size="30" name="informe"/>
                <br/>Descripcion
                <br/><textarea name="desc" rows="10" cols="40">la Descripcion del Examen</textarea>
                <button type="submit" name="accion" value="nuevoExamen">Aceptar</button>
            </fieldset>
    </form>
    </body>
</html>
