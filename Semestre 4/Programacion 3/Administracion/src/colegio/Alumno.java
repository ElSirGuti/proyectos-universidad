package colegio;

public class Alumno extends Persona{
    
    private double notas[];
    private static int cotAlum=0;
    
    public Alumno(String n, String c, double no[]){
        super(n,c);
        notas=no;
        cotAlum++;
    }
    
    public double calculos(){
        double prom, suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return prom = suma/notas.length;
    }
    
    public void mostrar(){
        System.out.printf("\t%-10s %-10s ",getNom(), getCed());
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%5.2f ",notas[i]);
        }
        System.out.printf("%8.2f\n", calculos());
    }
    
    public static void mostrarTotalAlum(){
        System.out.println("El total de alumnos es: " +cotAlum);
    }  
}
