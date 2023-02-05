package Trabajo;

public class metodos {
    public static int[][] generarMatriz(int n){
        // Creamos la matriz
        int[][] matriz = new int[n][n];
        // Bucle para generar la matriz de forma aleatoria
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // Condicion para poner numeros positivos y negativos
                if(Math.random() >= 0.5){
                    int numero = (int) (Math.random() * 1000) + 1;
                    matriz[i][j] = numero;
                } else {
                    int numero = (int) -(Math.random() * 1000)+ 1;
                    matriz[i][j] = numero;
                }
            } 
        }
        return matriz;
    } // Fin del metodo generarMatriz
    
    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        } else {
            return fibonacci(num/10) + num%10;
            
        }
    } // Fin del metodo fibonacci
    
    public static String sumaElementos(int n,int m){
        String nString, mString;
        nString = String.valueOf(n);
        mString = String.valueOf(m);
        return mString + nString;
    } // Fin del metodo sumaElementos
    
    public static int cantidadPrimo(int n){
        if(n/2 < 2){
        return 1;
        } else {
            if(n % 2 == 0){
                return 0;
            } else {
                return 1;
            }
        }
    } // Fin del metodo cantidadPrimo

}