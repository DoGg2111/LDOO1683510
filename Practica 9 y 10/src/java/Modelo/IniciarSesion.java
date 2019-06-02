/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.DB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David Pc
 */
@WebServlet(name = "IniciarSesion", urlPatterns = {"/IniciarSesion"})
public class IniciarSesion extends HttpServlet {
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String tipo_Usuario = request.getParameter("tipo_Usuario");
        DB consulta = new DB();
        switch (tipo_Usuario) {
            case "Administrador":
                if(consulta.autenticacion(user, pass, tipo_Usuario)){
                    response.sendRedirect("Bienvenido.jsp");
                }
            break;
            case "Invitado":
                if(consulta.autenticacion(user, pass, tipo_Usuario)){
                    response.sendRedirect("Bienvenido.jsp");
                }else{
                }
            break;
            case "Usuario":
                if(consulta.autenticacion(user, pass, tipo_Usuario)){
                    response.sendRedirect("Bienvenido.jsp");
                }else{
                }
            break;
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
