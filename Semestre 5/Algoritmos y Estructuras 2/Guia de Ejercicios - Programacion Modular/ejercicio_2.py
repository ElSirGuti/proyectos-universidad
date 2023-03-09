# Guia de Ejercicios #1
# Algoritmos y Estructuras 2
# Andrés Gutiérrez

# calcular el perímetro de un rectángulo donde su base y su altura sea
# introducida por el usuario.

def pRectangulo(base, altura):
    return 2 * (base + altura)

base = float(input("Introduce la base: "))
altura = float(input("Introduce la altura: "))
resultado = pRectangulo(base, altura)
print("El perimetro del rectangulo es: %i" % resultado)