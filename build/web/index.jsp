<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Farmacia Rodrigo Login</title>
        <style>
            @import 'css/general.css';
            @import 'css/definido.css';
            #msg_bienvenida{
                color: #FFF;
                font-size: 3em;
                float: right;
                font-family: 'Impact';
                margin: 0px 20px 0px 0px;
                direction: rtl;
            }
            .subm{
                font-size: 0.7em;
            }
        </style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.min.js" integrity="sha384-Rx+T1VzGupg4BHQYs2gCW9It+akI2MM/mndMCy36UVfodzcJcF0GGLxZIzObiEfa" crossorigin="anonymous"></script>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="fontawesome-free-6.4.2-web/css/all.min.css">
    </head>
    <body>
        <div id="header">
            <div class="logo"></div>
            <!--Contenido Header-->
            <div class="header_der">
            <input class="btn btn-outline-light btn-lg p-3" type="button" value="Ingresar al Sistema" id="boton_login"/>
                <form action="ControladorUsuario" method="post" id="form_login">
                        <div class="form-outline">
                            <label class="form-label" for="usuario">Correo electrónico</label>
                            <input type="email" name="txtusuario" class="form-control form-control-sm"  placeholder="nombre@vrport.com" required/>
                        </div>
                        <div class="form-outline">
                            <label class="form-label" for="contrasena">Contraseña</label>
                            <input type="password" name="txtcontrasena" class="form-control form-control-sm" required />
                        </div>
                        <input type="hidden" name="accion" value="validar" />
                    <br>
                    <!--<?php
                        if(isset($_SESSION['num_logueo'])){
                            if($_SESSION['num_logueo']>=3){
                    ?>
                                <img id="captcha" title="captcha_img" src="images/imagenCaptcha.php"/>
                                <div class="msg">Dar click a la imagen para generar otra</div>
                                <label class="msg"> * Ingresar las letras que ve en negro </label>
                                <input class="form-control form-control-sm" required  type="text" name="txtcaptcha" placeholder="Ingrese c&oacute;digo captcha"/>
                                <br>
                    <?php
                            }
                        }
                    ?>-->
                    <input class="btn btn-outline-light form-control-sm" type="submit" value="Ingresar"/>
                </form>
            </div>
            
            <div class="" id="msg_bienvenida">
                <%
                // Obtiene el mensaje de bienvenida del atributo de la solicitud
                String mensajeBienvenida = (String) request.getAttribute("mensajeBienvenida");
                // Obtiene el mensaje de error del atributo de la solicitud
                String mensajeError = (String) request.getAttribute("mensajeError");

                if (mensajeError != null) {
                    // Muestra el mensaje de error si está presente en la solicitud
                %>
                    <%= mensajeError %>
                    <br>
                <%
                }
                if (mensajeBienvenida != null) {
                    // Muestra el mensaje de bienvenida si está presente en la solicitud
                %>
                    <%= mensajeBienvenida %>
                <%
                }
                %>
            </div>
            
        </div>
        <div class="borde"></div>


        <div id="carouselExampleCaptions" class="carousel slide">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <div id="content">
                        Mejorando la calidad empresarial...
                        <div>
                            Este Proyecto esta desarrollado por los siguientes alumnos:
                        </div>
                        <div>
                            - Victor Conde Durand
                        </div>
                        <div>
                            - Sergio Conde Durand
                        </div>
                    </div>
                </div>

                <div class="carousel-item">
                
                    <div id="content">

                        Mejorando la calidad empresarial...
                        <div>
                            Datos del curso:
                        </div>
                        <div>
                            - Curso  : Soluciones Web y Aplicaciones distribuidas
                        </div>
                        <div>
                            - Ciclo  : 8avo
                        </div>
                        <div>
                            - Docente: Juan Ricardo Tapia Carbajal 
                        </div>
                        <div>
                            &nbsp
                        </div>
                        <div>
                        &nbsp
                        </div>
                        <div>
                        &nbsp
                        </div>
                        <div>
                        &nbsp
                        </div>
                        <div>
                        &nbsp
                        </div>
                    </div>

                </div>
                <div class="carousel-item">
                <div id="content">
                <img src="./images/campus-san-juan-de-lurigancho.jpg" width="100%" height="100%" alt="...">
                <div>
                    Desarrollado en:
                    </div>
                    <div>
                    - Universidad Privada del Norte
                    </div>
                    <div>
                    &nbsp
                    </div>
                    <div>
                    &nbsp
                    </div>
                    <div>
                    &nbsp
                    </div>
                    <div>
                    &nbsp
                    </div>
                    <div>
                    &nbsp
                    </div>
                    <div>
                    &nbsp
                    </div>
                    </div>
            </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>

        


        <div class="borde"></div>
        <div id="footer">
            <div class="footer_izq">Rollack Solutions&REG;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Todos los derechos reservados - Lima - Per&uacute;</div>
            <div class="footer_der">
                
            <script language="javascript" type="text/javascript">
            $(document).ready(
                function(){
                    $('#form_login').hide();
                    ajustar_pantalla(180);
                    /* <?php
                         if(isset($_GET['log'])){
                             $log=$_GET['log'];
                             $msg;
                             if($log=='elog'){
                                 $msg='Usuario y/o contraseña incorrectos';
                             }else if($log=='ilog'){
                                 $msg='Debes iniciar sesion para acceder a esta página';
                             }else if($log=='dlog'){
                                 $msg='Su usuario esta desactivo';
                             }else if($log=='clog'){
                                 $msg='El código captcha es incorrecto';
                             }else if($log=='olog'){
                                 $msg='Gracias, has salido del Sistema<br><div class="subm">Entrar con otro usuario</div>';
                             }
                     ?>
                             $('#boton_login').hide();
                             $('#form_login').show(1000);
                             $('#msg_bienvenida').html('<?php echo $msg; ?>');
                     <?php
                         }
                     ?>*/
                    }
            );
            $('#boton_login').click(
                    function(){
                        $(this).hide();
                        $('#form_login').show(1000);
                        $('#msg_bienvenida').text('Por favor Accede');
                    }
            );
            $('#content').hover(
                    function(){
                        $('body').css('box-shadow','0px 0px 100px 100px rgba(3,0,0,0.5) inset');
                    }
            );
            /* Generar otro captcha*/
                var imagen=document.getElementById('captcha');
                imagen.onclick=function(){
                        imagen.src="images/imagenCaptcha.php";
                };
                
                
            /*Funcion de Fecha*/
            var mydate=new Date();
            var year=mydate.getYear();
            if (year < 1000)
            year+=1900;
            var day=mydate.getDay();
            var month=mydate.getMonth();
            var daym=mydate.getDate();
            if (daym<10)
            daym="0"+daym;
            var dayarray=new Array("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado");
            var montharray=new Array("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
            document.write("<b><font size='2' color='#ffb4b4' face='Arial'>"+dayarray[day]+" "+daym+" de "+montharray[month]+" de "+year+"</font></b>");
            </script>
            </div>
            <div class="limpiar"></div>
            <hr>
            <div class="footer_der">
            
            </div>
        </div>
        <script src="js/autoajustepantalla.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    </body>
</html>
