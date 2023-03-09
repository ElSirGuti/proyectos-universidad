# Guia de Ejercicios #1
# Algoritmos y Estructuras 2
# Andrés Gutiérrez

# Calcular el volumen de un cilindro donde sus datos hayan sido introducidos
# por el usuario.

import math

PI = math.pi

def vCilindro(radio, altura):
    return PI * radio**2 * altura

radio = float(input("Introduce el radio: "))
altura= float(input("Introduce el altura: "))
resultado = vCilindro(radio, altura)
print("El volumen del cilindro es: %i" % resultado)