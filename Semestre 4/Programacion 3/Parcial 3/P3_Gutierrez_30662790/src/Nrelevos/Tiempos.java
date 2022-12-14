package Nrelevos;

public class Tiempos {
    private int min;
    private int seg;
    private int cSeg;

    public Tiempos(int m, int s, int cs) {
        this.min = m;
        this.seg = s;
        this.cSeg = cs;
    }
    
    public Tiempos(){
    }
    public int convertir(){
        return min*60*1000+seg*1000+cSeg;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public void setcSeg(int cSeg) {
        this.cSeg = cSeg;
    }
    
    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public int getcSeg() {
        return cSeg;
    }
    
}
