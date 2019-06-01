<%-- 
    Document   : RegistroUser
    Created on : May 31, 2019, 4:39:00 PM
    Author     : David Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Usuario</title>
    </head>
    <body>
        <h1>Registro Usuario</h1>
            <form action="RegistroNormal" method="post">
            <label>Nombre: </label><input type="text" name="nombre"><br><br>
            <label>Contraseña: </label><input type="password" name="pass"><br><br>
            <label>Correo Electronico: </label><input type="text" name="correo"><br><br>
            <label>Fecha de nacimiento: </label><input type="date" name="fechaN"><br><br>
            <label>Tipo de Subscripcion: </label><input type="text" name="tipoSubs"><br><br>
            <label>Domicilio: </label><input type="text" name="domicilio"><br><br>
            <input type="submit" name="enviar" value="Registro">
            </form>
            
    </body>
</html>
