<?php
    // Con esto evitamos que el usuario entre al blog sin iniciar sesion
    session_start();

    if (isset($_SESSION['login'])) {
        $nombre = $_SESSION['nombre'];
        $apellido = $_SESSION['apellido'];
    
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dr. Félix González - Blog</title>
    <link rel="icon" href="icono/icon.png">

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/business-casual.css" rel="stylesheet">
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

                    <h2 class="text-center">Bienvenido/a <?php echo $nombre; echo " "; echo $apellido; ?> - <a href="logout.php">Cerrar Sesión</a></h2>

                    <hr>
                    <h2 class="intro-text text-center"><strong>Blog </strong>Informativo
                    </h2>
                    <hr>
                </div>
                <div class="col-lg-12 text-center">
                    <img class="img-responsive img-border img-full" src="img/covid.jpg" alt="">
                    <h2>¿Has oído hablar del COVID long gastrointestinal?
                        <br>
                        <small>Junio 10, 2023</small>
                    </h2>
                    <p>¿Sabías que algunos pacientes experimentan síntomas gastrointestinales persistentes después de haber tenido COVID-19? Es cierto, incluso después de que la infección aguda desaparezca, las náuseas, la diarrea y otros síntomas pueden persistir.</p>
                    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Leer Más</button>
                    <hr>
                </div>
                <div class="col-lg-12 text-center">
                    <img class="img-responsive img-border img-full" src="img/celiaquia.jpg" alt="">
                    <h2>Aproximación a la Celiaquía
                        <br>
                        <small>Mayo 25, 2023</small>
                    </h2>
                    <p>La enfermedad celíaca es una afección crónica del sistema inmunológico que afecta el intestino delgado. Se desencadena por la ingesta de gluten, una proteína presente en el trigo, la cebada y el centeno. El diagnóstico temprano y preciso de la enfermedad celíaca es crucial para evitar complicaciones y mejorar la calidad de vida de los pacientes.</p>
                    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal2">Leer Más</button>
                    <hr>
                </div>
                <div class="col-lg-12 text-center">
                    <img class="img-responsive img-border img-full" src="img/charla.webp" alt="">
                    <h2>Charla sobre vacunas con la Dra. Amalia Hermoso
                        <br>
                        <small>Abril 1, 2023</small>
                    </h2>
                    <p>Hablamos con la Dra. Amalia Hermoso <a href="https://www.instagram.com/dra.infectokids/" target="_blank">@dra.infectokids</a> sobre vacunación sobretodo en enfermedad inflamatoria intestinal Crohn y colitis ulcerosa</p>
                    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal3">Leer Más</button>
                    <hr>
                </div>
                <div class="col-lg-12 text-center">
                    <ul class="pager">
                        <li class="previous"><a href="#">&larr; Older</a>
                        </li>
                        <li class="next"><a href="#">Newer &rarr;</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container -->

    <!-- Modal 1 -->
    <div id="myModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Contenido modal -->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">¿Has oído hablar del COVID long gastrointestinal?</h4>
                </div>
                <div class="modal-body">
                    <p> El covid long es un término que se usa para describir a las personas que sufren síntomas persistentes después de una infección por el virus SARS-CoV-2. 
                        Algunos de estos síntomas pueden afectar al sistema gastrointestinal, como dolor abdominal, diarrea, estreñimiento, reflujo ácido, úlcera péptica, pancreatitis o inflamación de las vías biliares.
                        <a href="https://www.nature.com/articles/s41467-023-36223-7" target="_blank">Según los resultados de un estudio publicado en Nature Communications</a>, las personas que han tenido covid-19 tienen un mayor riesgo y una mayor carga de trastornos gastrointestinales durante el año posterior a la infección, en comparación con las personas que no han tenido covid-19.
                        Este riesgo aumenta según la gravedad de la fase aguda de la covid-19 (no hospitalizada, hospitalizada o ingresada en cuidados intensivos).
                        <a href="https://pubmed.ncbi.nlm.nih.gov/36165028/" target="_blank">La causa de los síntomas gastrointestinales del covid long es desconocida y se han planteado varias hipótesis, como la propia infección del virus en el tracto gastrointestinal, los cambios en el microbioma intestinal, la respuesta inflamatoria sistémica o los efectos del estrés pandémico sobre la función y la percepción de los síntomas gastrointestinales.</a>
                        El cuidado post-covid debe incluir atención a la salud y a las enfermedades gastrointestinales.
                    </p>

                    <p>Para aliviar los síntomas gastrointestinales, se recomienda seguir algunas medidas de autocuidado, según la causa y la gravedad de los síntomas. Algunas medidas generales son:</p>

                    <ul>
                        <li>Comer y beber lentamente para evitar tragar aire.</li>
                        <li>Evitar las bebidas carbonatadas y la cerveza, que liberan gas.</li>
                        <li>Evitar mascar chicle, chupar caramelos duros y fumar, que favorecen la entrada de aire.</li>
                        <li>Revisar las dentaduras postizas, si las usa, para que se ajusten bien.</li>
                        <li>Hacer ejercicio después de comer para facilitar la digestión.</li>
                        <li>Tratar la acidez estomacal con antiácidos o medicamentos recetados por el médico.</li>
                        <li>Evitar los alimentos que causan gases, como las legumbres, el repollo, la cebolla, el brócoli, los alimentos integrales, los champiñones, algunas frutas y la leche o los productos lácteos si es intolerante a la lactosa.</li>
                        <li>Comer menos alimentos grasos, que pueden retrasar el vaciado gástrico.</li>
                        <li>Reducir temporalmente el consumo de alimentos ricos en fibra, que pueden producir más gases. Después de un descanso, añadir gradualmente la fibra a la dieta.</li>
                        <li>Tomar un suplemento probiótico para mejorar el equilibrio de la flora intestinal.</li>
                    </ul>
                    
                    <p>Si los síntomas son persistentes o severos, o si se acompañan de fiebre, vómitos, sangre en las heces, pérdida de peso involuntaria o deshidratación, se debe consultar al médico para descartar una infección o una enfermedad más grave. El médico puede indicar el tratamiento más adecuado según el diagnóstico y el estado de salud del paciente.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Modal 2 -->
    <div id="myModal2" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Contenido modal -->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Aproximación a la Celiaquía</h4>
                </div>
                <div class="modal-body">
                    <p>La enfermedad celíaca es una afección crónica del sistema inmunológico que afecta el intestino delgado. Se desencadena por la ingesta de gluten, una proteína presente en el trigo, la cebada y el centeno. El diagnóstico temprano y preciso de la enfermedad celíaca es crucial para evitar complicaciones y mejorar la calidad de vida de los pacientes.</p>
                    <p>El algoritmo diagnóstico de la enfermedad celíaca ha evolucionado a lo largo de los años y se basa en varias pruebas y evaluaciones clínicas. A continuación, se presenta un resumen de los pasos comunes involucrados en el diagnóstico adecuado:</p>
                    <p>1. Evaluación clínica: El médico recopila el historial médico completo del paciente, incluyendo síntomas, antecedentes familiares y otras afecciones relacionadas. La enfermedad celíaca puede manifestarse de diferentes maneras, y los síntomas varían entre las personas.</p>
                    <p> 2. Pruebas serológicas: Se realizan pruebas de sangre para detectar ciertos anticuerpos específicos asociados con la enfermedad celíaca. Los anticuerpos más comunes incluyen la inmunoglobulina A (IgA) y los anticuerpos anti-transglutaminasa tisular (tTG) y anti-endomisio (EMA). Si los resultados son positivos, indica la posibilidad de enfermedad celíaca, pero se requiere una confirmación adicional.</p>
                    <p> 3. Biopsia del intestino delgado: La confirmación definitiva del diagnóstico se realiza mediante una biopsia del intestino delgado. Se realiza una endoscopia para obtener muestras de tejido del intestino delgado y se examinan en busca de daño característico de la enfermedad celíaca, como la atrofia de las vellosidades intestinales.</p>
                    <p> 4. Prueba genética: Se puede realizar una prueba genética para detectar la presencia de ciertos genes, como el HLA-DQ2 y el HLA-DQ8, que están asociados con un mayor riesgo de desarrollar enfermedad celíaca. Sin embargo, esta prueba no es concluyente por sí sola y se utiliza principalmente para respaldar otros hallazgos diagnósticos.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Modal 3 -->
    <div id="myModal3" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Contenido modal -->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Charla sobre vacunas con la Dra. Amalia Hermoso</h4>
                </div>
                <div class="modal-body">
                    <p>Parte 1 de nuestra charla</p>
                    <blockquote class="instagram-media" data-instgrm-permalink="https://www.instagram.com/reel/Cqf_RiDrwY4/?utm_source=ig_embed&utm_campaign=loading" data-instgrm-captioned data-instgrm-version="14" style=" background:#FFF; border:0; border-radius:3px; box-shadow:0 0 1px 0 rgba(0,0,0,0.5),0 1px 10px 0 rgba(0,0,0,0.15); margin: 1px; max-width:658px; min-width:326px; padding:0; width:99.375%; width:-webkit-calc(100% - 2px); width:calc(100% - 2px);"><div style="padding:16px;"> <a href="https://www.instagram.com/reel/Cqf_RiDrwY4/?utm_source=ig_embed&utm_campaign=loading" style=" background:#FFFFFF; line-height:0; padding:0 0; text-align:center; text-decoration:none; width:100%;" target="_blank"> <div style=" display: flex; flex-direction: row; align-items: center;"> <div style="background-color: #F4F4F4; border-radius: 50%; flex-grow: 0; height: 40px; margin-right: 14px; width: 40px;"></div> <div style="display: flex; flex-direction: column; flex-grow: 1; justify-content: center;"> <div style=" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; margin-bottom: 6px; width: 100px;"></div> <div style=" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; width: 60px;"></div></div></div><div style="padding: 19% 0;"></div> <div style="display:block; height:50px; margin:0 auto 12px; width:50px;"><svg width="50px" height="50px" viewBox="0 0 60 60" version="1.1" xmlns="https://www.w3.org/2000/svg" xmlns:xlink="https://www.w3.org/1999/xlink"><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g transform="translate(-511.000000, -20.000000)" fill="#000000"><g><path d="M556.869,30.41 C554.814,30.41 553.148,32.076 553.148,34.131 C553.148,36.186 554.814,37.852 556.869,37.852 C558.924,37.852 560.59,36.186 560.59,34.131 C560.59,32.076 558.924,30.41 556.869,30.41 M541,60.657 C535.114,60.657 530.342,55.887 530.342,50 C530.342,44.114 535.114,39.342 541,39.342 C546.887,39.342 551.658,44.114 551.658,50 C551.658,55.887 546.887,60.657 541,60.657 M541,33.886 C532.1,33.886 524.886,41.1 524.886,50 C524.886,58.899 532.1,66.113 541,66.113 C549.9,66.113 557.115,58.899 557.115,50 C557.115,41.1 549.9,33.886 541,33.886 M565.378,62.101 C565.244,65.022 564.756,66.606 564.346,67.663 C563.803,69.06 563.154,70.057 562.106,71.106 C561.058,72.155 560.06,72.803 558.662,73.347 C557.607,73.757 556.021,74.244 553.102,74.378 C549.944,74.521 548.997,74.552 541,74.552 C533.003,74.552 532.056,74.521 528.898,74.378 C525.979,74.244 524.393,73.757 523.338,73.347 C521.94,72.803 520.942,72.155 519.894,71.106 C518.846,70.057 518.197,69.06 517.654,67.663 C517.244,66.606 516.755,65.022 516.623,62.101 C516.479,58.943 516.448,57.996 516.448,50 C516.448,42.003 516.479,41.056 516.623,37.899 C516.755,34.978 517.244,33.391 517.654,32.338 C518.197,30.938 518.846,29.942 519.894,28.894 C520.942,27.846 521.94,27.196 523.338,26.654 C524.393,26.244 525.979,25.756 528.898,25.623 C532.057,25.479 533.004,25.448 541,25.448 C548.997,25.448 549.943,25.479 553.102,25.623 C556.021,25.756 557.607,26.244 558.662,26.654 C560.06,27.196 561.058,27.846 562.106,28.894 C563.154,29.942 563.803,30.938 564.346,32.338 C564.756,33.391 565.244,34.978 565.378,37.899 C565.522,41.056 565.552,42.003 565.552,50 C565.552,57.996 565.522,58.943 565.378,62.101 M570.82,37.631 C570.674,34.438 570.167,32.258 569.425,30.349 C568.659,28.377 567.633,26.702 565.965,25.035 C564.297,23.368 562.623,22.342 560.652,21.575 C558.743,20.834 556.562,20.326 553.369,20.18 C550.169,20.033 549.148,20 541,20 C532.853,20 531.831,20.033 528.631,20.18 C525.438,20.326 523.257,20.834 521.349,21.575 C519.376,22.342 517.703,23.368 516.035,25.035 C514.368,26.702 513.342,28.377 512.574,30.349 C511.834,32.258 511.326,34.438 511.181,37.631 C511.035,40.831 511,41.851 511,50 C511,58.147 511.035,59.17 511.181,62.369 C511.326,65.562 511.834,67.743 512.574,69.651 C513.342,71.625 514.368,73.296 516.035,74.965 C517.703,76.634 519.376,77.658 521.349,78.425 C523.257,79.167 525.438,79.673 528.631,79.82 C531.831,79.965 532.853,80.001 541,80.001 C549.148,80.001 550.169,79.965 553.369,79.82 C556.562,79.673 558.743,79.167 560.652,78.425 C562.623,77.658 564.297,76.634 565.965,74.965 C567.633,73.296 568.659,71.625 569.425,69.651 C570.167,67.743 570.674,65.562 570.82,62.369 C570.966,59.17 571,58.147 571,50 C571,41.851 570.966,40.831 570.82,37.631"></path></g></g></g></svg></div><div style="padding-top: 8px;"> <div style=" color:#3897f0; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:550; line-height:18px;">View this post on Instagram</div></div><div style="padding: 12.5% 0;"></div> <div style="display: flex; flex-direction: row; margin-bottom: 14px; align-items: center;"><div> <div style="background-color: #F4F4F4; border-radius: 50%; height: 12.5px; width: 12.5px; transform: translateX(0px) translateY(7px);"></div> <div style="background-color: #F4F4F4; height: 12.5px; transform: rotate(-45deg) translateX(3px) translateY(1px); width: 12.5px; flex-grow: 0; margin-right: 14px; margin-left: 2px;"></div> <div style="background-color: #F4F4F4; border-radius: 50%; height: 12.5px; width: 12.5px; transform: translateX(9px) translateY(-18px);"></div></div><div style="margin-left: 8px;"> <div style=" background-color: #F4F4F4; border-radius: 50%; flex-grow: 0; height: 20px; width: 20px;"></div> <div style=" width: 0; height: 0; border-top: 2px solid transparent; border-left: 6px solid #f4f4f4; border-bottom: 2px solid transparent; transform: translateX(16px) translateY(-4px) rotate(30deg)"></div></div><div style="margin-left: auto;"> <div style=" width: 0px; border-top: 8px solid #F4F4F4; border-right: 8px solid transparent; transform: translateY(16px);"></div> <div style=" background-color: #F4F4F4; flex-grow: 0; height: 12px; width: 16px; transform: translateY(-4px);"></div> <div style=" width: 0; height: 0; border-top: 8px solid #F4F4F4; border-left: 8px solid transparent; transform: translateY(-4px) translateX(8px);"></div></div></div> <div style="display: flex; flex-direction: column; flex-grow: 1; justify-content: center; margin-bottom: 24px;"> <div style=" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; margin-bottom: 6px; width: 224px;"></div> <div style=" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; width: 144px;"></div></div></a><p style=" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; line-height:17px; margin-bottom:0; margin-top:8px; overflow:hidden; padding:8px 0 7px; text-align:center; text-overflow:ellipsis; white-space:nowrap;"><a href="https://www.instagram.com/reel/Cqf_RiDrwY4/?utm_source=ig_embed&utm_campaign=loading" style=" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:normal; line-height:17px; text-decoration:none;" target="_blank">A post shared by Dr. Félix R González P (@felixdocvzla)</a></p></div></blockquote>
                    <script async src="https://www.instagram.com/embed.js"></script>
                    
                    <br><p>Parte 2 de nuestra charla</p>
                    <blockquote class="instagram-media" data-instgrm-permalink="https://www.instagram.com/reel/Cq4Fm_gvyvd/?utm_source=ig_embed&utm_campaign=loading" data-instgrm-captioned data-instgrm-version="14" style=" background:#FFF; border:0; border-radius:3px; box-shadow:0 0 1px 0 rgba(0,0,0,0.5),0 1px 10px 0 rgba(0,0,0,0.15); margin: 1px; max-width:658px; min-width:326px; padding:0; width:99.375%; width:-webkit-calc(100% - 2px); width:calc(100% - 2px);"><div style="padding:16px;"> <a href="https://www.instagram.com/reel/Cq4Fm_gvyvd/?utm_source=ig_embed&utm_campaign=loading" style=" background:#FFFFFF; line-height:0; padding:0 0; text-align:center; text-decoration:none; width:100%;" target="_blank"> <div style=" display: flex; flex-direction: row; align-items: center;"> <div style="background-color: #F4F4F4; border-radius: 50%; flex-grow: 0; height: 40px; margin-right: 14px; width: 40px;"></div> <div style="display: flex; flex-direction: column; flex-grow: 1; justify-content: center;"> <div style=" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; margin-bottom: 6px; width: 100px;"></div> <div style=" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; width: 60px;"></div></div></div><div style="padding: 19% 0;"></div> <div style="display:block; height:50px; margin:0 auto 12px; width:50px;"><svg width="50px" height="50px" viewBox="0 0 60 60" version="1.1" xmlns="https://www.w3.org/2000/svg" xmlns:xlink="https://www.w3.org/1999/xlink"><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g transform="translate(-511.000000, -20.000000)" fill="#000000"><g><path d="M556.869,30.41 C554.814,30.41 553.148,32.076 553.148,34.131 C553.148,36.186 554.814,37.852 556.869,37.852 C558.924,37.852 560.59,36.186 560.59,34.131 C560.59,32.076 558.924,30.41 556.869,30.41 M541,60.657 C535.114,60.657 530.342,55.887 530.342,50 C530.342,44.114 535.114,39.342 541,39.342 C546.887,39.342 551.658,44.114 551.658,50 C551.658,55.887 546.887,60.657 541,60.657 M541,33.886 C532.1,33.886 524.886,41.1 524.886,50 C524.886,58.899 532.1,66.113 541,66.113 C549.9,66.113 557.115,58.899 557.115,50 C557.115,41.1 549.9,33.886 541,33.886 M565.378,62.101 C565.244,65.022 564.756,66.606 564.346,67.663 C563.803,69.06 563.154,70.057 562.106,71.106 C561.058,72.155 560.06,72.803 558.662,73.347 C557.607,73.757 556.021,74.244 553.102,74.378 C549.944,74.521 548.997,74.552 541,74.552 C533.003,74.552 532.056,74.521 528.898,74.378 C525.979,74.244 524.393,73.757 523.338,73.347 C521.94,72.803 520.942,72.155 519.894,71.106 C518.846,70.057 518.197,69.06 517.654,67.663 C517.244,66.606 516.755,65.022 516.623,62.101 C516.479,58.943 516.448,57.996 516.448,50 C516.448,42.003 516.479,41.056 516.623,37.899 C516.755,34.978 517.244,33.391 517.654,32.338 C518.197,30.938 518.846,29.942 519.894,28.894 C520.942,27.846 521.94,27.196 523.338,26.654 C524.393,26.244 525.979,25.756 528.898,25.623 C532.057,25.479 533.004,25.448 541,25.448 C548.997,25.448 549.943,25.479 553.102,25.623 C556.021,25.756 557.607,26.244 558.662,26.654 C560.06,27.196 561.058,27.846 562.106,28.894 C563.154,29.942 563.803,30.938 564.346,32.338 C564.756,33.391 565.244,34.978 565.378,37.899 C565.522,41.056 565.552,42.003 565.552,50 C565.552,57.996 565.522,58.943 565.378,62.101 M570.82,37.631 C570.674,34.438 570.167,32.258 569.425,30.349 C568.659,28.377 567.633,26.702 565.965,25.035 C564.297,23.368 562.623,22.342 560.652,21.575 C558.743,20.834 556.562,20.326 553.369,20.18 C550.169,20.033 549.148,20 541,20 C532.853,20 531.831,20.033 528.631,20.18 C525.438,20.326 523.257,20.834 521.349,21.575 C519.376,22.342 517.703,23.368 516.035,25.035 C514.368,26.702 513.342,28.377 512.574,30.349 C511.834,32.258 511.326,34.438 511.181,37.631 C511.035,40.831 511,41.851 511,50 C511,58.147 511.035,59.17 511.181,62.369 C511.326,65.562 511.834,67.743 512.574,69.651 C513.342,71.625 514.368,73.296 516.035,74.965 C517.703,76.634 519.376,77.658 521.349,78.425 C523.257,79.167 525.438,79.673 528.631,79.82 C531.831,79.965 532.853,80.001 541,80.001 C549.148,80.001 550.169,79.965 553.369,79.82 C556.562,79.673 558.743,79.167 560.652,78.425 C562.623,77.658 564.297,76.634 565.965,74.965 C567.633,73.296 568.659,71.625 569.425,69.651 C570.167,67.743 570.674,65.562 570.82,62.369 C570.966,59.17 571,58.147 571,50 C571,41.851 570.966,40.831 570.82,37.631"></path></g></g></g></svg></div><div style="padding-top: 8px;"> <div style=" color:#3897f0; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:550; line-height:18px;">View this post on Instagram</div></div><div style="padding: 12.5% 0;"></div> <div style="display: flex; flex-direction: row; margin-bottom: 14px; align-items: center;"><div> <div style="background-color: #F4F4F4; border-radius: 50%; height: 12.5px; width: 12.5px; transform: translateX(0px) translateY(7px);"></div> <div style="background-color: #F4F4F4; height: 12.5px; transform: rotate(-45deg) translateX(3px) translateY(1px); width: 12.5px; flex-grow: 0; margin-right: 14px; margin-left: 2px;"></div> <div style="background-color: #F4F4F4; border-radius: 50%; height: 12.5px; width: 12.5px; transform: translateX(9px) translateY(-18px);"></div></div><div style="margin-left: 8px;"> <div style=" background-color: #F4F4F4; border-radius: 50%; flex-grow: 0; height: 20px; width: 20px;"></div> <div style=" width: 0; height: 0; border-top: 2px solid transparent; border-left: 6px solid #f4f4f4; border-bottom: 2px solid transparent; transform: translateX(16px) translateY(-4px) rotate(30deg)"></div></div><div style="margin-left: auto;"> <div style=" width: 0px; border-top: 8px solid #F4F4F4; border-right: 8px solid transparent; transform: translateY(16px);"></div> <div style=" background-color: #F4F4F4; flex-grow: 0; height: 12px; width: 16px; transform: translateY(-4px);"></div> <div style=" width: 0; height: 0; border-top: 8px solid #F4F4F4; border-left: 8px solid transparent; transform: translateY(-4px) translateX(8px);"></div></div></div> <div style="display: flex; flex-direction: column; flex-grow: 1; justify-content: center; margin-bottom: 24px;"> <div style=" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; margin-bottom: 6px; width: 224px;"></div> <div style=" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; width: 144px;"></div></div></a><p style=" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; line-height:17px; margin-bottom:0; margin-top:8px; overflow:hidden; padding:8px 0 7px; text-align:center; text-overflow:ellipsis; white-space:nowrap;"><a href="https://www.instagram.com/reel/Cq4Fm_gvyvd/?utm_source=ig_embed&utm_campaign=loading" style=" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:normal; line-height:17px; text-decoration:none;" target="_blank">A post shared by Dr. Félix R González P (@felixdocvzla)</a></p></div></blockquote>
                    <script async src="https://www.instagram.com/embed.js"></script>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                </div>
            </div>
        </div>
    </div>

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

</body>

</html>

<?php

    } else {
        header("location:login.php ");
    }

?>