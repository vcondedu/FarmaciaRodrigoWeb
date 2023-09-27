<%-- 
    Document   : portada
    Created on : 20 set. 2023, 15:12:23
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            #content{
                margin: 0px auto;
                width: 80%;
                background-image: url('../images/Health Care.png');
                background-repeat: no-repeat;
                background-position: center center;
            }
        </style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    </head>
    <body>
        <div id="content">
            
        </div>
        <script language="javascript" type="text/javascript">
            $(document).ready(
                function(){
                    $sw=$(document).height();
                    $('#content').height($sw-50);
                }
            );
        </script>
    </body>
</html>
