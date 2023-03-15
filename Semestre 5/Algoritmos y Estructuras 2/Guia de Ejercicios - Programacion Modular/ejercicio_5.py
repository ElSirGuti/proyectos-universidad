# Guia de Ejercicios #1
# Algoritmos y Estructuras 2
# Andrés Gutiérrez

# Dado la velocidad de 2 cuerpos que se dirigen uno al
# encuentro de otro determinar el tiempo de encuentro si la
# La distancia que los separa inicialmente es “D”.

def tEncuentro(va, vb, d):
    return d / (va + vb)

va = float(input("Introduce la Velocidad de A: "))
vb = float(input("Introduce la Velocidad de B: "))
d = float(input("Distancia: "))
resultado = tEncuentro(va, vb, d)
print("El tiempo de encuentro es: %i seg" % resultado)