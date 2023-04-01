package Nrelevos;

public class Equipos {
    String equip;
    private Tiempos []tiempo;
    private int tTotalCs;
    private String tTotal;

    public Equipos(String equip, Tiempos[] tiempo) {
        this.equip = equip;
        this.tiempo = tiempo;
        calculo();
    }

    public void calculo(){
        for (Tiempos arregloC1 : tiempo) {
            tTotalCs = tTotalCs + arregloC1.convertir();
            
        }
    }
    
    public final Tiempos convertirTotal(){
        Tiempos t = new Tiempos();
        
        t.setMin(tTotalCs % 1000);
        t.setSeg((tTotalCs / 1000)%60);
        t.setcSeg((tTotalCs / 1000)/60);
        
        return t;
    }
}
