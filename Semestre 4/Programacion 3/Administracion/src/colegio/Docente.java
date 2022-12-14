package colegio;

public class Docente extends Persona{
    private String asignatura;
    private int estatus;
    private int cargaHoraria;
    private static int cotDoc=0;
    
    public Docente(String n, String c, String as, int es, int ch){
        super(n,c);
        asignatura=as;
        estatus=es;
        cargaHoraria=ch;
        cotDoc++;
    }
    
    public double calculos(){
        double pago=0;
        if(estatus==1){
            pago=2000*cargaHoraria*4;
        } else {
            pago=3500*cargaHoraria*4;
        }
        return pago;
    }
    
    public void mostrar(){
        System.out.printf("%-10s  %-10s  %-10s  %5.2f\n",getNom(),getCed(),asignatura,calculos());
    }
    public static void mostrarTotalDoc(){
        System.out.println("El total de docentes es: "+cotDoc);
    }
}
