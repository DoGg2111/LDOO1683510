/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Java.Invitado;
import Controlador.Autenticacion;
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
@WebServlet(name = "RegistroInvitado", urlPatterns = {"/RegistroInvitado"})
public class RegistroInvitado extends HttpServlet {
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Invitado inv = new Invitado();
           
            inv.user = request.getParameter("user");
            inv.pass = request.getParameter("pass");
            inv.email = request.getParameter("email");
            inv.fechaNac = request.getParameter("fechaNac");
            inv.tipo_Usuario = "Inivtado";
            inv.FechaRegistro = request.getParameter("fechaRegistro");
       

            Autenticacion consulta = new Autenticacion();
            consulta.RegistroInvitado(user, pass, email, fechaNac,tipo_Usuario,FechaRegistro);
                      
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(60*5);

            session.setAttribute("Invitado", Invitado);

            response.sendRedirect("Login.jsp?tipo_Usuario=Invitado");
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
