<?php
// Iniciamos la conexión con el servidor MySQL
$mysqli = new mysqli('localhost', 'root', '123456789', 'felixdocvzla');

// Salida por si hay algún error en la conexión
if ($mysqli->connect_error) {
    die('Error: (' . $mysqli->connect_errno . ') ' . $mysqli->connect_error);
}

var_dump("Hola");

$nombre = mysqli_real_escape_string($mysqli, $_POST['nombre']);
$email = mysqli_real_escape_string($mysqli, $_POST['email']);
$mensaje = mysqli_real_escape_string($mysqli, $_POST['mensaje']);

var_dump("nombre: $nombre, email: $email, mensaje: $mensaje");

// $email2 = "citas@felixdocvzla.com";
$email2 = "elgutigamer@gmail.com";
$subject = "[WEB] Ha recibido un correo a traves del formulario de contacto";

var_dump("email2: $email2, asunto: $subject");

if (strlen($nombre) > 50) {
    echo 'nombre_long';

} elseif (strlen($nombre) < 3) {
    echo 'nombre_short';

} elseif (strlen($email) > 50) {
    echo 'email_long';

} elseif (strlen($email) < 3) {
    echo 'email_short';

} elseif (filter_var($email, FILTER_VALIDATE_EMAIL) === false) {
    echo 'eformat';

} elseif (strlen($mensaje) > 5000) {
    echo 'mensaje_long';

} elseif (strlen($mensaje) < 3) {
    echo 'mensaje_short';

} else {
	var_dump("Se ejecuta el else");

	 //MAILER

    require 'phpmailer/src/PHPMailer.php';

    $mail = new PHPMailer;
	
	//$mail->SMTPDebug = 3;                               // Enable verbose debug output

    $mail->isSMTP();                                      // Set mailer to use SMTP
    $mail->Host = 'smtp.gmail.com';  // Specify main and backup SMTP servers
    $mail->SMTPAuth = true;                               // Enable SMTP authentication
    $mail->Username = 'elgutigamer@gmail.com';                 // SMTP username
    $mail->Password = 'qwyuhbpqcolyoyth';                           // SMTP password
    $mail->SMTPSecure = 'tls';                           // Enable TLS encryption, `ssl` also accepted
    $mail->Port = 25;                                    // TCP port to connect to

	$mail->AddReplyTo($email);
    $mail->From = $email2;
    $mail->FromName = $nombre;
    $mail->addAddress('elgutigamer@gmail.com', 'Admin');     // Add a recipient

    $mail->isHTML(true);                                  // Set email format to HTML

    $mail->Subject = $subject;
    $mail->Body = $mensaje;

    $mail->send();

    if (!$mail->send()) {
        echo 'Message could not be sent.';
        echo 'Mailer Error: ' . $mail->ErrorInfo;
        var_dump('Mailer Error: ' . $mail->ErrorInfo);
    } else {
        echo 'true';
        var_dump("Se envió el mensaje");
    }
}

?>