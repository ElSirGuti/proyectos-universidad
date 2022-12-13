package Prelevos;

public class Tiempo {
    private int seg;
    private int mseg;
    
    public Tiempo(int s, int ms){
        seg = s;
        mseg = ms;
    }
    
    public int toMes(){
        int total = seg * 1000 + mseg;
        return total;
    }

    public int getSeg() {
        return seg;
    }

    public int getMseg() {
        return mseg;
    } 
}
