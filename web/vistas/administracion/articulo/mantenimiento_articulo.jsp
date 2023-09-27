<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../../../headerMant.jsp" %>
<%@ include file="../../../footerMant.jsp" %>
<%@ page import="ModeloDAO.DaoArticulo" %>
<%@ page import="Modelo.ClsArticulo" %>
<%@ page import="ModeloDAO.DaoMarca" %>
<%@ page import="Modelo.ClsMarca" %>
<%@ page import="ModeloDAO.DaoCategoria" %>
<%@ page import="Modelo.ClsCategoria" %>
<%@ page import="ModeloDAO.DaoProveedor" %>
<%@ page import="Modelo.ClsProveedor" %>
<%@ page import="java.util.List,java.util.Iterator" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            Boolean mostrarToast = (Boolean) request.getAttribute("mostrarToast");
            String mensaje = (String) request.getAttribute("mensajeToast");
            if (mostrarToast != null && mostrarToast) {
        %>
        <script>
            window.onload = function() {
                var toastElList = [].slice.call(document.querySelectorAll('.toast'))
                var toastList = toastElList.map(function(toastEl) {
                    return new bootstrap.Toast(toastEl)
                })
                toastList.forEach(toast => toast.show())
            }
        </script>
        <%
            }
        %>
    </head>
    <body> 
    <div class="toast-container position-fixed bottom-0 end-0 p-3">
      <div id="liveToast" class="toast align-items-center text-bg-primary border-0" role="alert" aria-live="assertive" aria-atomic="true">
            <div class="d-flex">
              <div class="toast-body">
                 <%= mensaje %>
              </div>
              <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
            </div>
        </div>
    </div>
        <div class="logo1"></div><div class="title_man">M&Oacute;DULO DE ART&Iacute;CULOS</div>
                  <div class="limpiar"></div>
                  <hr>
                 <form name="form" action="#" method="get">
                    <fieldset>
                        <table>
                            <input type="button" value="Nuevo" id="btnregistrar" class="btnbusqueda nuevo" data-bs-toggle="modal" data-bs-target="#ModalNuevo"></td></tr>
                        </table>
                    </fieldset>
                </form>
                  <div class="limpiar"></div>
                  <hr>
                  <table id="example1" class="table table-bordered table-responsive table-hover table-lg">
                        <thead>
                            <tr><th style="background-color:#14a8b7;color:white;">Codigo</th>
                                <th style="background-color:#14a8b7;color:white;">Nombre</th>
                                <th style="background-color:#14a8b7;color:white;">Marca</th>
                                <th style="background-color:#14a8b7;color:white;">Categoria</th>
                                <th style="background-color:#14a8b7;color:white;">Stock</th>
                                <th style="background-color:#14a8b7;color:white;">Estado</th>
                                <th style="background-color:#14a8b7;color:white;">Mantenimiento</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                DaoArticulo daoArticulo = new DaoArticulo();
                                List<ClsArticulo> list = daoArticulo.listaarticulo();
                                Iterator<ClsArticulo> iter = list.iterator();
                                String clase="";
                                String descripcion="";
                                while (iter.hasNext()) {
                                    ClsArticulo articulo = iter.next();
                                    if (articulo.getEstado_articulo() == 0){
                                        descripcion = "DESACTIVO";
                                        clase = "class=\"badge text-bg-danger\"";
                                    }else{
                                        descripcion = "ACTIVO";
                                        clase = "class=\"badge text-bg-success\"";
                                    }
                                    
                            %>
                            <tr>
                                <th scope="row"><%= articulo.getCodigo_articulo() %></th>
                                <td><%= articulo.getNombre_articulo() %></td>
                                <td><%= articulo.getCodigo_marca() %></td>
                                <td><%= articulo.getCodigo_categoria() %></td>
                                <td><%= articulo.getStock_articulo() %></td>
                                <td <%=clase%> ><%= descripcion %></td>
                                <td> 
                                    <a href="#">
                                        <!--i id="btneliminar" class="fa-solid fa-trash fa-lg" data-bs-toggle="modal" data-bs-target="#exampleModal" style="color:red;"></i-->
                                        <i id="btneliminar" class="fa-solid fa-trash fa-lg" data-articulo="<%= articulo.getNombre_articulo() %>" data-idarticulo="<%= articulo.getCodigo_articulo() %>" data-bs-toggle="modal" data-bs-target="#exampleModal" style="color:red;"></i>
                                    </a>
                                    <a href="#">
                                        <!--i id="btneliminar" class="fa-solid fa-trash fa-lg" data-bs-toggle="modal" data-bs-target="#exampleModal" style="color:red;"></i-->
                                        <i id="btneditar" class="fa-solid fa-pen-to-square fa-lg" 
                                           data-articulo="<%= articulo.getNombre_articulo() %>" 
                                           data-idarticulo="<%= articulo.getCodigo_articulo() %>" 
                                           data-marca="<%= articulo.getCodigo_marca() %>" 
                                           data-categoria="<%= articulo.getCodigo_categoria() %>" 
                                           data-proveedor="<%= articulo.getCodigo_proveedor() %>" 
                                           data-descripcion="<%= articulo.getDescripcion_articulo() %>" 
                                           data-precio="<%= articulo.getPrecio_articulo() %>" 
                                           data-stock="<%= articulo.getStock_articulo() %>" 
                                           data-stockminimo="<%= articulo.getStock_minimo_articulo() %>" 
                                           data-estado="<%= articulo.getEstado_articulo() %>" 
                                           data-bs-toggle="modal" data-bs-target="#ModalEditar" style="color:#1486b7;"></i>
                                    </a>
                                   
                                    <div class="limpiar"></div>
                                </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                  </table>
                    <!-- Modal Eliminar-->
                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                      <div class="modal-dialog">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h1 class="modal-title fs-5" id="exampleModalLabel">Confirmar</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                          </div>
                          <div class="modal-body">
                                ¿Estás seguro de eliminar el artículo <span id="nombreArticulo"></span>?
                          </div>
                          <div class="modal-footer">
                            <button type="button" class="btn btn-primary" id="confirmDeleteBtn" data-id="">Si</button>
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">No</button>
                          </div>
                        </div>
                      </div>
                    </div>

                    <!-- Modal Editar-->
                    <div class="modal fade" id="ModalEditar" tabindex="-1" aria-labelledby="ModalEditarLabel" aria-hidden="true">
                      <div class="modal-dialog">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h1 class="modal-title fs-5" id="ModalEditarLabel">Editar Artículo (<span id="nombreArticuloEditar"></span>)</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                          </div>
                          <div class="modal-body">
                                <form name="form1" action="ControladorArticulo" method="post" >
                                    <table class="table table-sm">
                                        <input type="hidden" name="txtaccion" value="editar">
                                        <tr>
                                            <td>Código</td><td><input class="form-control form-control-sm" type="text" class="txtcod" name="txtnombre_idarticulo" readonly="true"></td>
                                        </tr>
                                        <tr>
                                            <td>Nombre</td><td><input class="form-control form-control-sm" type="text" name="txtnombre_articulo"  placeholder="Nombre de Articulo"/></td>
                                        </tr>
                                        <tr>
                                            <td>Marca</td>
                                            <td>
                                                <select name="txtcodigo_marca" class="form-select form-select-sm" id="marcaSelect">
                                                    <%
                                                        DaoMarca daoMarca = new DaoMarca();
                                                        List<ClsMarca> listMarcas = daoMarca.listarmarca();
                                                        for (ClsMarca marca : listMarcas) {
                                                    %>
                                                        <option value="<%= marca.getCodigo_marca() %>"><%= marca.getNombre_marca() %></option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr><td>Categoria</td>
                                            <td>
                                                <select name="txtcodigo_categoria" class="form-select form-select-sm">
                                                    <%
                                                        DaoCategoria daoCategoria = new DaoCategoria();
                                                        List<ClsCategoria> listCategoria = daoCategoria.listarcategoria();
                                                        for (ClsCategoria categoria : listCategoria) {
                                                    %>
                                                        <option value="<%= categoria.getCodigo_categoria() %>"><%= categoria.getNombre_categoria() %></option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr><td>Proveedor</td>
                                            <td>
                                                <select name="txtcodigo_proveedor" class="form-select form-select-sm">
                                                    <%
                                                        DaoProveedor daoProveedor = new DaoProveedor();
                                                        List<ClsProveedor> listProveedor = daoProveedor.listarproveedor();
                                                        for (ClsProveedor proveedor : listProveedor) {
                                                    %>
                                                        <option value="<%= proveedor.getCodigo_proveedor() %>"><%= proveedor.getNombre_proveedor() %></option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr><td>Descripción</td><td><textarea class="form-control form-control-sm" name="txtdescripcion_articulo"></textarea><input type="hidden" id="descripcion_articulo" name="txtdescripcion_articulo" value=""></td></tr>
                                        <tr><td>Precio</td><td><input type="number" step="0.01" class="form-control form-control-sm"  name="txtprecio_articulo" value="" placeholder="Precio"/></td></tr>
                                        <tr><td>Stock</td><td><input type="number" class="form-control form-control-sm" name="txtstock_articulo" value="" placeholder="Stock"/></td></tr>
                                        <tr><td>Stock Mínimo</td><td><input type="number" class="form-control form-control-sm" name="txtstock_minimo_articulo" value="" placeholder="Stock Minimo"/></td></tr>
                                        <tr><td>Estado</td>
                                            <td>
                                                <select name="txtestado_articulo" class="form-select form-select-sm">
                                                    <option value="1">Activo</option>
                                                    <option value="0">Desactivo</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <td ><input type="hidden" name="accion" value="editar" /></td >
                                            <td >
                                                <button type="submit" class="btn btn-primary" id="confirmEditBtn" data-id="">Actualizar</button>
                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                            </td>
                                        </tr>    
                                    </table>
                                </form>                          
                          </div>
                        </div>
                      </div>
                    </div>
                                                
                    <!-- Modal Nuevo-->
                    <div class="modal fade" id="ModalNuevo" tabindex="-1" aria-labelledby="ModalNuevoLabel" aria-hidden="true">
                      <div class="modal-dialog">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h1 class="modal-title fs-5" id="ModalNuevoLabel">Ingresar datos del nuevo Artículo</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                          </div>
                          <div class="modal-body">
                                <form name="form1" action="ControladorArticulo" method="post" >
                                    <table class="table table-sm">
                                        <input type="hidden" name="txtaccion" value="registrar">
                                        <tr>
                                            <td>Código</td><td><input class="form-control form-control-sm" type="text" class="txtcod" name="txtnombre_idarticulo" value="<%=daoArticulo.MaxArticulo()%>" readonly="true">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Nombre</td><td><input class="form-control form-control-sm" type="text" name="txtnombre_articulo"  placeholder="Nombre de Articulo"/></td>
                                        </tr>
                                        <tr>
                                            <td>Marca</td>
                                            <td>
                                                <select name="txtcodigo_marca" class="form-select form-select-sm" id="marcaSelect">
                                                    <%
                                                        List<ClsMarca> listMarcasNuevo = daoMarca.listarmarca();
                                                        for (ClsMarca marca : listMarcasNuevo) {
                                                    %>
                                                        <option value="<%= marca.getCodigo_marca() %>"><%= marca.getNombre_marca() %></option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr><td>Categoria</td>
                                            <td>
                                                <select name="txtcodigo_categoria" class="form-select form-select-sm">
                                                    <%
                                                        List<ClsCategoria> listCategoriaNuevo = daoCategoria.listarcategoria();
                                                        for (ClsCategoria categoria : listCategoriaNuevo) {
                                                    %>
                                                        <option value="<%= categoria.getCodigo_categoria() %>"><%= categoria.getNombre_categoria() %></option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr><td>Proveedor</td>
                                            <td>
                                                <select name="txtcodigo_proveedor" class="form-select form-select-sm">
                                                    <%
                                                        List<ClsProveedor> listProveedorNuevo = daoProveedor.listarproveedor();
                                                        for (ClsProveedor proveedor : listProveedorNuevo) {
                                                    %>
                                                        <option value="<%= proveedor.getCodigo_proveedor() %>"><%= proveedor.getNombre_proveedor() %></option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr><td>Descripción</td><td><textarea class="form-control form-control-sm" name="txtdescripcion_articulo"></textarea><input type="hidden" id="descripcion_articulo" name="txtdescripcion_articulo" value=""></td></tr>
                                        <tr><td>Precio</td><td><input type="number" step="0.01" class="form-control form-control-sm"  name="txtprecio_articulo" value="" placeholder="Precio"/></td></tr>
                                        <tr><td>Stock</td><td><input type="number" class="form-control form-control-sm" name="txtstock_articulo" value="" placeholder="Stock"/></td></tr>
                                        <tr><td>Stock Mínimo</td><td><input type="number" class="form-control form-control-sm" name="txtstock_minimo_articulo" value="" placeholder="Stock Minimo"/></td></tr>
                                        <tr><td>Estado</td>
                                            <td>
                                                <select name="txtestado_articulo" class="form-select form-select-sm">
                                                    <option value="1">Activo</option>
                                                    <option value="0">Desactivo</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <td ><input type="hidden" name="accion" value="registrar" /></td >
                                            <td >
                                                <button type="submit" class="btn btn-primary" id="confirmRegistrarBtn" data-id="">Registrar</button>
                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                            </td>
                                        </tr>    
                                    </table>
                                </form>                          
                          </div>
                        </div>
                      </div>
                    </div>
         <!-- Fin Editada -->
        <jsp:include page="../../../footerMantContent.jsp" />
        <script>
            document.addEventListener('DOMContentLoaded', function() {
                var modal = document.getElementById('exampleModal');
                modal.addEventListener('show.bs.modal', function(event) {
                    // Obtener el elemento que disparó el modal (el ícono de eliminar)
                    var button = event.relatedTarget;

                    // Obtener el nombre del artículo del atributo data-articulo
                    var nombreArticulo = button.getAttribute('data-articulo');
                    var idArticulo = button.getAttribute('data-idarticulo');
                    

                    // Asignar el nombre al contenedor en el modal
                    document.getElementById('nombreArticulo').textContent = nombreArticulo;
                    document.getElementById('confirmDeleteBtn').setAttribute('data-id', idArticulo);
                });
            });
        </script>
        <script>
            document.addEventListener('DOMContentLoaded', function() {
                var modal = document.getElementById('ModalEditar');
                modal.addEventListener('show.bs.modal', function(event) {
                    // Obtener el elemento que disparó el modal (el ícono de eliminar)
                    var button = event.relatedTarget;

                    // Obtener el nombre del artículo del atributo data-articulo
                    var nombreArticulo = button.getAttribute('data-articulo');
                    var idArticulo = button.getAttribute('data-idarticulo');
                    var marca = button.getAttribute('data-marca');
                    var categoria = button.getAttribute('data-categoria');
                    var proveedor = button.getAttribute('data-proveedor');
                    var descripcion = button.getAttribute('data-descripcion');
                    var precio = button.getAttribute('data-precio');
                    var stock = button.getAttribute('data-stock');
                    var stockminimo = button.getAttribute('data-stockminimo');
                    var estado = button.getAttribute('data-estado');
                    var desc_estado;
                    console.log(estado);
                    
                    if(estado == 1){
                        desc_estado = "Activo";
                    }else{
                        desc_estado = "Desactivo";
                    }

                    // Asignar el nombre al contenedor en el modal
                    document.getElementById('nombreArticuloEditar').textContent = nombreArticulo;
                    document.querySelector('[name="txtnombre_idarticulo"]').value = idArticulo;
                    document.querySelector('[name="txtnombre_articulo"]').value = nombreArticulo;
                    document.querySelector('[name="txtcodigo_marca"]').value = marca;
                    document.querySelector('[name="txtcodigo_categoria"]').value = categoria;
                    document.querySelector('[name="txtcodigo_proveedor"]').value = proveedor;
                    document.querySelector('[name="txtdescripcion_articulo"]').value = descripcion;
                    document.querySelector('[name="txtprecio_articulo"]').value = precio;
                    document.querySelector('[name="txtstock_articulo"]').value = stock;
                    document.querySelector('[name="txtstock_minimo_articulo"]').value = stockminimo;
                    document.querySelector('[name="txtestado_articulo"]').value = estado;
                });
            });
        </script>
        <script>
            document.getElementById('confirmDeleteBtn').addEventListener('click', function() {
                var idArticulo = this.getAttribute('data-id');
                console.log(idArticulo);
                window.location.href = "/FarmaciaRodrigoWeb/ControladorArticulo?accion=eliminar&id_articulo=" + idArticulo;
            });
        </script>
        <script>
            document.getElementById("toastbtn").onclick = function() {
              var toastElList = [].slice.call(document.querySelectorAll('.toast'))
              var toastList = toastElList.map(function(toastEl) {
                return new bootstrap.Toast(toastEl)
              })
              toastList.forEach(toast => toast.show()) 
            }
        </script>
    </body>
</html>
