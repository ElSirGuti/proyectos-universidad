# Realizar una calculadora de operaciones con conjuntos
# Hecho por Andrés Gutiérrez

import random
################################################################################################################################################
conjunto_u = []
subconjunto_1 = []
subconjunto_2 = []
subconjunto_3 = []
subconjunto_4 = []
subconjunto_5 = []
################################################################################################################################################
def main(): #se define la funcion main
    programa = True 
    while programa == True: #Bucle para mantener el programa funcionando hasta que se indique lo contrario
        print("=====Programa para trabajar con conjuntos=====")
        otrobuclemas = 0
        while(otrobuclemas == 0): # Bucle para crear el conjunto universal  
            try:
                long_cu = int(input("Introduzca la longitud del conjunto universal: "))
                if long_cu >= 2:
                    otrobuclemas += 1
                if long_cu < 1:
                    print("Introduzca un numero mayor o igual que 2")
            except Exception as error:
                print("Ha ocurrido un error intente de nuevo: " + str(error))
        contador = 1

        if long_cu > 0:
            yanomasbuclesxfa = True
            while(yanomasbuclesxfa == True): # Bucle para rellenar el conjunto universal
                print("Desea llenarlo de forma aleatoria o manual?")
                comando = input("Escriba 'a' para rellenar de forma aleatoria \nEscriba 'm' para rellenarlo de forma manual \n")
                try:
                    if comando == "a":
                        while(contador <= long_cu): # Bucle para rellenar el conjunto universal y que no se exceda del largo introducido por el usuario
                            num = int
                            if num not in conjunto_u: # Rellena el conjunto universal si num no esta en el conjunto universal
                                num = conjunto_u.append(random.randint(-999, 999))
                                contador += 1
                                yanomasbuclesxfa = False
                        print("El conjunto universal es: " + str(conjunto_u))
                    if comando == "m":
                        while(contador <= long_cu): # Dirigirse a la linea 31
                            try:
                                num = int(input("Introduzca un numero: "))
                                if num not in conjunto_u: # Dirigirse a la linea 33
                                    conjunto_u.append(num)
                                    contador +=1
                                    yanomasbuclesxfa = False
                                else:
                                    print("El numero esta repetido intente con otro")
                            except Exception as error:
                                print("Ha ocurrido un error intente de nuevo " + str(error))
                        print("El conjunto universal es: " + str(conjunto_u))
                    try:
                        pass
                    except Exception as error:
                        print("Ha ocurrido un error intente de nuevo " + str(error))
                    contador = 1
                except Exception as error:
                    print("Ha ocurrido un error intente de nuevo " + str(error))
        elif long_cu <= 0:
            print("Introduzca un numero mayor que 0 xfa")
################################################################################################################################################
        kaguya = 0
        while(kaguya == 0):
            try:    
                cant_sc = int(input("Introduzca la cantidad de subconjuntos (entre 2 y 5): "))
                if cant_sc > 1:
                    kaguya += 1
                    try:
                        if cant_sc >= 2 and cant_sc <= 5: #Para poder realizar operaciones se necesitan al menos 2 conjuntos
################################################################################################################################################                            
                            if 1 <= cant_sc: # Primer subconjunto
                                bucle1 = True
                                while (bucle1 == True):
                                    try:
                                        sub_1_long = int(input("Introduzca la longitud del subconjunto: "))
                                    except Exception as error:
                                        print("Ha ocurrido un error intente de nuevo " + str(error))
                                    if sub_1_long <= long_cu: # Condicion para que el largo del subconjunto sea menor o igual al conjunto universal
                                        print("Desea llenar el subconjunto de forma aleatoria o manual?")
                                        comando = input("Escriba 'a' para rellenar de forma aleatoria \nEscriba 'm' para rellenarlo de forma manual \n")
                                        try:  
                                            if comando == "a": # la funcion random intentara de forma infinita encontrar un numero que este en el conjunto universal hasta que el programa colapse D:
                                                while(contador <= sub_1_long):
                                                    num = 0
                                                    num = subconjunto_1.append(random.randint(1, 999))
                                                    if num not in subconjunto_1 and num in conjunto_u:
                                                        contador += 1
                                                    else:
                                                        print("El numero no esta en el conjunto universal",num)
                                                print("El subconjunto 1 es: " + str(subconjunto_1))
                                            if comando == "m":
                                                while(contador <= sub_1_long ):
                                                    num = int(input("Introduzca un numero: "))
                                                    if num not in subconjunto_1 and num in conjunto_u: # Si num no esta en el subconjunto y esta en el conjunto universal se añade al subconjunto
                                                        subconjunto_1.append(num)
                                                        contador +=1
                                                    else:
                                                        print("El numero esta repetido o no esta en el conjunto universal intente con otro")
                                                print("El subconjunto 1 es: " + str(subconjunto_1))
                                                contador = 1
                                        except Exception as error:
                                            print("Ha ocurrido un error intente de nuevo " + str(error))
                                        bucle1 = False
                                    else:
                                        print("Introduzca un largo menor que el conjunto universal")
