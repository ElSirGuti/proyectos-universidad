package Trabajo;

public class listaEnlazada {
    nodos cabeza;
    int size;

    public listaEnlazada() {
        cabeza = null;
        size = 0;
    }
    
    public void agregarPrimero(Object obj){
        if (cabeza == null) {
            cabeza = new nodos(obj);
        } else{
            nodos temp = cabeza;
            nodos nuevo = new nodos(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }
    public int size(){
        return size;
    }
    
    public Object obtener(int index){
        int contador = 0;
        nodos temporal = cabeza;
        while(contador < index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }
}
