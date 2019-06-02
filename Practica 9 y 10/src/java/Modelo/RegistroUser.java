/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Java.User;
import Controlador.DB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author David Pc
 */
@WebServlet(name = "RegistroUser", urlPatterns = {"/RegistroUser"})
public class RegistroUser extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
          User us = new User();
            us.user = request.getParameter("nombre");
            us.pass = request.getParameter("pass");
            us.email = request.getParameter("correo");
            us.fechaNac = request.getParameter("fechaNac");
            us.tipo_Usuario = "Usuario";
            us.tipoSubs = request.getParameter("tipoSubs");
            us.domicilio = request.getParameter("domicilio");

            DB consulta = new DB();
            consulta.registroUser(user, pass, email, fechaNac,tipo_Usuario,tipoSubs, domicilio);
                      
            HttpSession session = request.getSession();
           

            session.setAttribute("Usuario", User);
            
        }
    }
}
