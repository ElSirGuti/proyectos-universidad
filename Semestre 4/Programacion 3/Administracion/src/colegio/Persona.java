package colegio;

public abstract class Persona implements Mostrar, Calculos{
    private String nom;
    private String ced;
    
    public Persona(String n, String c){
        nom = n;
        ced = c;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getCed(){
        return ced;
    }
}
