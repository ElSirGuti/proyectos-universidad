<?php
session_start();

// Iniciamos la conexión con el servidor MySQL
$mysqli = new mysqli('localhost', 'root', '123456789', 'felixdocvzla');

// Salida por si hay algún error en la conexión
if ($mysqli->connect_error) {
    die('Error: (' . $mysqli->connect_errno . ') ' . $mysqli->connect_error);
}

// Creamos las variables que almacenaran los datos del formulario
// mysqli_real_escape_string se salta cualquier caracter especial para prevenir una posible SQLinjection
$nombre = mysqli_real_escape_string($mysqli, $_POST['nombre']);
$apellido = mysqli_real_escape_string($mysqli, $_POST['apellido']);
$email = mysqli_real_escape_string($mysqli, $_POST['email']);
$password = mysqli_real_escape_string($mysqli, $_POST['password']);

// var_dump($nombre, $apellido, $email, $password);

// Validación del registro si algo falla o falta (validacion.js)
if (strlen($nombre) < 2) {
    // var_dump("validación fallida: nombre");
    echo 'nombre';
} elseif (strlen($apellido) < 2) {
    // var_dump("validación fallida: apellido");
    echo 'apellido';
} elseif (strlen($email) <= 4) {
    // var_dump("validación fallida: email");
    echo 'eshort';
} elseif (filter_var($email, FILTER_VALIDATE_EMAIL) === false) {
    // var_dump("validación fallida: email");
    echo 'eformat';
} elseif (strlen($password) <= 4) {
    // var_dump("validación fallida: password");
    echo 'pshort';
} else { 
    // Se encripta la contraseña si no hay ningún error
    // Esta funcion convierte cualquier string introducido en un string encriptado de 16 caracteres
    // Dentro especificamos la contraseña a encriptar y el método a utilizar 
    // El costo es la calidad de encriptación, a mayor costo mayor carga para el servidor
    $spassword = password_hash($password, PASSWORD_BCRYPT, array('cost' => 12));

    $query = "SELECT * FROM usuarios WHERE email='$email'";
    $result = mysqli_query($mysqli, $query) or die(mysqli_error($mysqli));
    $num_row = mysqli_num_rows($result);
    $row = mysqli_fetch_array($result);

    // var_dump("nombre: $nombre, apellido: $apellido, email: $email, password: $password");
    // var_dump($num_row);

    if ($num_row < 1) {
        // var_dump("insertando nuevo usuario");
        $insert_row = $mysqli->query("INSERT INTO usuarios (nombre, apellido, email, password) VALUES ('$nombre', '$apellido', '$email', '$spassword')");
        // var_dump($insert_row);
        if ($insert_row) {
            // var_dump("usuario insertado correctamente");
            $_SESSION['login'] = $mysqli->insert_id;
            $_SESSION['nombre'] = $nombre;
            $_SESSION['apellido'] = $apellido;
            echo 'true';
        } else {
            // var_dump("error al insertar usuario");
        }
    } else {
        // var_dump("usuario ya existe");
        echo 'false';
    }

}

?>