# Guia de Ejercicios #1
# Algoritmos y Estructuras 2
# Andrés Gutiérrez

# calcular el perímetro de un rectángulo donde su base y su altura sea
# introducida por el usuario.

def areaRec(base, altura):
    aResultado = base * altura
    return aResultado

base = int(input("Base: "))
altura = int(input("Altura: "))
calcAreaRec = areaRec(base, altura)
print("El area del rectángulo es: %i" % calcAreaRec)