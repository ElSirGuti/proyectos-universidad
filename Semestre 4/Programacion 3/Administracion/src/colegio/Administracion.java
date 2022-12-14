package colegio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Administracion {
    
    public static int cReg() throws IOException {
        Scanner leo = new Scanner(new File("Datos.txt"));
        int reg = 0;
        while (leo.hasNextLine()){
            leo.nextLine();
            reg++;
        }
    leo.close();
    return reg;
    }
    
    public static void leoArchivo(Persona pe[]) throws IOException {
        Scanner leo = new Scanner(new File("Datos.txt"));
        int reg = 0;
        Persona p;
        String n, c, as;
        int es, ch, tipo;
        double no[];
        while(leo.hasNextLine()){
            tipo = leo.nextInt();
            if(tipo == 0){
                n = leo.next();
                c = leo.next();
                as = leo.next();
                ch = leo.nextInt();
                es = leo.nextInt();
                p = new Docente(n, c, as, es, ch);
            } else {
                n = leo.next();
                c = leo.next();
                no = new double[4];
                for (int i = 0; i < no.length; i++) {
                    no[i] = leo.nextInt();                    
                }
                p = new Alumno(n, c, no);
            }
            pe[reg]=p;
            reg++;
        }
        leo.close();
    }
    
    public static void mostrar(Persona pe[]){
        int flag = 0;
        for (int i = 0; i < pe.length; i++) {
            if (pe[i]instanceof Docente){
                flag = 0;
                System.out.println("\nDocente\nNombre      Cedula    Materia     Pago");
                pe[i].mostrar();
            } else {
                if(flag==0){
                    flag=1;
                    System.out.println("\tListado de alumnos");
                    System.out.println("\tNombre     Cedula      _________Notas________   Promedio");
                }
            }pe[i].mostrar();  
        }
    }
}

