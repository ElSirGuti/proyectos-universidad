# Programa realizado por Andrés Gutiérrez 
# Fecha Inicio: 5-06-23
# Fecha Finalizacion: 7-06-23

# from itertools import permutations

def combinacion():
    print("               n!     ")
    print("C(n,r) = --------------")
    print("          (n - r)! r!")
    print("\n")

    bucle = True
    while(bucle == True):
        n = int(input("Introduzca un valor para n: "))
        r = int(input("Introduzca un valor para r: "))

        if 0 <= r and r <= n:
            bucle = False
            nF = factorial(n)
            rF = factorial(r)
            resta = factorial(n-r)

            print("\n")
            print("              "+str(n)+"!     ")
            print("C("+str(n)+","+str(r)+") = -------------")
            print("         "+"("+str(n)+"-"+str(r)+")! "+str(r)+"!")
            print("\n")
            resultado = (nF)//(resta * rF)

            print("El resultado de combinar",r,"de",n,"elementos es:",resultado,"\n")
        else:
            print("R tiene que ser mayor o igual a 0 y N mayor o igual que R (0 <= R <= N).")

    menu()


def permutacion():
    print("Pm = m! \n")
    print("Introduzca una cadena de texto:")
    txt = input()
    length = len(txt)
    print("Pm = "+str(length)+"!")

    resultado = factorial(length)
    # Esto calcula tambien las permutaciones pero brickea la pc si se introduce una cadena muy larga
    # permutaciones = [''.join(p) for p in permutations(txt)]
    # print(permutaciones) # esto imprime todas las combinaciones
    # print(len(permutaciones))

    print("El numero de disposiciones del texto '"+txt+"' es de:",str(resultado) + "\n")

    menu()

def combinacionesR():
    print("              (n + r - 1)!")
    print("C(n+r-1,r) = ---------------")
    print("               r! (n-1)!")
    print("\n")

    n = int(input("Introduzca un valor para n: "))
    r = int(input("Introduzca un valor para r: "))

    op1 = factorial(n+r-1)
    rF = factorial(r)
    op2 = factorial(n-1)

    print("\n")
    print("          ("+str(n)+" + "+str(r)+" - 1)!")
    print("C("+str(n+r-1)+","+str(r)+") = ---------------")
    print("           "+str(r)+"! ("+str(n)+" - 1)!")
    print("\n")

    resultado = op1//(rF*op2)
    print("El resultado de las combinaciones de '"+str(n)+"' objetos tomados de '"+str(r)+"' en '"+str(r)+"' con repeticion es:",str(resultado)+"\n")

    menu()

def monedas():
    print("""Si una moneda se lanza 10 veces. Determine:
    
    a) El numero de resultados que tienen exactamente 3 caras.
    b) El numero de resultados que tienen a lo sumo 3 caras
    c) Si se quieren distribuir 10 monedas identicas entre 5 niños si:
        a) No hay restricciones
        b) Cada niño recibe al menos una moneda
        c) El niño mayor recibe al menos 2 monedas \n""")
    
    print("""Resolución:

    a) El numero de resultados que tienen exactamente 3 caras es el numero de
       combinaciones de 10 elementos tomados de 3 en 3, que se puede calcular como:

                        10!
       C(10,3) = ------------------
                     3! (10-3)!
                    
        C(10,3) = 120
        
    b) El numero de resultados que tienen a lo sumo 3 caras es la suma del numero de
       resultados que tienen 0, 1, 2 y 3 caras. Esto se puede calcular como:
       
       C(10,0) + C(10,1) + C(10,2) + C(10,3)
       = 1 + 10 + 45 + 120
       = 176
       
    c) Si se quieren distribuir 10 monedas idénticas entre 5 niños sin restricciones, 
    el número de formas posibles es el número de combinaciones con repetición de 5 elementos 
    tomados de 10 en 10, que se puede calcular como 
    
    C(5+10-1,10) 

                      14! 
    C(14,10) = ------------------
                   10! (14-10)! 
    
    C(14,10)= 1001 
    
    Si cada niño recibe al menos una moneda, entonces el problema se reduce a distribuir 
    las restantes 10 - 5 = 5 monedas entre los niños sin restricciones. 

    En este caso el número de formas posibles es:
    
    C(5+5-1,5)
    
                     9! 
    C(9,5) = ------------------
                   5! (9-5)! 

    C(9,5) = 126
    
    Si el niño mayor recibe exactamente dos monedas, entonces el problema se reduce a 
    distribuir las restantes 10 - 2 = 8 monedas entre los otros 5 - 1 = 4 niños sin 
    restricciones. En este caso el número de formas posibles es: 
    
    C(4+8-1,8)

                      11! 
    C(11,8) = ------------------
                   8! (11-8)! 
    
    C(11,8) = 165 \n""")
    
    menu()

def factorial(n):
    if n == 0 or n == 1:
        resultado = 1
    elif n > 1:
        resultado = n*factorial(n-1)
    return resultado

def menu():
    print("===========================================================================")
    print("==========Bienvenido al proyecto final de Estructuras Discretas 1==========")
    print("========================Indique que quiere realizar========================")
    print("===========================================================================")
    print("1. Combinaciones r de n elementos")
    print("2. Hallar el numero de disposiciones de las letras en una cadena de texto")
    print("3. Calcular las combinaciones de n objetos tomados de r en r con repetición")
    print("4. Ejercicio de las monedas")
    print("5. Salir")
    print("===========================================================================")

    bucle = True
    while(bucle == True):
        try:
            res = int(input())
            print("\n")

            if res == 1:
                bucle = False
                combinacion()
            if res == 2:
                bucle = False
                permutacion()
            if res == 3:
                combinacionesR()
                bucle = False
            if res == 4:
                bucle = False
                monedas()
            if res == 5:
                bucle = False
                quit()
            else:
                print("Introduzca un numero del 1 al 5")
                bucle = True
        except Exception as error:
            print("\nHa ocurrido un error. Introduzca un comando válido. Error:",error,"\n")
            bucle = True    
            print("===========================================================================")
            print("==========Bienvenido al proyecto final de Estructuras Discretas 1==========")
            print("========================Indique que quiere realizar========================")
            print("===========================================================================")
            print("1. Combinaciones r de n elementos")
            print("2. Hallar el numero de disposiciones de las letras en una cadena de texto")
            print("3. Calcular las combinaciones de n objetos tomados de r en r con repetición")
            print("4. Ejercicio de las monedas")
            print("5. Salir")
            print("===========================================================================")

    


menu()