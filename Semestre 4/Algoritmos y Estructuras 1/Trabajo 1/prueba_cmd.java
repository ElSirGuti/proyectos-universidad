// Primera evaluación 
// Trabajo realizado por Andrés Gutiérrez
// Sección 204C2
// Esto es lo mismo que el otro proyecto con interfaz solo que aqui me asegure que los metodos funcionaran correctamente :)

/*
 * Elementos ordenados de mayor a menor mostrados en forma de array
 * Multiplicacion de los elementos de la diagonal principal
 * Extraer el elemento de menor valor positivo y evaluar si es un numero primo utiizando dentro del algoritmo datos de tipo booleanos
 * Division del elemento de mayor valor entre el numero de menor valor
 * Potencia del elemento mayor elevado a la 10
 */

import java.util.*;
import java.math.BigInteger;

public class prueba_cmd {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        // Dimension de la matriz (n x n)
        int n = 0;

        // Bucle para que si o si el usuario introduzca un numero entre 1 y 9
        do{
            do{
                System.out.println("Ingrese un numero entre el 1 y el 9");
                n = entrada.nextInt();
            }while(n < 1);   
        }while(n > 9);

        // Declaracion de variables
        int matriz[][] = new int[n][n];
        int diagPrincipal[] = new int [matriz.length];
        
        // Parametro para que la matriz se llene de forma aleatoria
        System.out.println("Matriz:");
        for (int x = 0; x < matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                matriz[x][y] = (int) (Math.random() * 2000) - 1000;
                System.out.print("\t" + matriz[x][y]);
            }
            System.out.println(" ");
        }
        System.out.println("");

        //Llamada a los demas metodos
        //Ordenar la matriz
        ordenar(matriz);
        //Obtener la diagonal principal
        obtenerDiag(matriz, diagPrincipal);
        //Multiplicar los elementos de la diagonal principal
        multiplicarDiagP(diagPrincipal);
        //Obetener el valor menor positivo
        //valorMenorP(matriz);
        //Obtener el valor mayor y el valor menor, dividir ambos y elevar el valor mayor al 10
        valoresMa_y_Me(matriz);
        
    } // Fin del metodo Main

    public static void ordenar(int matriz[][]){
        // Bucles para ordenar la matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                for(int x = 0; x < matriz.length; x++){
                    for(int y = 0; y < matriz.length; y++){
                        if(matriz[i][j] > matriz[x][y]){
                            int temp = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = temp;
                        }
                    }
                }
            }
        }
        // Imprimir la matriz en forma de vector
        List<Integer> vector = new ArrayList<>();
        for (int row = 0; row < matriz.length; row++) {
	        for (int col = 0; col < matriz[row].length; col++)
	        vector.add(matriz[row][col]);
        } System.out.println("La matriz ordenada de mayor a menor en forma de array:");
          System.out.println(vector);
    }// Fin del metodo ordenar
        
    public static void obtenerDiag(int matriz[][], int diagPrincipal[]){
        // Bucles para obtener la diagonal
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagPrincipal[i] = matriz[i][j];
                }
            }
        }
    } //Fin del metodo obtenerDiag

    public static void multiplicarDiagP(int diagPrincipal[]){
        // Variable que maneja el resultado de la multiplicacion
        int total = 1;
        // Variable para realizar la multiplicacion
        for (int i = 0; i < diagPrincipal.length; i++){
            if(diagPrincipal[i] != 0){
                total = (diagPrincipal[i]*total);
            }
        }
        System.out.println("El resultado de multiplicar los elementos de la diagonal principal es: " + total);
    }// Fin del metodo multiplicarDiagP

    public static void valorMenorP(int matriz[][]){
       
        System.out.println("El numero menor positivo es: " + valorMenorPositivo);
        
    } // Fin del metodo numeroMenorP

    public static void valoresMa_y_Me(int matriz[][]){
        //Iniciando variables
        int numeroMayor = matriz[0][0];
        int numeroMenor = matriz[0][0];

        //Variables de la potencia
        int exponente = 10;
        BigInteger p;
        p = BigInteger.valueOf(numeroMayor);
        //Parametro para realizar la potencia (p: Numero Mayor, exponente: exponente)
        BigInteger potencia = p.pow(exponente);

        // Parametro para hallar el valor mayor y menor
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
              if (matriz[x][y] < numeroMenor) {
                numeroMenor = matriz[x][y];
              }
              if (matriz[x][y] > numeroMayor) {
                numeroMayor = matriz[x][y];
              }
            }                
        } System.out.println("El numero menor es: " + numeroMenor);
        System.out.println("El numero mayor es: " + numeroMayor);

        //Parametro para imprimir el resultado de la division
        //Variables de la division
        float numerador = numeroMayor;
        float denominador = numeroMenor;
        float resultadoDiv = numerador / denominador;
        //Impresion de la division
        System.out.println("El resultado de dividir el numero mayor " + numerador + " entre el menor "+ denominador + " es: " + resultadoDiv);

        // Parametro para imprimir el resultado de la potencia 
        System.out.println("El resultado de elevar el mayor numero " + numeroMayor + " a la 10 es: " + potencia);
    } //Fin del metodo valoresMa_y_Me
} // Fin clase prueba_cmd