################################################################################################################################################
                        if 2 <= cant_sc:
                            try: 
                                sub_2_long = int(input("Introduzca la longitud del subconjunto: "))
                                print("Desea llenar el subconjunto de forma aleatoria o manual?")
                                comando = input("Escriba 'a' para rellenar de forma aleatoria \nEscriba 'm' para rellenarlo de forma manual \n") 
                                if comando == "a":
                                    while(contador <= sub_2_long):
                                        num = subconjunto_2.append(random.randint(1, 999))
                                        if num in conjunto_u:
                                            contador += 1
                                        else:
                                            pass
                                    print("El subconjunto 2 es: " + str(subconjunto_2))
                                if comando == "m":
                                    while(contador <= sub_2_long ):
                                        num = int(input("Introduzca un numero: "))
                                        if num not in subconjunto_2 and num in conjunto_u:
                                            subconjunto_2.append(num)
                                            contador +=1
                                        else:
                                            print("El numero esta repetido o no esta en el conjunto universal intente con otro")
                                    print("El subconjunto 2 es: " + str(subconjunto_2))
                                    contador = 1
                            except Exception as error:
                                print("Ha ocurrido un error intente de nuevo " + str(error))
                    except Exception as error:
                        print("Ha ocurrido un error intente de nuevo " + str(error))
################################################################################################################################################
                        if 3 <= cant_sc:
                            sub_3_long = int(input("Introduzca la longitud del subconjunto: "))
                            print("Desea llenar el subconjunto de forma aleatoria o manual?")
                            comando = input("Escriba 'a' para rellenar de forma aleatoria \nEscriba 'm' para rellenarlo de forma manual \n")
                            try:  
                                if comando == "a":
                                    while(contador <= sub_3_long):
                                        num = subconjunto_3.append(random.randint(1, 999))
                                        if num in conjunto_u:
                                            contador += 1
                                        else:
                                            pass
                                    print("El subconjunto 3 es: " + str(subconjunto_3))
                                if comando == "m":
                                    while(contador <= sub_3_long ):
                                        num = int(input("Introduzca un numero: "))
                                        if num not in subconjunto_3 and num in conjunto_u:
                                            subconjunto_3.append(num)
                                            contador +=1
                                        else:
                                            print("El numero esta repetido o no esta en el conjunto universal intente con otro")
                                    print("El subconjunto 3 es: " + str(subconjunto_3))
                                    contador = 1
                            except Exception as error:
                                print("Ha ocurrido un error intente de nuevo")
################################################################################################################################################
                        if 4 <= cant_sc:
                            sub_4_long = int(input("Introduzca la longitud del subconjunto: "))
                            print("Desea llenar el subconjunto de forma aleatoria o manual?")
                            comando = input("Escriba 'a' para rellenar de forma aleatoria \nEscriba 'm' para rellenarlo de forma manual \n")
                            try:  
                                if comando == "a":
                                    while(contador <= sub_4_long):
                                        num = subconjunto_4.append(random.randint(1, 999))
                                        if num in conjunto_u:
                                            contador += 1
                                        else:
                                            pass
                                    print("El subconjunto 4 es: " + str(subconjunto_4))
                                if comando == "m":
                                    while(contador <= sub_4_long ):
                                        num = int(input("Introduzca un numero: "))
                                        if num not in subconjunto_4 and num in conjunto_u:
                                            subconjunto_4.append(num)
                                            contador +=1
                                        else:
                                            print("El numero esta repetido o no esta en el conjunto universal intente con otro")
                                    print("El subconjunto 4 es: " + str(subconjunto_4))
                                    contador = 1
                            except Exception as error:
                                print("Ha ocurrido un error intente de nuevo")
