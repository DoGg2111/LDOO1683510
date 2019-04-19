import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.http.Cookie;  
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

public class ProfileServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        request.getRequestDispatcher("link.html").include(request, response);  
        HttpSession ss = request.getSession();
            String name1 = ss.getAttribute("name").toString();
        Cookie ck[]=request.getCookies();  
        if(ck!=null){  
         String name=ck[1].getValue();  
        if(!name.equals("")||name!=null){  
            out.println("<b>Cookies del nombre de usuario</b>");  
            out.println("<br>Bienvenido, "+ name);  
      
            out.println("\n Session del nombre de Usuario");
            out.println("Bienvenido, " + name1);
        }  
        }else{  
            out.print("Inicia sesion primero");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        out.close();  
    }  
}  