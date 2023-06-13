<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dr. Félix González - Registrarse</title>
    <link rel="icon" href="icono/icon.png">

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/business-casual.css" rel="stylesheet">

    <!-- jQuery -->
    <script src="js/jquery-1.10.2.js"></script>

    <!-- Validación del registro -->
    <script src="js/validacion.js"></script>
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
                    <h2 class="intro-text text-center"><strong>Formulario </strong>de Registro
                    </h2>
                    <div id="add_err2"></div>
                    <hr>
                    <form role="form">
                        <div class="row">
                            <div class="form-group col-lg-4">
                                <label>Nombre</label>
                                <input type="text" id="nombre" name="nombre" maxlength="25" class="form-control">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Apellido</label>
                                <input type="text" id="apellido" name="apellido" maxlength="25" class="form-control">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Correo Electrónico</label>
                                <input type="email" id="email" name="email" maxlength="100" class="form-control">
                            </div>
                            <div class="clearfix"></div>
                            <div class="form-group col-lg-12">
                                <label>Contraseña</label>
                                <input type="password" id="password" name="password" maxlength="250" class="form-control">
                            </div>
                            <div class="form-group col-lg-12">
                                <button type="submit" id="register" class="btn btn-default">Registrar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
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

    <!-- JavaScript -->
    <script src="js/bootstrap.js"></script>

</body>

</html>
