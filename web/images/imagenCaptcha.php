<?php
    include '../lib/ClsCaptcha.php';
    $x=new ClsCaptcha();
    $x->generar_codigo();
    $x->graficar();
?>