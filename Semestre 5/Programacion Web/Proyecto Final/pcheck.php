<?php
    session_start();

    $email = $_POST['email'];    
    $password = $_POST['password'];

    // Iniciamos la conexión con el servidor MySQL
    $mysqli = new mysqli('localhost', 'root', '123456789', 'felixdocvzla');

    // Salida por si hay algún error en la conexión
    if ($mysqli->connect_error) {
        die('Error: (' . $mysqli->connect_errno . ') ' . $mysqli->connect_error);
    }

    // Buscamos el correo
    $query = "SELECT * FROM usuarios WHERE email='$email'";
    $result = mysqli_query($mysqli, $query) or die(mysqli_error());
    $num_row = mysqli_num_rows($result);
    $row = mysqli_fetch_array($result);

    // Verificamos que existe
    if ($num_row >= 1) {
        // password_verify() desencripta la clave eb nuestra bd
        // si la clave introducida y la de la bd coinciden retorna true
        // sino retorna false (clave errada)
        if (password_verify($password, $row['password'])) {
            $_SESSION['login'] = $row['id'];
            $_SESSION['nombre'] = $row['nombre'];
            $_SESSION['apellido'] = $row['apellido'];    
            echo 'true';
        } else {
            echo 'false';
        }
    } else {
        echo 'false';
    }


?>