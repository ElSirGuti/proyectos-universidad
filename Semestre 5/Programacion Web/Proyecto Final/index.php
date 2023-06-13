<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Dr. Félix González, gastroenterólogo en Valencia con más de 20 años de experiencia en el diagnóstico y tratamiento de enfermedades gastrointestinales. También ofrece servicios de telemedicina para consultas a distancia.">
    <meta name="author" content="Andrés Gutiérrez">

    <title>Dr. Félix González - Inicio</title>
    <link rel="icon" href="icono/icon.png">

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/business-casual.css" rel="stylesheet">
</head>

<body>

    <div class="brand">Dr. Félix González</div>
    <div class="address-bar">Centro Policlínico La Viña | Torre B Consultorio 323 | Valencia, Carabobo 2001 | 412.038.3584</div>

    <?php 
    
        if (isset($_GET["logout"])){
            if ($_GET["logout"] == true) {?>
                <div class="alert alert-success">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <strong>Sesión Cerrada Exitosamente.</strong>
                </div>
    <?php
            }
        }
    ?>
    
    
    <!-- Barra de navegacion en archivo externo -->
    <?php require_once 'nav.php'; ?>

    <div class="container">

        <div class="row">
            <div class="box">
                <div class="col-lg-12 text-center">
                    <div id="carousel-example-generic" class="carousel slide">
                        <!-- Indicators -->
                        <ol class="carousel-indicators hidden-xs">
                            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">
                            <div class="item active">
                                <img class="img-responsive img-full" src="img/slide1.jpg" alt="">
                            </div>
                            <div class="item">
                                <img class="img-responsive img-full" src="img/slide2.jpg" alt="">
                            </div>
                            <div class="item">
                                <img class="img-responsive img-full" src="img/slide3.jpg" alt="">
                            </div>
                        </div>

                        <!-- Controls -->
                        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                            <span class="icon-prev"></span>
                        </a>
                        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                            <span class="icon-next"></span>
                        </a>
                    </div>
                    <h2>
                        <small>Bienvenido al sitio web del</small>
                    </h2>
                    <h1>
                        <span class="brand-name">Dr. Félix González</span>
                    </h1>
                    <!-- <hr class="tagline-divider">
                    <h2>
                        <small>Por <strong>Andrés Gutiérrez y Luis Amias</strong></small>
                    </h2> -->
                </div>
            </div>
        </div>

        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Gastroenterología integral en <strong>Valencia</strong>
                    </h2>
                    <hr>
                    <img class="img-responsive img-border img-left" src="img/intro.jpg" alt="">
                    <hr class="visible-xs">
                    <p>El Dr. Felix González es un gastroenterólogo que atiende a pacientes en Valencia, Venezuela. Se graduó de la Universidad de Carabobo de la Facultad de Medicina en el 2001 y tiene 21 años de experiencia. Sus especialidades incluyen gastroenterología y medicina interna. Está afiliado al Policlínico La Viña y acepta varios planes de seguro. También realiza procedimientos como endoscopia, colonoscopia y ecografía abdominal.</p>
                </div>
            </div>
        </div>

        <!-- <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Beautiful boxes <strong>to showcase your content</strong>
                    </h2>
                    <hr>
                    <p>Use as many boxes as you like, and put anything you want in them! They are great for just about anything, the sky's the limit!</p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc placerat diam quis nisl vestibulum dignissim. In hac habitasse platea dictumst. Interdum et malesuada fames ac ante ipsum primis in faucibus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
                </div>
            </div>
        </div> -->

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
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.js"></script>
    <script>
    // Activates the Carousel
    $('.carousel').carousel({
        interval: 5000
    })
    </script>

</body>

</html>
