<%-- 
    Document   : menu
    Created on : 20 set. 2023, 03:11:35
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ include file="footer.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Principal</title>
        <style>
            #list-item{
                background-color: #1486b7;
                box-shadow: 0px 0px 15px 0px #000000;
                margin-top: 2px;
                color: #FFF;
            }
            #list-item:hover{
                background-color: #e3ea00;
                color: #000000;
            }
            
        </style>
    </head>
    <body>

         <jsp:include page="headerContent.jsp" />

        <div id="content">
            <iframe id="explorer" name="content" src="./vistas/portada.jsp" allowtransparency="no" scrolling="auto" frameborder="0"></iframe>
        </div>
        <div class="limpiar"></div>
        <div class="borde"></div>
        
         <jsp:include page="footerContent.jsp" />
    </body>
</html>
