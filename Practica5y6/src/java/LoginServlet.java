import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.http.Cookie;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
public class LoginServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        request.getRequestDispatcher("link.html").include(request, response);  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin123")){  
            out.print("Ha iniciado sesion!");  
            out.print("<br>Bienvenido, "+name);  
              
            Cookie ck=new Cookie("name",name);  
            response.addCookie(ck);  
        }else{  
            out.print("Error, usuario o contraseña erronea!");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
          
        out.close();  
    }  
  
}