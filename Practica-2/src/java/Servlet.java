import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
         PrintWriter out = response.getWriter();

         out.println("<html>");
         out.println("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"Estilo.css\"></head>");         
         out.println("<body>");
         out.println("<div id=\"navibar\"><h1>Formulario Servlet</h1></div><br><br><br><br>");
         out.println("Usuario:");
         String usu=request.getParameter("usuario");
         out.println(usu);
         out.println("<br>");
         out.println("Clave:");         
         String cla=request.getParameter("clave");
         out.println(cla);
         
         out.println("</body>");
         out.println("</html>");           
    }

}