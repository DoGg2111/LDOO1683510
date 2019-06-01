<%-- 
    Document   : Bienvenido
    Created on : May 31, 2019, 5:48:29 PM
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
           <%  
               String tipoUsuario = sessionUser.getAttribute("tipoUsuario");
               if(tipoUsuario = "Usuario"){
               HttpSession sessionUser=request.getSession(false);  
            String us=(String)sessionUser.getAttribute("user");
            
            User user = new User();
            user.setUserName(us);
            user.GetUserName();
            
            out.print("Bienvenido ");
            out.print(user.getUserName());
            out.print(" Tu fecha de nacimiento es:");
            out.print(user.getFecha_nacimiento());
            out.print("!!!");
               }else if(tipoUsuario = "Invitado"){
                      HttpSession sessionUser=request.getSession(false);  
            String us=(String)sessionUser.getAttribute("user");
            
            Invitado user = new Invitado();
            user.setUserName(us);
            user.GetUserName();
            
            out.print("Bienvenido ");
            out.print(user.getUserName());
            out.print(" Tu fecha de nacimiento es:");
            out.print(user.getFecha_nacimiento());
            out.print("!!!");
               }else if(tipoUsuario = "Admin"){
                               HttpSession sessionUser=request.getSession(false);  
            String us=(String)sessionUser.getAttribute("user");
            
            Admin user = new Admin();
            user.setUserName(us);
            user.GetUserName();
            
            out.print("Bienvenido ");
            out.print(user.getUserName());
            out.print(" Tu numero de Empleado es:");
            out.print(user.getNumEmpleado());
            out.print("!!!");
               }
            
        %>
    </body>
</html>
