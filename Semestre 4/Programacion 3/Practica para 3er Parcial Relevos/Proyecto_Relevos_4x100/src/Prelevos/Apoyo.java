package Prelevos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Apoyo {
    public static void LeoCompetencia(ArrayList<Relevos> ar) throws IOException{
        Scanner leo = new Scanner(new File("Competencia.txt"));
        Relevos re;
        String n; int s, ms;
        while(leo.hasNext()){
            n = leo.next();
            Tiempo ti[] = new Tiempo[4];
            for (int i = 0; i < ti.length; i++) {
                s = leo.nextInt();
                ms = leo.nextInt();
                ti[i] = new Tiempo(s, ms);
            }
            re = new Relevos(n, ti);
            ar.add(re);
        }
        leo.close();
    }
    
    public static void mostrar(ArrayList<Relevos> ar){
        System.out.println("Equipo        T1       T2       T3       T4       TT  ");
        System.out.println("--------    -------  -------  -------  -------  -------");
        for (int i = 0; i < ar.size(); i++) {
            ar.get(i).mostrar();
            
        }
    }
    
    public static void calculo(ArrayList<Relevos> ar){
        int band = 0, max = 0;
        String eq = "";
        for (int i = 0; i < ar.size(); i++) {
            if (band == 0) {
                band = 1;
                eq = ar.get(i).getEquipo();
                max = ar.get(i).getTotalMseg();
            } else if(max > ar.get(i).getTotalMseg()){
                eq = ar.get(i).getEquipo();
                max = ar.get(i).getTotalMseg();
            }
            
        }
        System.out.println("Equipo ganador: " + eq);
    }
}
