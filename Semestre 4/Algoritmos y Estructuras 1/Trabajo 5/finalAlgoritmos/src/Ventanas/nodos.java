package Ventanas;

public class nodos {
    Object valor;
    nodos siguiente;
    
    public nodos(Object valor){
        this.valor = valor;
        this.siguiente = null;
    }
    
    public Object obtenerValor(){
        return valor;
    }
    
    public void enlazarSiguiente(nodos n){
        siguiente = n;
    }
    
    public nodos obtenerSiguiente(){
        return siguiente;
    }
}
