/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.ClsArticulo;
import ModeloDAO.DaoArticulo;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author victo
 */
@WebServlet(name = "ControladorArticulo", urlPatterns = {"/ControladorArticulo"})
public class ControladorArticulo extends HttpServlet {

    String listar="";
    String add="";
    String edit="";
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorArticulo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorArticulo at " + request.getContextPath() + "</h1>");
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
        String accion = request.getParameter("accion");
        
        DaoArticulo daoArticulo = new DaoArticulo();

        if(accion.equalsIgnoreCase("listar")){
           List articulo = daoArticulo.listaarticulo();
           RequestDispatcher vista = request.getRequestDispatcher("vistas/administracion/articulo/mantenimiento_articulo.jsp");
           vista.forward(request, response);
        }else if(accion.equalsIgnoreCase("eliminar")){
           String idarticulo = request.getParameter("id_articulo");
           boolean eliminado = daoArticulo.EliminarArticulo(Integer.parseInt(idarticulo));
           if( eliminado ){
               request.setAttribute("mensajeToast", "Articulo eliminado exitosamente.");
           }else{
               request.setAttribute("mensajeToast", "No se pudo eliminar el articulo.");
           }
           request.setAttribute("mostrarToast", true); 
           RequestDispatcher vista = request.getRequestDispatcher("vistas/administracion/articulo/mantenimiento_articulo.jsp");
           vista.forward(request, response);
        }
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
        DaoArticulo daoArticulo = new DaoArticulo();
        List articulo = daoArticulo.listaarticulo();
        if(accion.equalsIgnoreCase("editar")){
            int idarticulo = Integer.parseInt(request.getParameter("txtnombre_idarticulo"));
            String nombre = request.getParameter("txtnombre_articulo");
            int codigo_marca = Integer.parseInt(request.getParameter("txtcodigo_marca"));
            int codigo_categoria = Integer.parseInt(request.getParameter("txtcodigo_categoria"));
            int codigo_proveedor = Integer.parseInt(request.getParameter("txtcodigo_proveedor"));
            String descripcion = request.getParameter("txtdescripcion_articulo");
            float precio = Float.parseFloat(request.getParameter("txtprecio_articulo"));
            int stock = Integer.parseInt(request.getParameter("txtstock_articulo"));
            int stock_minimo = Integer.parseInt(request.getParameter("txtstock_minimo_articulo"));
            int estado = Integer.parseInt(request.getParameter("txtestado_articulo"));
            boolean editado = daoArticulo.EditarArticulo(idarticulo,nombre,codigo_marca,codigo_categoria,codigo_proveedor,descripcion,precio,stock,stock_minimo,estado);
            if( editado ){
                request.setAttribute("mensajeToast", "Articulo editado exitosamente.");
            }else{
                request.setAttribute("mensajeToast", "No se pudo editar el articulo.");
            }
           request.setAttribute("mostrarToast", true); 
           RequestDispatcher vista = request.getRequestDispatcher("vistas/administracion/articulo/mantenimiento_articulo.jsp");
           vista.forward(request, response);
        }else if(accion.equalsIgnoreCase("registrar")){
            int idarticulo = Integer.parseInt(request.getParameter("txtnombre_idarticulo"));
            String nombre = request.getParameter("txtnombre_articulo");
            int codigo_marca = Integer.parseInt(request.getParameter("txtcodigo_marca"));
            int codigo_categoria = Integer.parseInt(request.getParameter("txtcodigo_categoria"));
            int codigo_proveedor = Integer.parseInt(request.getParameter("txtcodigo_proveedor"));
            String descripcion = request.getParameter("txtdescripcion_articulo");
            float precio = Float.parseFloat(request.getParameter("txtprecio_articulo"));
            int stock = Integer.parseInt(request.getParameter("txtstock_articulo"));
            int stock_minimo = Integer.parseInt(request.getParameter("txtstock_minimo_articulo"));
            int estado = Integer.parseInt(request.getParameter("txtestado_articulo"));
            boolean registrado = daoArticulo.RegistrarArticulo(idarticulo,nombre,codigo_marca,codigo_categoria,codigo_proveedor,descripcion,precio,stock,stock_minimo,estado);
            if( registrado ){
                request.setAttribute("mensajeToast", "Articulo registrado exitosamente.");
            }else{
                request.setAttribute("mensajeToast", "No se pudo registrado el articulo.");
            }
           request.setAttribute("mostrarToast", true); 
           RequestDispatcher vista = request.getRequestDispatcher("vistas/administracion/articulo/mantenimiento_articulo.jsp");
           vista.forward(request, response);
        }
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
