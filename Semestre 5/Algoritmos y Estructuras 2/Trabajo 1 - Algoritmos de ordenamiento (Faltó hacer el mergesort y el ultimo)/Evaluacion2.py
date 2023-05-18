from random import randint
import csv
import sys
import datetime
import os
import heapq

#Primero definimos nuestras variables globales
productos = []
Item = []

nombre_archivo = 'Items.csv'

# Comprobamos que el archivo CSV existe para evitar sobreescribirlo y se pierdan los datos de sesiones anteriores
if os.path.exists(nombre_archivo):
    print(f'El archivo {nombre_archivo} ya existe')
else: # Si no existe se crea uno
    with open(nombre_archivo, 'w') as f:
        archivo = open("Items.csv", "w")
    print(f'El archivo {nombre_archivo} ha sido creado')

# Agregamos los encabezados al CSV
def encabezados():
    encabezados = ["SKU", "Nombre", "Descripcion", "Categoria", "Precio", "Cantidad", "Peso", "Dimensiones", "Fecha de creacion", "Fecha de modificacion"]
    with open("Items.csv", "a+", newline="") as archivo_csv:
        archivo_csv.seek(0)
        if archivo_csv.read() == '':
            # Creamos el objeto writer
            writer = csv.writer(archivo_csv)
            # Escribimos los encabezados en el archivo CSV
            writer.writerow(encabezados)
encabezados()

# Aqui agregamos las demas filas que ya estaban en el CSV
with open('Items.csv', 'r') as f:
    reader = csv.reader(f)
    next(reader) # Se salta la fila de los encabezados
    for row in reader:
        productos.append(row)

#Empezamos con el modulo de seleccion de acciones preguntandole al usuario que accion desea realizar
def accion():
    print("\n")
    print("Que desea hacer?")
    print("")
    print("Crear item: 1")
    print("Modificar lista: 2")
    print("Consultar Lista: 3")
    print("Listar productos: 4")
    print("Salir: 5")
    ac = Vint()
    if ac == 1:
        crear()
    elif ac == 2:
        modificar()
    elif ac == 3:
        consulta()
    elif ac == 4:
        listar()
    elif ac == 5:
        sys.exit()
    else:
        print("Porfavor introduzca un valor valido")
        print("\n")

#En el modulo de creacion ingresaremos todos los valores que necesitamos para el item
def crear():
    #El codigo interno del item en el sistema
    c = randint(0, 1000)
    sku = c 
    print("\n")
    nombre = input("Ingrese el nombre del producto: ")
    desc = input("Descripcion del producto: ")
    categoria = input("Categoria del producto: ")


    #valores numericos
    print("Ingrese el precio del producto")
    precio = Vfloat()
    print("Indique la cantidad")
    cantidad = Vint()
    print("Indique el peso")
    peso = Vint()
    

    #dimensiones
    print("Escriba el alto del producto en centimetros")
    alto = Vfloat()
    print("Escriba el ancho del producto en centimetros")
    ancho = Vfloat()
    
    dimensiones = (str(alto) + "x" + str(ancho))

    #fecha
    fecha = datetime.datetime.now()
    fCreacion = datetime.datetime.strftime(fecha, '%Y-%m-%d')
    fUpdate = datetime.datetime.strftime(fecha, '%Y-%m-%d')

    productos.append([sku, nombre, desc, categoria, precio, cantidad, peso, dimensiones, fCreacion, fUpdate])
    Item.append([sku, nombre, desc, categoria, precio, cantidad, peso, dimensiones, fCreacion, fUpdate])
    print("\n")
    
    
    with open('Items.csv', 'a', newline='') as file:
        writer = csv.writer(file, delimiter=";")
        writer.writerow(Item)
        file.close

    Item.clear()
    
        
    accion()

#En el modulo de modificacion, consultaremos un item de la lista por nombre o codigo
def modificar():
    print("\n")
    print("Ingrese el codigo del producto a modificar")
    print("Si no lo sabe puede consultar la lista para buscarlo")

    con = 0
    while con == 0:
        print("Escriba 1 para modificar, 2 para ver la lista de codigos y nombres, 3 para volver al inicio")
        opcion = int(input())
        print("\n")
        
        if opcion == 1:
            mod()                        
            con += 1
        elif opcion == 2:
            i = 1
            for i in range(len(productos)):
                
                print(productos[i][0]+ " " +productos[i][1] + "]")
            print("\n")
            con = 0
        elif opcion == 3:
            con = 1
            accion()
    accion()

#Ahora si el modulo de modificacion de verdad, no lo escribi arriba porque se veria muy desordenado 
def mod():
    print("Escriba el codigo del producto que quiere modificar")
    codigo = input()
    codigo = "[" + codigo

    for x in range(len(productos)):
        cod = productos[x][0]
        if cod == codigo:
            print("Modificar precio (s/n)?")
            c = input()
            if c == "S" or c == "s":
                print("Introduzca el nuevo precio")
                p = Vint()
                productos[x][4] = p
            elif c == "N" or c == "n":
                pass
            print("Modificar descripcion (s/n)?")
            c = input()
            if c == "S" or c == "s":
                print("Introduzca la nueva descripcion")
                d = input()
                productos[x][2] = p
                

                accion()
            elif c == "N" or c == "n":

                
                accion()
                
    print("Ese codigo no existe")  
    accion()
    

