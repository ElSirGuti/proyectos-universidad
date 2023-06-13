$(document).ready(function () {

    $("#contact").click(function () {
        console.log("Hola mundo");

        nombre = $("#nombre").val();
        email = $("#email").val();
        mensaje = $("#mensaje").val();
        console.log("nombre: " + nombre + ", email: " + email + ", mensaje: " + mensaje);

        $.ajax({
            type: "POST",
            url: "sendmsg.php",
            data: "nombre=" + nombre + "&email=" + email + "&mensaje=" + mensaje,
            
            success: function (html) {
                console.log(html);
                if (html == 'true') {

                    $("#add_err2").html('<div class="alert alert-success"> \
                                         <strong>Mensaje Enviado!</strong> \ \
                                         </div>');

                } else if (html == 'nombre_long') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                         <strong>El nombre</strong> no debe exceder los 50 caracteres. \ \
                                         </div>');
                
                } else if (html == 'nombre_short') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                         <strong>El nombre</strong> debe contener al menos 2 caracteres. \ \
                                         </div>');
                                         
                } else if (html == 'email_long') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                         <strong>Su Email</strong> no debe exceder los 50 caracteres. \ \
                                         </div>');
                
                } else if (html == 'email_short') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                         <strong>Su Email</strong> debe contener al menos 2 caracteres. \ \
                                         </div>');
                                         
                } else if (html == 'eformat') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        El formato del <strong>Correo Electrónico</strong> no es válido. \ \
                                         </div>');
                                         
                } else if (html == 'mensaje_long') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                         <strong>El Mensaje</strong> no debe exceder los 5000 caracteres. \ \
                                         </div>');
                
                } else if (html == 'mensaje_short') {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                         <strong>El Mensaje</strong> debe contener al menos 2 caracteres. \ \
                                         </div>');


                } else {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                         <strong>Error</strong> procesando su petición. Intente de nuevo. \ \
                                         </div>');
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log('Error: ' + textStatus + ', ' + errorThrown);
            },
            beforeSend: function () {
                $("#add_err2").html("Cargando...");
            }
        });
        return false;
    });
});