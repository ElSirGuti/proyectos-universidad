package Prelevos;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IOException{
        
        ArrayList<Relevos> re = new ArrayList<Relevos>();
        Apoyo.LeoCompetencia(re);
        Apoyo.mostrar(re);
        Apoyo.calculo(re);
    }
}
