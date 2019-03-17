<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Formulario</title>
   </head>
   
   <body>
      <h2>Student Information</h2>
      <form:form method = "POST" action = "/HelloWeb/addUsuario">
         <table>
            <tr>
               <td><form:label path = "correo">Correo</form:label></td>
               <td><form:input path = "correo" /></td>
            </tr>
            <tr>
               <td><form:label path = "contra">Contraseña</form:label></td>
               <td><form:input path = "contra" /></td>
            </tr>
            <tr>
               <td><form:label path = "telefono">Telefono</form:label></td>
               <td><form:input path = "telefono" /></td>
            </tr>
            <tr>
               <td><form:label path = "fechaNacimiento">Fecha de Nacimiento</form:label></td>
               <td><input type="date" name="fechaNacimiento"></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>