<%-- 
    Document   : Login
    Created on : May 31, 2019, 5:44:05 PM
    Author     : David Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Iniciar sesión</h1>
            <form action="InicioSesion" method="post">
            <label>Nombre:</label> <input type="text" name="nombre" value=""><br>
            <label>Contraseña:</label> <input type="password" name="pass" value="" /><br>
            <label>Tipo de Usuario:</label>
            <select name="tipo_usuario">
                <option>Administrador</option>
                <option>Usuario</option>
                <option>Invitado</option>
            </select>
            <input type="submit" value="Iniciar sesión" />
        </form>
        <h2>Registrate AQUI!</h2>
        <a href="RegistroAdmin.jsp">Registro Administrador</a>
        <a href="RegistroInvitado.jsp">Registro Invitado</a>
        <a href="RegistroUser.jsp">Registro Normal</a>
    </body>
</html>
