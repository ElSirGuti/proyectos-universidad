# Trabajo realizado por Andrés Gutiérrez Sección 10312 Universidad José Antonio Páez
# Fecha de entrega #1 09-07-22
# Fecha de entrega #2 17-09-22
"""
Una empresa de desarrollo de software te ha contratado a ti y a tu companer@ para
programar una calculadora basada en línea de comandos(CLI) para un proyecto de uno de
sus clientes que es una institución científica
Esta calculadora científica debe contar con los siguientes módulos a programar:
    I. Consola de línea de Comando: Este módulo deberá permitir el ingreso de comandos para ejecutar funciones de los demás módulos a programar. 
    Estos comandos son: prectangulo, vpiramide, ctiempo, vcubo, regresar(salir del módulo y regresar al inicio).
    II. Perímetro de un rectángulo(prectangulo): Calcular el perímetro de un rectángulo cuyos datos sean solicitados al usuario.
    III. Volumen de una pirámide(vpiramide): Calcular el volumen de una pirámide cuyos datos sean introducido por el usuario
    IV. Calcular Tiempo(ctiempo): Solicita al usuario una cantidad en horas y regresa su equivalente días, minutos y segundos.
    V. Volumen de un cubo(vcubo): Calcular el volumen de un cubo cuyos datos sean introducidos por el usuario.
"""
menu = {
        "prectangulo": {
            "titulo": "prectangulo"
        }

}


def prectangulo(): #Esta función calcula el perímetro de un rectángulo
    #Se le solicitan los valores al usuario
    b = float(input("Introduce la base del rectángulo: "))
    h = float(input("Introduce la altura del rectángulo: "))

    #Se usa lt como lados totales y se suman porque la formula del perímetro de un rectángulo es la suma de todos sus lados
    perimetro = (b + h) * 2
    
    #Se imprime el resultado
    print("El perímetro del rectángulo es de:",perimetro)

def vpiramide(): #Esta función calcula el volumen de una pirámide
    #Se le solicitan los valores al usuario (l: largo y h: altura)
    l = float(input("Introduce el largo de la base: "))
    h = float(input("Introduzca la altura: "))

    #La fórmula del volumen de la pirámide es lado al cuadrado por la altura entre tres (3)
    vp = ((l**2)*h)/3

    #Se imprime el resultado
    print("El volumen de la pirámide es de:",vp)

def ctiempo(): #Esta función convierte las horas en formato de Días - Minutos - Segundos
    #Se le solicita el valor al usuario
    horas = float(input("Introduce la cantidad de horas: "))
    #Para saber la cantidad de días se dividen las horas entre 24 (horas en un día) por 60 (minutos en una hora) por 60 (segundos en un minuto)
    dias = horas / 24
    #Se usa la función round() para redondear la cantidad de días, el dos (2) es la cantidad de decimales
    dias = round(dias, 2)
    #Se convierten las horas restantes a minutos
    minutos = horas * 60 
    #Se convierten las horas restantes a segundos
    segundos = horas * 3600
    #Se imprimen los resultados haciendo uso de placeholders '{}' y la funcion '.format' para imprimir los resultados dentro de los placeholder (llaves)
    print("Dias: {} - Minutos: {} - Segundos: {}" .format(dias, minutos, segundos))

def vcubo(): #Esta función calcula el volumen de un cubo
    lado = float(input("Introduce el valor del lado: "))

    vc = lado**3

    print("El volumen del cubo es de:",vc)
