package Nrelevos;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Mostrar {
    public static void leerTiemp(ArrayList<Equipos> listEquip) throws IOException{
        Scanner leo = new Scanner(new File("Clasificacion.txt"));
        
        String estado;
        Tiempos[] tiempos;
        Equipos equip;
        while(leo.hasNextLine()){
            estado = leo.next();
            tiempos = new Tiempos[4];
            for (int i = 0; i < tiempos.length; i++) {
                tiempos[i] = new Tiempos(leo.nextInt(), leo.nextInt(), leo.nextInt());
                
            }
            
            equip = new Equipos(estado, tiempos);
            listEquip.add(equip);
        }
    }   
        public static void totales(ArrayList<Equipos> listEquip){
            String primero = "", segundo = "";
            int primeroTiemp = 0, segundoTiemp= 0;
            
            System.out.println("       Resultados");
            System.out.println("Nombre        CS SS MM");
            
            for (int i = 0; i < listEquip.size(); i++) {
                System.out.printf("%-12s %03d:%02d:%02d \n", listEquip.get(i).equip, listEquip.get(i).convertirTotal().getMin(), listEquip.get(i).convertirTotal().getSeg(), listEquip.get(i).convertirTotal().getcSeg());
                
                switch(i){
                    
                    case 0:
                        primeroTiemp = listEquip.get(i).convertirTotal().convertir();
                        primero = listEquip.get(i).equip;
                        break;
                        
                    case 1:
                        if (primeroTiemp > listEquip.get(i).convertirTotal().convertir()) {
                            segundoTiemp = primeroTiemp;
                            segundo = primero;
                            primeroTiemp = listEquip.get(i).convertirTotal().convertir();
                            primero = listEquip.get(i).equip;
                        } else {
                            segundoTiemp = listEquip.get(i).convertirTotal().convertir();
                            segundo = listEquip.get(i).equip;
                        }
                        break;
                        
                    default:
                        if (primeroTiemp > listEquip.get(i).convertirTotal().convertir()) {
                            segundoTiemp = primeroTiemp;
                            segundo = primero;
                            primeroTiemp = listEquip.get(i).convertirTotal().convertir();
                            primero = listEquip.get(i).equip;
                        } else {
                            segundoTiemp = listEquip.get(i).convertirTotal().convertir();
                            segundo = listEquip.get(i).equip;
                        }
                        break;
                    
                }
                
                
            }
            System.out.println("\nEquipos seleccionados: ");
            System.out.println("Primer Equipo: " + primero);
            System.out.println("Segundo Equipo: " + segundo);
        }
        
    }

