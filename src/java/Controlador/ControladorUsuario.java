/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.ClsUsuario;
import ModeloDAO.DaoUsuario;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class ControladorUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     String menu= "menu.jsp";
     String loginincorrecto = "index.jsp?log=elog";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
              
       // String acceso = "";
        String accion = request.getParameter("accion");
        String user = request.getParameter("txtusuario");
        String pass = request.getParameter("txtcontrasena");
        DaoUsuario daoUsuario = new DaoUsuario();

        if(accion.equalsIgnoreCase("validar")){
            ClsUsuario usuario = daoUsuario.valida_usuario(user, pass);
            int existe = usuario.getCodigo_usuario();
            /*
            System.out.println("Existe:" + existe);
            */
            if ( existe >= 1 ){
                HttpSession session = request.getSession();
                session.setAttribute("Nombre_usuario", usuario.getNombre_usuario());
                session.setAttribute("Apellido_usuario", usuario.getApellido_usuario());
                session.setAttribute("Tipo_Usuario", usuario.getTipo_usuario());
                response.sendRedirect("menu.jsp");
            }else{
                //request.setAttribute("mensajeBienvenida", "Por favor, inicia sesión");
                request.setAttribute("mensajeError", "Credenciales incorrectas. Por favor, inténtalo de nuevo.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
            
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
