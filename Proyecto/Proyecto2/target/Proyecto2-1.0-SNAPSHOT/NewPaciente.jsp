<%-- 
    Document   : NewCliente
    Created on : 7/10/2020, 21:07:27
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
        <form name="formulario2" action="PacienteControl" method="post">
        <fieldset>
            <legend>
                <h1>Paciente:</h1>
            </legend>
            Codigo: <br/>
            <input type="text" size="30" name="codigo" />
            <br/> Nombre: 
            <br/><input type="text" size="30" name="nombre" required/>
            <br/> sexo: 
            <br/><input type="text" size="30" name="sexo" />
            <br/>
            <label for="start">Fecha Nacimiento:</label>
            <br/>
            <input type="date" name="fechaNacimieto" placeholder="dd-mm-yyyy" value="" min="1997-01-01" max="2030-12-31">
            <br/> DPI: 
            <br/><input type="text" size="30" name="dpi" />
            <br/> Telefono:
            <br/><input type="text" size="30" name="telefono" />
            <br/> Peso:
            <br/><input type="text" size="30" name="peso" />
            <br/> Tipo de Sangre:
            <br/><input type="text" size="30" name="sangre" />
            <br/> Correo Electronico:
            <br/><input type="text" size="30" name="correo" />            
            <button type="submit" name="accion" value="nuevoPaciente">Aceptar</button>
        </fieldset>
    </form>
    </body>
</html>
