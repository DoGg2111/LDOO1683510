<%-- 
    Document   : RegistroAdmin.jsp
    Created on : May 31, 2019, 4:36:27 PM
    Author     : David Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Admin</title>
    </head>
    <body>
           <h1>Registrar Usuario Administrador</h1>
            <form action="RegistroAdmin" method="post">
            <label>Nombre: </label><input type="text" name="nombre" "><br><br>
            <label>Contraseña: </label><input type="password" name="pass""><br><br>
            <label>Correo Electronico: </label><input type="text" name="correo""><br><br>
            <label>Fecha de nacimiento: </label><input type="date" name="fechaN"><br><br>
            <label>Numero de Empleado: </label><input type="text" name="numEmpleado"><br><br>            
            <input type="submit" name="enviar" value="Registrar">
            <input type="reset" value="Cancelar" name="Cancelar" />
            </form>
    </body>
</html>
