<div id="footer">
    <div class="footer_izq">TRollback Solutions&REG;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Todos los derechos reservados - Lima - Per&uacute;</div>
    <div class="footer_der">
        <script language="javascript" type="text/javascript">
            $(document).ready(function() {
                $('.menu').jqsimplemenu();
                ajustar_pantalla(40);
            });
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
    <div class="footer_der"></div>
</div>
