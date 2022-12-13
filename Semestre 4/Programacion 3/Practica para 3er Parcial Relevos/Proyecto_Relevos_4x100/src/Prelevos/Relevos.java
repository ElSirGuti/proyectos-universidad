package Prelevos;

public class Relevos {
    private String equipo;
    private Tiempo t[] = new Tiempo[4];
    private int totalMseg;
    
    public Relevos(String e, Tiempo ti[]){
        equipo = e;
        t = ti;
        totalMseg = actualizar();
    }

    public String getEquipo() {
        return equipo;
    }

    public int getTotalMseg() {
        return totalMseg;
    }
    
    private int actualizar() {
        int act = 0;
        for (int i = 0; i < t.length; i++) {
            act += t[i].toMes();
        }
        return act;
    }
    
    public void mostrar(){
        System.out.printf("%-10s",equipo);
        for (int i = 0; i < t.length; i++) {
            System.out.printf("%4d %4d",t[i].getSeg(),t[i].getMseg());  
        }
        System.out.printf("%4d %4d\n", totalMseg/1000, totalMseg%1000);
    }
}
