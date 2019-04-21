

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario usuario1 = null;
      String Usuario = request.getParameter("Nombre");
      String Password = request.getParameter("Password");
      String FechaNac = request.getParameter("FechaNac");
      String Telefono = request.getParameter("telefono");
      
      UsuarioController usuario = null;
      usuario.registrarUsuario(usuario1);
      
      PrintWriter out =response.getWriter();
      out.print(usuario1.getResultado());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }

}
