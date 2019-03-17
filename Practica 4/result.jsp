<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Correo</td>
            <td>${correo}</td>
         </tr>
         <tr>
            <td>Contraseña</td>
            <td>${contra}</td>
         </tr>
         <tr>
            <td>Telefono</td>
            <td>${telefono}</td>
         </tr>
         <tr>
            <td>Fecha de Nacimiento</td>
            <td>${fechaNacimiento}</td>
         </tr>
      </table>  
   </body>
</html>