################################################################################################################################################
                        if 5 <= cant_sc:
                            sub_5_long = int(input("Introduzca la longitud del subconjunto: "))
                            print("Desea llenar el subconjunto de forma aleatoria o manual?")
                            comando = input("Escriba 'a' para rellenar de forma aleatoria \nEscriba 'm' para rellenarlo de forma manual \n")
                            try:  
                                if comando == "a":
                                    while(contador <= sub_5_long):
                                        num = subconjunto_5.append(random.randint(1, 999))
                                        if num in conjunto_u:
                                            contador += 1
                                        else:
                                            pass
                                    print("El subconjunto 5 es: " + str(subconjunto_5))
                                if comando == "m":
                                    while(contador <= sub_5_long ):
                                        num = int(input("Introduzca un numero: "))
                                        if num not in subconjunto_5 and num in conjunto_u:
                                            subconjunto_5.append(num)
                                            contador +=1
                                        else:
                                            print("El numero esta repetido o no esta en el conjunto universal intente con otro")
                                    print("El subconjunto 5 es: " + str(subconjunto_5))
                                    contador = 1
                            except Exception as error:
                                print("Ha ocurrido un error intente de nuevo " + str(error))
################################################################################################################################################
            except Exception as error:
                print("Ha ocurrido un error intente de nuevo " + str(error))    
################################################################################################################################################
        sc1 = set(subconjunto_1)
        sc2 = set(subconjunto_2)
        sc3 = set(subconjunto_3)
        sc4 = set(subconjunto_4)
        sc5 = set(subconjunto_5)
        cu = set(conjunto_u)
################################################################################################################################################
        operaciones = True
        while(operaciones == True):
            print("Operaciones disponibles")
            print("1: Adicion")
            print("2: Interseccion")
            print("3: Diferencia")
            print("4: Complemento")
            hayasaka = 0
            while(hayasaka == 0):
                try:
                    op = int(input(""))
                    try:
                        hayasaka += 1
                        if op == 1:   
                            adicion(sc1, sc2, sc3, sc4, sc5)
                        if op == 2:
                            interseccion(sc1, sc2, sc3, sc4, sc5)
                        if op == 3:
                            diferencia(sc1, sc2, sc3, sc4, sc5)
                        if op == 4:
                            complemento(sc1, sc2, sc3, sc4, sc5, cu)
                    except Exception as error:
                        print("Ha ocurrido un error intente de nuevo " + str(error))
                    print("Desea hacer otra operacion? (s/n)")
                    respuesta = input("")
                    try:
                        if respuesta == "s":
                            continue
                        if respuesta == "n":
                            operaciones = False
                    except Exception as error:
                        print("Ha ocurrido un error intente de nuevo " + str(error))
                except Exception as error:
                    print("Ha ocurrido un error intente de nuevo " + str(error))
################################################################################################################################################
        conjunto_u.clear()
        subconjunto_1.clear()
        subconjunto_2.clear()
        subconjunto_3.clear()
        subconjunto_4.clear()
        subconjunto_5.clear()
################################################################################################################################################
        pregunta = True
        while pregunta == True:
            print("Desea seguir con el programa? (s/n)")
            respuesta = input("")
            try:
                if respuesta == "s":
                    pregunta = False
                if respuesta == "n":
                    pregunta = False
                    programa = False
            except Exception as error:
                print("Ha ocurrido un error intente de nuevo " + str(error))
################################################################################################################################################            
def adicion(sc1, sc2, sc3, sc4, sc5):             
    print("Seleccione el primer subconjunto:")
    print("A => Subconjunto 1:",sc1)
    print("B => Subconjunto 2:",sc2)
    print("C => Subconjunto 3:",sc3)
    print("D => Subconjunto 4:",sc4)
    print("E => Subconjunto 5:",sc5)
    p1 = input("")
    
    if p1 == "A":
        conj_1 = sc1
    if p1 == "B":
        conj_1 = sc2
    if p1 == "C":
        conj_1 = sc3
    if p1 == "D":
        conj_1 = sc4    
    if p1 == "E":
        conj_1 = sc5

    print("Seleccione el segundo subconjunto:")
    print("A => Subconjunto 1:",sc1)
    print("B => Subconjunto 2:",sc2)
    print("C => Subconjunto 3:",sc3)
    print("D => Subconjunto 4:",sc4)
    print("E => Subconjunto 5:",sc5)
    p2 = input("")
    
    if p2 == "A":
        conj_2 = sc1
    if p2 == "B":
        conj_2 = sc2
    if p2 == "C":
        conj_2 = sc3
    if p2 == "D":
        conj_2 = sc4    
    if p2 == "E":
        conj_2 = sc5

    adicion = conj_1 | conj_2

    print("El resultado de la adicion es",adicion)
