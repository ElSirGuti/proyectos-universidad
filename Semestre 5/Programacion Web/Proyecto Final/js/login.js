$(document).ready(function() {
    $("#login").click(function() {
        email=$("#email").val();
        password=$("#password").val();
        $.ajax({
            type: "POST",
            url: "pcheck.php",
            data: "email="+email+"&password="+password,
            success: function(html){
                if(html=='true'){
                    $("add_err2").html('<div class="alert alert-success"> \
                                        <strong>Inicio de Sesión Exitoso.</strong> \ \
                                        </div>');
                    window.location.href = "blog.php";
                } else if (html == 'false'){
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        <strong>El correo o la contraseña son inválidos.</strong> \ \
                                        </div>');
                } else {
                    $("#add_err2").html('<div class="alert alert-danger"> \
                                        <strong>Ha ocurrido un error. Intente de nuevo.</strong> \ \
                                        </div>');
                }
            },
            beforeSend:function(){
                $("#add_err2").html("Cargando...");
            }
        });
        return false;
    });
});