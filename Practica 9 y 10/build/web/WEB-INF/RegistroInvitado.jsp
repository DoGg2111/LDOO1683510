<%-- 
    Document   : RegistroInvitado
    Created on : May 31, 2019, 4:38:34 PM
    Author     : David Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Invitado</title>
    </head>
    <h1>Registro Usuario Invitado</h1>
        <form action="RegistroInvitado" method="post">
            <label>Nombre: </label><input type="text" name="nombre" ><br>
            <label>Contraseña: </label><input type="password" name="pass"><br>
            <label>Correo Electronico: </label><input type="text" name="correo"><br>
            <label>Fecha de nacimiento: </label><input type="date" name="fechaN"><br>
            <label>Fecha de registro</label><input type="date" name = "FechaRegistro"><br>
            <input type="submit" name="enviar" value="Registro"><br>
            
            </form>           
</html>