################################################################################################################################################
def interseccion(sc1, sc2, sc3, sc4, sc5):
    print("Seleccione el primer subconjunto:")
    print("A => Subconjunto 1:",sc1)
    print("B => Subconjunto 2:",sc2)
    print("C => Subconjunto 3:",sc3)
    print("D => Subconjunto 4:",sc4)
    print("E => Subconjunto 5:",sc5)
    p1 = input("")
        
    if p1 == "A":
        conj_1 = sc1
    if p1 == "B":
          conj_1 = sc2
    if p1 == "C":
        conj_1 = sc3
    if p1 == "D":
        conj_1 = sc4    
    if p1 == "E":
        conj_1 = sc5

    print("Seleccione el segundo subconjunto:")
    print("A => Subconjunto 1:",sc1)
    print("B => Subconjunto 2:",sc2)
    print("C => Subconjunto 3:",sc3)
    print("D => Subconjunto 4:",sc4)
    print("E => Subconjunto 5:",sc5)
    p2 = input("")
        
    if p2 == "A":
        conj_2 = sc1
    if p2 == "B":
        conj_2 = sc2
    if p2 == "C":
        conj_2 = sc3
    if p2 == "D":
        conj_2 = sc4    
    if p2 == "E":
        conj_2 = sc5

    interseccion = conj_1 & conj_2

    print("El resultado de la interseccion es",interseccion)
################################################################################################################################################
def diferencia(sc1, sc2, sc3, sc4, sc5):
    print("Seleccione el primer subconjunto:")
    print("A => Subconjunto 1:",sc1)
    print("B => Subconjunto 2:",sc2)
    print("C => Subconjunto 3:",sc3)
    print("D => Subconjunto 4:",sc4)
    print("E => Subconjunto 5:",sc5)
    p1 = input("")
        
    if p1 == "A":
        conj_1 = sc1
    if p1 == "B":
          conj_1 = sc2
    if p1 == "C":
        conj_1 = sc3
    if p1 == "D":
        conj_1 = sc4    
    if p1 == "E":
        conj_1 = sc5

    print("Seleccione el segundo subconjunto:")
    print("A => Subconjunto 1:",sc1)
    print("B => Subconjunto 2:",sc2)
    print("C => Subconjunto 3:",sc3)
    print("D => Subconjunto 4:",sc4)
    print("E => Subconjunto 5:",sc5)
    p2 = input("")
        
    if p2 == "A":
        conj_2 = sc1
    if p2 == "B":
        conj_2 = sc2
    if p2 == "C":
        conj_2 = sc3
    if p2 == "D":
        conj_2 = sc4    
    if p2 == "E":
        conj_2 = sc5

    diferencia = conj_1 - conj_2

    print("El resultado de la diferencia es",diferencia)
################################################################################################################################################
def complemento(sc1, sc2, sc3, sc4, sc5, cu):
    print("Seleccione el subconjunto:")
    print("A => Subconjunto 1:",sc1)
    print("B => Subconjunto 2:",sc2)
    print("C => Subconjunto 3:",sc3)
    print("D => Subconjunto 4:",sc4)
    print("E => Subconjunto 5:",sc5)
    print("El conjunto universal es:", cu)
    p1 = input("")
        
    if p1 == "A":
        conj_1 = sc1
        conj_2 = cu
        complemento = conj_2 - conj_1
    if p1 == "B":
        conj_1 = sc2
        conj_2 = cu
        complemento = conj_2 - conj_1
    if p1 == "C":
        conj_1 = sc3
        conj_2 = cu
        complemento = conj_2 - conj_1
    if p1 == "D":
        conj_1 = sc4   
        conj_2 = cu
        complemento = conj_2 - conj_1 
    if p1 == "E":
        conj_1 = sc5
        conj_2 = cu
        complemento = conj_2 - conj_1

    print("El resultado del complemento es",complemento)
################################################################################################################################################
main()
