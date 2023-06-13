$(document).ready(function () {
    
    $("#register").click(function () {

        nombre = $("#nombre").val();
        apellido = $("#apellido").val();
        email = $("#email").val();
        password = $("#password").val();

        $.ajax({
            type: "POST",
            url: "adduser.php",
            data: "nombre=" + nombre + "&apellido=" + apellido + "&email=" + email + "&password=" + password,
            success: function (html) {
                console.log(html);
                if (html == 'true') {

                    $("#add_err2").html('<div class="alert alert-success"> \
                                        Cuenta <strong>procesada.</strong> \ \
                                        </div>');

                    window.location.href = "index.php";

                } else if (html == 'false') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        El <strong>Correo Electrónico</strong> ya existe.\ \
                                        </div>');
                } else if (html == 'nombre') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        Introduzca su <strong>Nombre</strong>.\ \
                                        </div>');
                } else if (html == 'apellido') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        Introduzca su <strong>Apellido</strong>.\ \
                                        </div>');
                } else if (html == 'eshort') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        Introduzca su <strong>Correo Electrónico</strong>.\ \
                                        </div>');
                } else if (html == 'eformat') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        El formato del <strong>Correo Electrónico</strong> no es válido.\ \
                                        </div>');
                } else if (html == 'pshort') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        La <strong>Contraseña</strong> debe contener al menos 4 caracteres.\ \
                                        </div>');
                } else {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        <strong>Error</strong> procesando su petición. Por favor intente de nuevo. \ \
                                        </div>');
                }
            }, beforeSend: function () {
                $("#add_err2").html("Cargando...");
            }
        });
        return false;
    });
});