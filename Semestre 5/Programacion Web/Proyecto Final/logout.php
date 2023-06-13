<?php
    session_start();

    // Vaciamos los campos que mantienen la sesion activa
    unset($_SESSION['login']);
    unset($_SESSION['nombre']);  
    unset($_SESSION['apellido']);

    // Redirigimos al usuario al inicio
    header("location:index.php?logout=true");
?>