#En el modulo de consulta, simplemente desplegaremos todos los items guardados en la lista
def consulta():
    print("\n")
    i = 1

        
    with open("Items.csv", "r") as file:
        reader = csv.reader(file)
        for line in reader:
            print(line[0]+ " " +line[1] + " " +line[2]+ " " +line[3]+ " " +line[4]+ " " +line[5]+ " " +line[6]+ " " +line[7]+ " " +line[8]+ " " +line[9])
    
    accion()

#En el modulo de listar, ordenaremos los archivos segun quiera el usuario
def listar():
    print("""Elija una opcion para listar los productos:\n
    1. Segun su cantidad de forma ascendente
    2. Segun su peso en un rango de fecha de actualizacion introducido de forma descendente
    3. Segun su fecha de creacion
    4. Segun su cantidad de forma ascendente (heapsort)
    5. Segun sus dimensiones y antiguedad en un rango de fechas""")
    ac = int(input())

    if ac == 1:
        n = len(productos)
        quickSort(productos, 0, n-1)

        print("\nLos productos ordenados segun su cantidad:")
        for row in productos:
            print(' '.join([str(elem) for elem in row]))
    elif ac == 2:
        pass
    elif ac == 3:
        print("Escriba A para ordenar de forma ascendente \n Escriba D para ordenar de forma descendente")
        res = input(str())
        if res == "A" or res == "a":
            shellSort_a(productos)

            print("\nLos productos ordenados segun su fecha ascendente:")
            for row in productos:
                print(' '.join([str(elem) for elem in row]))
        elif res == "D" or res == "d":
            shellSort_d(productos)

            print("\nLos productos ordenados segun su fecha descendente:")
            for row in productos:
                print(' '.join([str(elem) for elem in row]))            
    elif ac == 4:
        productos_ordenados = heapSort(productos)
        print("\nLos productos ordenados segun su cantidad:")
        for row in productos_ordenados:
            print(' '.join([str(elem) for elem in row]))
    elif ac == 5:
        pass
    else:
        print("Porfavor introduzca un valor valido")
        print("\n")
    accion()

#============================================================================================
#===================================Apartado del quicksort===================================
#============================================================================================

def partition(arr, low, high):
    i = (low - 1)
    pivot = arr[high][5] # usando 'cantidad' como pivote

    for j in range(low, high):
        if arr[j][5] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i+1], arr[high] = arr[high], arr[i+1]
    return(i+1)

def quickSort(arr, low, high):
    if len(arr) == 1:
        return arr
    if low < high:
        pi = partition(arr, low, high)
        quickSort(arr, low, pi-1)
        quickSort(arr, pi+1, high)

#============================================================================================
#===================================Apartado del mergesort===================================
#============================================================================================


#============================================================================================
#===================================Apartado del shellsort===================================
#=========================================Ascendente=========================================
#============================================================================================

def shellSort_a(arr):
    n = len(arr)
    gap = n // 2
    while gap > 0:
        for i in range(gap, n):
            temp = arr[i]
            j = i
            while j >= gap and arr[j - gap][9] > temp[9]:
                arr[j] = arr[j - gap]
                j -= gap
            arr[j] = temp
        gap //= 2

#============================================================================================
#===================================Apartado del shellsort===================================
#========================================Descendente=========================================
#============================================================================================

def shellSort_d(arr):
    n = len(arr)
    gap = n // 2
    while gap > 0:
        for i in range(gap, n):
            temp = arr[i]
            j = i
            while j >= gap and arr[j - gap][9] < temp[9]:
                arr[j] = arr[j - gap]
                j -= gap
            arr[j] = temp
        gap //= 2

#============================================================================================
#===================================Apartado del heapsort====================================
#============================================================================================

def heapSort(arr):
    # Extraemos el quinto elemento que es 'cantidad'
    col = [row[5] for row in arr]
    # Crea un heap mínimo a partir de la columna
    heapq.heapify(col)
    # Se ordena la columna usando heapsort
    sorted_col = [heapq.heappop(col) for _ in range(len(col))]
    # Update the 5th column of the 2D array with the sorted values
    for i, row in enumerate(arr):
        row[5] = sorted_col[i]
    return arr


#===================================Apartado del ultimo xd===================================
#============================================================================================


#============================================================================================
##======================================Validaciones=========================================
#============================================================================================


def Vint():
    while True:
        try:
            c = int(input("Ingrese el valor: "))
            print("")
            return c
        except ValueError:
            print("Porfavor ingrese un numero valido (entero) \n")
            continue
        else:
            return c
            break

def Vfloat():
    while True:
        try:
            c = float(input("Ingrese el valor: "))
            print("")
            return c
        except ValueError:
            print("Porfavor ingrese un numero valido (decimal o entero) \n")
            continue
        else:
            return c
            break
        
    

    
#Una vez realizado todo, empezamos el programa corriendo el modulo de accion
accion()
    

