package colegio;
import java.io.IOException;

public class Principal {
    
    public static void main(String[] args) throws IOException {
        int treg = Administracion.cReg();
        Persona listado[] = new Persona[treg];
        Administracion.leoArchivo(listado);
        Administracion.mostrar(listado);
        System.out.println("\n");
        Docente.mostrarTotalDoc(); // Muestra el total de docentes
        Alumno.mostrarTotalAlum(); // Muestra el total de estudiantes
    
    }
}
