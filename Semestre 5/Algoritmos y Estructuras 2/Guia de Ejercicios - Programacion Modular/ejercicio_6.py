# Guia de Ejercicios #1
# Algoritmos y Estructuras 2
# Andrés Gutiérrez

# Programar una función que retorne el menor de los números 5, 4, 3, 20, 15

def nMenor(a, b, c, d, e):

    if a < b and a < c and a < d and a < e:
        return a
    if b < a and b < c and b < d and b < e:
        return b
    if c < a and c < b and c < d and c < e:
        return c
    if d < a and d < b and d < c and d < e:
        return d
    if e < a and e < b and e < c and e < d:
        return e

a = float(input("A: "))
b = float(input("B: "))
c = float(input("C: "))
d = float(input("D: "))
e = float(input("E: "))
resultado = nMenor(a, b, c, d, e)
print("El numero menor es: %i" % resultado)