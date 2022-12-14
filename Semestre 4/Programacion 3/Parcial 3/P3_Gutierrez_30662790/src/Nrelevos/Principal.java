package Nrelevos;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IOException{
        ArrayList<Equipos> listEquip = new ArrayList<>();
        Mostrar.leerTiemp(listEquip);
        Mostrar.totales(listEquip);  
    }
}
