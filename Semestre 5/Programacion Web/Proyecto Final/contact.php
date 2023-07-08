<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dr. Félix González - Contacto</title>
    <link rel="icon" href="icono/icon.png">

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/business-casual.css" rel="stylesheet">

    <!-- JavaScript -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/correo.js"></script>

</head>

<body>

    <div class="brand">Dr. Félix González</div>
    <div class="address-bar">Centro Policlínico La Viña | Torre B Consultorio 323 | Valencia, Carabobo 2001 | 412.038.3584</div>

    <!-- Barra de navegacion en archivo externo -->
    <?php require_once 'nav.php'; ?>

    <div class="container">
        
        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center"><strong>¿Cómo llegar?</strong>
                    </h2>
                    <hr>
                </div>
                <div class="col-md-8">
                
                    <!-- Mapa de Google Maps incrustado -->
                    <iframe width="100%" height="400" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d490.8135291765916!2d-68.01596979460054!3d10.220531520775666!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8e805d9625eb6241%3A0x2c84d642197152bb!2zQ2zDrW5pY2EgTGEgVmnDsWE!5e0!3m2!1sen!2sve!4v1686536183250!5m2!1sen!2sve"></iframe>
                </div>
                <div class="col-md-4">
                    <p>Teléfono: <a href="https://wa.me/584120383584/?text=Muy%20buenas%20Dr.%20F%C3%A9lix%20Gonz%C3%A1lez%21%20Mi%20nombre%20es%20%28inserte%20su%20nombre%29%20y%20quisiera%20preguntarle%20sobre%20disponibilidad%20para%20una%20cita%20el%20d%C3%ADa%20%28ingrese%20la%20fecha%29." target="_blank"><strong>0412.038.3584</strong></a>
                    </p>
                    <p>Email: <a href="mailto:frgp.ch@gmail.com?subject=[Cita] Solicitud de cita/informacion&body=Muy buenas Dr. Félix González! Mi nombre es (inserte su nombre) y quisiera preguntarle sobre disponibilidad para una cita el día (ingrese la fecha)."><strong>frgp.ch@gmail.com</strong></a>
                    </p>
                    <p>Dirección: <strong>Centro Policlínico La Viña<br>Torre B Consultorio 323<br>Av. 105<br>Valencia, Carabobo 2001</strong>
                    </p>
                    <p>(Haga click en el número de teléfono o en la dirección correo electrónico dependiendo de la solicitud que quiera hacer)</p>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        
        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center"><strong>Formulario </strong>de Contacto
                    </h2>
                    <hr>
                    <p>Agendar tu cita o pedir información es ahora más fácil, tan solo tienes que rellenar los campos inferiores con tus datos y te responderé en el menor tiempo posible.</p>
                    <div id="add_err2"></div>
                    <form role="form" action="https://formbold.com/s/3wkk8" method="post">
                        <div class="row">
                            <div class="form-group col-lg-6">
                                <label>Nombre Completo</label>
                                <input type="text" name="Nombre" class="form-control" maxlength="50" required="">
                            </div>
                            
                            <div class="form-group col-lg-6">
                                <label>Correo Electrónico</label>
                                <input type="email" name="Email" class="form-control" maxlength="50" required="">
                            </div>

                            <div class="form-group col-lg-12">
                                <label>Asunto</label>
                                <input type="text" name="Asunto" class="form-control" maxlength="50" required="">
                            </div>
                            
                            <div class="form-group col-lg-12">
                                <label>Mensaje</label>
                                <textarea class="form-control" name="Mensaje" rows="6" required="" style="resize: vertical;" maxlength="5000"></textarea>
                            </div>
                            <div class="form-group col-lg-12">
                                <button type="submit" name="enviar"class="btn btn-default">Enviar</button>
                            </div>
                        </div>
                    </form>
        </div>

    </div>

    <!-- /.container -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <p>Copyright &copy; Dr. Félix R. Gonzalez P. 2023</p>
                </div>
            </div>
        </div>
    </footer>

    

</body>

</html>
