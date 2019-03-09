<html>
   <head>
      <title>Formulario</title>
       <style>
               div{
                background-color:#2E64FE;
                width: 100%;
                height: 60px;
                left: 0px;
                top: 0px;
        	text-align: center;
                z-index: 3;
                }
                p{
                    font-family: sans-serif;
                    color: blue;
                }
                body{
                    background-color: silver;
                }
        </style>
   </head>
   
   <body>
      <center>
          <div id="navibar"><h1>Formulario JSP</h1></div>
      
      <ul>
         <li><p><b>Correo Electronico: </b>
            <%= request.getParameter("correo")%>
         </p></li>
         <li><p><b>Contraseña: </b>
            <%= request.getParameter("contra")%>
         </p></li>
            <li><p><b>Fecha de Nacimiento: </b>
            <%= request.getParameter("fecha")%>
         </p></li>
               <li><p><b>Telefono: </b>
            <%= request.getParameter("telefono")%>
         </p></li>
      </ul>
   
   </body>
</html>