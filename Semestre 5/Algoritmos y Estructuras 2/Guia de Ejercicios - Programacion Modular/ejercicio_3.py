# Guia de Ejercicios #1
# Algoritmos y Estructuras 2
# Andrés Gutiérrez

# Calcular el volumen de una esfera donde sus datos hayan sido solicitados al
# usuario
import math

PI = math.pi

def vEsfera(radio):
    return (4 / 3) * PI * radio**3

radio = float(input("Introduce el radio: "))
resultado = vEsfera(radio)
print("El volumen de la esfera es: %i" % resultado)