package primerOrden;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.FileWriter;

public class ListPremisa {
    ArrayList<Premisa> listpremisa = new ArrayList();
    
    public String input(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    
    public void addPremisa(){
        String oracion = input("Ingrese la premisa: ");
        Premisa premisa = new Premisa();
        
        premisa.setPremisa(oracion);
        listpremisa.add(premisa);
    }
    
    public void getPremisas(){
        String string = "";
        String lista[] = new String[10];
        lista[0]="P: ";
        lista[1]="Q: ";
        lista[2]="R: ";
        lista[3]="S: ";
        lista[4]="T: ";
        lista[5]="U: ";
        lista[6]="V: ";
        lista[7]="W: ";
        lista[8]="X: ";
        lista[9]="Y: ";
       
        
        for (int i = 0; i < listpremisa.size(); i++) {
            string += lista[i] + listpremisa.get(i).getPremisa()+"\n";
        }
        
        JOptionPane.showMessageDialog(null, string);
    }
    
    public void clearListPremisa(){
        JOptionPane.showMessageDialog(null, "Premisas Eliminadas!");
        listpremisa.clear();
    }
    
    public void operaciones(){
        byte opcion;
        byte opcionDos = 0;
        byte preUno = 0, preDos = 0;
        int indice = 0, seleccion = 0;
        
        String premisaUno = "", premisaDos = "";
        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Operaciones Disponibles "
                                                                    + "\n 1. Conjuncion "
                                                                    + "\n 2. Disyuncion \n "
                                                                    + "3. Condicional \n "
                                                                    + "4. Bicondicional "
                                                                    + "\n 5. Atras"));
        
            switch(opcion){
                case 1:
                    do{
                        preUno = Byte.parseByte(JOptionPane.showInputDialog("Seleccione una premisa"));
                        indice = preUno - 1;
                        premisaUno = listpremisa.get(indice).getPremisa();
                        seleccion++;
                    }while(opcionDos != 9 && seleccion < 1);
                    opcionDos = 0;
                    indice = 0;
                    seleccion = 0;
                    do{
                        preDos = Byte.parseByte(JOptionPane.showInputDialog("Seleccione la segunda premisa"));
                        indice = preDos - 1;
                        premisaDos = listpremisa.get(indice).getPremisa();
                        seleccion++;
                    }while(opcionDos != 9 && seleccion < 1);
                    JOptionPane.showMessageDialog(null, "Resultado:\n"+premisaUno+" y "+premisaDos);
                    break;
                case 2:
                    do{
                        preUno = Byte.parseByte(JOptionPane.showInputDialog("Seleccione una premisa"));
                        indice = preUno - 1;
                        premisaUno = listpremisa.get(indice).getPremisa();
                        seleccion++;
                    }while(opcionDos != 9 && seleccion < 1);
                    opcionDos = 0;
                    indice = 0;
                    seleccion = 0;
                    do{
                        preDos = Byte.parseByte(JOptionPane.showInputDialog("Seleccione la segunda premisa"));
                        indice = preDos - 1;
                        premisaDos = listpremisa.get(indice).getPremisa();
                        seleccion++;
                    }while(opcionDos != 9 && seleccion < 1);
                    JOptionPane.showMessageDialog(null, "Resultado:\n"+premisaUno+" o "+premisaDos);
                    break;
                case 3:
                    do{
                        preUno = Byte.parseByte(JOptionPane.showInputDialog("Seleccione una premisa"));
                        indice = preUno - 1;
                        premisaUno = listpremisa.get(indice).getPremisa();
                        seleccion++;
                    }while(opcionDos != 9 && seleccion < 1);
                    opcionDos = 0;
                    indice = 0;
                    seleccion = 0;
                    do{
                        preDos = Byte.parseByte(JOptionPane.showInputDialog("Seleccione la segunda premisa"));
                        indice = preDos - 1;
                        premisaDos = listpremisa.get(indice).getPremisa();
                        seleccion++;
                    }while(opcionDos != 9 && seleccion < 1);
                    JOptionPane.showMessageDialog(null, "Resultado:\n"+premisaUno+" si "+premisaDos);
                    break;
                case 4: 
                    do{
                        preUno = Byte.parseByte(JOptionPane.showInputDialog("Seleccione la primera premisa"));
                        indice = preUno - 1;
                        premisaUno = listpremisa.get(indice).getPremisa();
                        seleccion++;
                    }while(opcionDos != 9 && seleccion < 1);
                    opcionDos = 0;
                    indice = 0;
                    seleccion = 0;
                    do{
                        preDos = Byte.parseByte(JOptionPane.showInputDialog("Seleccione la segunda premisa"));
                        indice = preDos - 1;
                        premisaDos = listpremisa.get(indice).getPremisa();
                        seleccion++;
                    }while(opcionDos != 9 && seleccion < 1);
                    JOptionPane.showMessageDialog(null, "Resultado:\n"+premisaUno+" si y solo si "+premisaDos);
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No encontrado");
                    break;
            }
            if(opcion > 0 && opcion < 5){
                break;
            }
        } while(opcion != 5);
    }
    
    public void combinaciones(){
        JOptionPane.showMessageDialog(null, "Resultados en el archivo \"combinaciones.txt\" en la carpeta raiz del programa");
        try{
            String p = listpremisa.get(0).getPremisa();
            String q = listpremisa.get(1).getPremisa();
            String r = listpremisa.get(2).getPremisa();
            String s = listpremisa.get(3).getPremisa();
            String t = listpremisa.get(4).getPremisa();
            String u = listpremisa.get(5).getPremisa();
            String v = listpremisa.get(6).getPremisa();
            String w = listpremisa.get(7).getPremisa();
            String x = listpremisa.get(8).getPremisa();
            String y = listpremisa.get(9).getPremisa();
            
            FileWriter fw = new FileWriter("combinaciones.txt");
            fw.flush();
            
            
            // Premisa 1
            fw.write("Conjunciones con P \n");
            fw.write(p + " y " + q + " (P ^ Q) \n");
            fw.write(p + " y " + r + " (P ^ R) \n");
            fw.write(p + " y " + s + " (P ^ S) \n");
            fw.write(p + " y " + t + " (P ^ T) \n");
            fw.write(p + " y " + u + " (P ^ U) \n");
            fw.write(p + " y " + v + " (P ^ V) \n");
            fw.write(p + " y " + w + " (P ^ W) \n");
            fw.write(p + " y " + x + " (P ^ X) \n");
            fw.write(p + " y " + y + " (P ^ Y) \n");
            fw.write("\n");
            
            fw.write("Disyunciones con P \n");
            fw.write(p + " o " + q + " (P v Q) \n");
            fw.write(p + " o " + r + " (P v R) \n");
            fw.write(p + " o " + s + " (P v S) \n");
            fw.write(p + " o " + t + " (P v T) \n");
            fw.write(p + " o " + u + " (P v U) \n");
            fw.write(p + " o " + v + " (P v V) \n");
            fw.write(p + " o " + w + " (P v W) \n");
            fw.write(p + " o " + x + " (P v X) \n");
            fw.write(p + " o " + y + " (P v Y) \n");
            fw.write("\n");
            
            fw.write("Condicionales con P \n");
            fw.write(p + " si " + q + " (P -> Q) \n");
            fw.write(p + " si " + r + " (P -> R) \n");
            fw.write(p + " si " + s + " (P -> S) \n");
            fw.write(p + " si " + t + " (P -> T) \n");
            fw.write(p + " si " + u + " (P -> U) \n");
            fw.write(p + " si " + v + " (P -> V) \n");
            fw.write(p + " si " + w + " (P -> W) \n");
            fw.write(p + " si " + x + " (P -> X) \n");
            fw.write(p + " si " + y + " (P -> Y) \n");
            fw.write("\n");
            
            fw.write("Bicondicionales con P \n");
            fw.write(p + " si y solo si " + q + " (P <-> Q) \n");
            fw.write(p + " si y solo si " + r + " (P <-> R) \n");
            fw.write(p + " si y solo si " + s + " (P <-> S) \n");
            fw.write(p + " si y solo si " + t + " (P <-> T) \n");
            fw.write(p + " si y solo si " + u + " (P <-> U) \n");
            fw.write(p + " si y solo si " + v + " (P <-> V) \n");
            fw.write(p + " si y solo si " + w + " (P <-> W) \n");
            fw.write(p + " si y solo si " + x + " (P <-> X) \n");
            fw.write(p + " si y solo si " + y + " (P <-> Y) \n");
            fw.write("\n");
            
            // Premisa 2
            fw.write("Conjunciones con Q \n");
            fw.write(q + " y " + p + " (Q ^ P) \n");
            fw.write(q + " y " + r + " (Q ^ R) \n");
            fw.write(q + " y " + s + " (Q ^ S) \n");
            fw.write(q + " y " + t + " (Q ^ T) \n");
            fw.write(q + " y " + u + " (Q ^ U) \n");
            fw.write(q + " y " + v + " (Q ^ V) \n");
            fw.write(q + " y " + w + " (Q ^ W) \n");
            fw.write(q + " y " + x + " (Q ^ X) \n");
            fw.write(q + " y " + y + " (Q ^ Y) \n");
            fw.write("\n");
            
            fw.write("Disyunciones con Q \n");
            fw.write(q + " o " + p + " (Q v P) \n");
            fw.write(q + " o " + r + " (Q v R) \n");
            fw.write(q + " o " + s + " (Q v S) \n");
            fw.write(q + " o " + t + " (Q v T) \n");
            fw.write(q + " o " + u + " (Q v U) \n");
            fw.write(q + " o " + v + " (Q v V) \n");
            fw.write(q + " o " + w + " (Q v W) \n");
            fw.write(q + " o " + x + " (Q v X) \n");
            fw.write(q + " o " + y + " (Q v Y) \n");
            fw.write("\n");
            
            fw.write("Condicionales con Q \n");
            fw.write(q + " si " + p + " (Q -> P) \n");
            fw.write(q + " si " + r + " (Q -> R) \n");
            fw.write(q + " si " + s + " (Q -> S) \n");
            fw.write(q + " si " + t + " (Q -> T) \n");
            fw.write(q + " si " + u + " (Q -> U) \n");
            fw.write(q + " si " + v + " (Q -> V) \n");
            fw.write(q + " si " + w + " (Q -> W) \n");
            fw.write(q + " si " + x + " (Q -> X) \n");
            fw.write(q + " si " + y + " (Q -> Y) \n");
            fw.write("\n");
            
            fw.write("Bicondicionales con Q \n");
            fw.write(q + " si y solo si " + p + " (Q <-> P) \n");
            fw.write(q + " si y solo si " + r + " (Q <-> R) \n");
            fw.write(q + " si y solo si " + s + " (Q <-> S) \n");
            fw.write(q + " si y solo si " + t + " (Q <-> T) \n");
            fw.write(q + " si y solo si " + u + " (Q <-> U) \n");
            fw.write(q + " si y solo si " + v + " (Q <-> V) \n");
            fw.write(q + " si y solo si " + w + " (Q <-> W) \n");
            fw.write(q + " si y solo si " + x + " (Q <-> X) \n");
            fw.write(q + " si y solo si " + y + " (Q <-> Y) \n");
            fw.write("\n");
            
            // Premisa 3
            fw.write("Conjunciones con R \n");
            fw.write(r + " y " + q + " (R ^ Q)\n");
            fw.write(r + " y " + p + " (R ^ P)\n");
            fw.write(r + " y " + s + " (R ^ S)\n");
            fw.write(r + " y " + t + " (R ^ T)\n");
            fw.write(r + " y " + u + " (R ^ U)\n");
            fw.write(r + " y " + v + " (R ^ V)\n");
            fw.write(r + " y " + w + " (R ^ W)\n");
            fw.write(r + " y " + x + " (R ^ X)\n");
            fw.write(r + " y " + y + " (R ^ Y)\n");
            fw.write("\n");
            
            fw.write("Disyunciones con R \n");
            fw.write(r + " o " + q + " (R v Q)\n");
            fw.write(r + " o " + p + " (R v P)\n");
            fw.write(r + " o " + s + " (R v S)\n");
            fw.write(r + " o " + t + " (R v T)\n");
            fw.write(r + " o " + u + " (R v U)\n");
            fw.write(r + " o " + v + " (R v V)\n");
            fw.write(r + " o " + w + " (R v W)\n");
            fw.write(r + " o " + x + " (R v X)\n");
            fw.write(r + " o " + y + " (R v Y)\n");
            fw.write("\n");
            
            fw.write("Condicionales con R \n");
            fw.write(r + " si " + q + " (R -> Q)\n");
            fw.write(r + " si " + p + " (R -> P)\n");
            fw.write(r + " si " + s + " (R -> S)\n");
            fw.write(r + " si " + t + " (R -> T)\n");
            fw.write(r + " si " + u + " (R -> U)\n");
            fw.write(r + " si " + v + " (R -> V)\n");
            fw.write(r + " si " + w + " (R -> W)\n");
            fw.write(r + " si " + x + " (R -> X)\n");
            fw.write(r + " si " + y + " (R -> Y)\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con R \n");
            fw.write(r + " si y solo si " + q + " (R <-> Q)\n");
            fw.write(r + " si y solo si " + p + " (R <-> P)\n");
            fw.write(r + " si y solo si " + s + " (R <-> S)\n");
            fw.write(r + " si y solo si " + t + " (R <-> T)\n");
            fw.write(r + " si y solo si " + u + " (R <-> U)\n");
            fw.write(r + " si y solo si " + v + " (R <-> V)\n");
            fw.write(r + " si y solo si " + w + " (R <-> W)\n");
            fw.write(r + " si y solo si " + x + " (R <-> X)\n");
            fw.write(r + " si y solo si " + y + " (R <-> Y)\n");
            fw.write("\n");
            
            // Premisa 4
            fw.write("Conjunciones con S \n");
            fw.write(s + " y " + q + " (S ^ Q)\n");
            fw.write(s + " y " + r + " (S ^ R)\n");
            fw.write(s + " y " + p + " (S ^ P)\n");
            fw.write(s + " y " + t + " (S ^ T)\n");
            fw.write(s + " y " + u + " (S ^ U)\n");
            fw.write(s + " y " + v + " (S ^ )V\n");
            fw.write(s + " y " + w + " (S ^ W)\n");
            fw.write(s + " y " + x + " (S ^ X)\n");
            fw.write(s + " y " + y + " (S ^ Y)\n");
            fw.write("\n");
            
            fw.write("Disyunciones con S \n");
            fw.write(s + " o " + q + " (S v Q)\n");
            fw.write(s + " o " + r + " (S v R)\n");
            fw.write(s + " o " + p + " (S v P)\n");
            fw.write(s + " o " + t + " (S v T)\n");
            fw.write(s + " o " + u + " (S v U)\n");
            fw.write(s + " o " + v + " (S v )V\n");
            fw.write(s + " o " + w + " (S v W)\n");
            fw.write(s + " o " + x + " (S v X)\n");
            fw.write(s + " o " + y + " (S v Y)\n");
            fw.write("\n");
            
            fw.write("Condicionales con S \n");
            fw.write(s + " si " + q + " (S -> Q)\n");
            fw.write(s + " si " + r + " (S -> R)\n");
            fw.write(s + " si " + p + " (S -> P)\n");
            fw.write(s + " si " + t + " (S -> T)\n");
            fw.write(s + " si " + u + " (S -> U)\n");
            fw.write(s + " si " + v + " (S -> )V\n");
            fw.write(s + " si " + w + " (S -> W)\n");
            fw.write(s + " si " + x + " (S -> X)\n");
            fw.write(s + " si " + y + " (S -> Y)\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con S \n");
            fw.write(s + " si y solo si " + q + " (S <-> Q)\n");
            fw.write(s + " si y solo si " + r + " (S <-> R)\n");
            fw.write(s + " si y solo si " + p + " (S <-> P)\n");
            fw.write(s + " si y solo si " + t + " (S <-> T)\n");
            fw.write(s + " si y solo si " + u + " (S <-> U)\n");
            fw.write(s + " si y solo si " + v + " (S <-> V)\n");
            fw.write(s + " si y solo si " + w + " (S <-> W)\n");
            fw.write(s + " si y solo si " + x + " (S <-> X)\n");
            fw.write(s + " si y solo si " + y + " (S <-> Y)\n");
            fw.write("\n");
            
            // Premisa 5
            fw.write("Conjunciones con T \n");
            fw.write(t + " y " + q + " (T ^ Q)\n");
            fw.write(t + " y " + r + " (T ^ R)\n");
            fw.write(t + " y " + s + " (T ^ S)\n");
            fw.write(t + " y " + p + " (T ^ P)\n");
            fw.write(t + " y " + u + " (T ^ U)\n");
            fw.write(t + " y " + v + " (T ^ V)\n");
            fw.write(t + " y " + w + " (T ^ W)\n");
            fw.write(t + " y " + x + " (T ^ X)\n");
            fw.write(t + " y " + y + " (T ^ Y)\n");
            fw.write("\n");
            
            fw.write("Disyunciones con T \n");
            fw.write(t + " o " + q + " (T v Q)\n");
            fw.write(t + " o " + r + " (T v R)\n");
            fw.write(t + " o " + s + " (T v S)\n");
            fw.write(t + " o " + p + " (T v P)\n");
            fw.write(t + " o " + u + " (T v U)\n");
            fw.write(t + " o " + v + " (T v V)\n");
            fw.write(t + " o " + w + " (T v W)\n");
            fw.write(t + " o " + x + " (T v X)\n");
            fw.write(t + " o " + y + " (T v Y)\n");
            fw.write("\n");
            
            fw.write("Condicionales con T \n");
            fw.write(t + " si " + q + " (T -> Q)\n");
            fw.write(t + " si " + r + " (T -> R)\n");
            fw.write(t + " si " + s + " (T -> S)\n");
            fw.write(t + " si " + p + " (T -> P)\n");
            fw.write(t + " si " + u + " (T -> U)\n");
            fw.write(t + " si " + v + " (T -> V)\n");
            fw.write(t + " si " + w + " (T -> W)\n");
            fw.write(t + " si " + x + " (T -> X)\n");
            fw.write(t + " si " + y + " (T -> Y)\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con T \n");
            fw.write(t + " si y solo si " + q + " (T <-> Q)\n");
            fw.write(t + " si y solo si " + r + " (T <-> R)\n");
            fw.write(t + " si y solo si " + s + " (T <-> S)\n");
            fw.write(t + " si y solo si " + p + " (T <-> P)\n");
            fw.write(t + " si y solo si " + u + " (T <-> U)\n");
            fw.write(t + " si y solo si " + v + " (T <-> V)\n");
            fw.write(t + " si y solo si " + w + " (T <-> W)\n");
            fw.write(t + " si y solo si " + x + " (T <-> X)\n");
            fw.write(t + " si y solo si " + y + " (T <-> Y)\n");
            fw.write("\n");
            
            // Premisa 6
            fw.write("Conjunciones con U \n");
            fw.write(u + " y " + q + " (U ^ Q)\n");
            fw.write(u + " y " + r + " (U ^ R)\n");
            fw.write(u + " y " + s + " (U ^ S)\n");
            fw.write(u + " y " + t + " (U ^ T)\n");
            fw.write(u + " y " + p + " (U ^ P)\n");
            fw.write(u + " y " + v + " (U ^ V)\n");
            fw.write(u + " y " + w + " (U ^ W)\n");
            fw.write(u + " y " + x + " (U ^ X)\n");
            fw.write(u + " y " + y + " (U ^ Y)\n");
            fw.write("\n");
            
            fw.write("Disyunciones con U \n");
            fw.write(u + " o " + q + " (U v Q)\n");
            fw.write(u + " o " + r + " (U v R)\n");
            fw.write(u + " o " + s + " (U v S)\n");
            fw.write(u + " o " + t + " (U v T)\n");
            fw.write(u + " o " + p + " (U v P)\n");
            fw.write(u + " o " + v + " (U v V)\n");
            fw.write(u + " o " + w + " (U v W)\n");
            fw.write(u + " o " + x + " (U v X)\n");
            fw.write(u + " o " + y + " (U v Y)\n");
            fw.write("\n");
            
            fw.write("Condicionales con U \n");
            fw.write(u + " si " + q + " (U -> Q)\n");
            fw.write(u + " si " + r + " (U -> R)\n");
            fw.write(u + " si " + s + " (U -> S)\n");
            fw.write(u + " si " + t + " (U -> T)\n");
            fw.write(u + " si " + p + " (U -> P)\n");
            fw.write(u + " si " + v + " (U -> V)\n");
            fw.write(u + " si " + w + " (U -> W)\n");
            fw.write(u + " si " + x + " (U -> X)\n");
            fw.write(u + " si " + y + " (U -> Y)\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con U \n");
            fw.write(u + " si y solo si " + q + " (U <-> Q)\n");
            fw.write(u + " si y solo si " + r + " (U <-> R)\n");
            fw.write(u + " si y solo si " + s + " (U <-> S)\n");
            fw.write(u + " si y solo si " + t + " (U <-> T)\n");
            fw.write(u + " si y solo si " + p + " (U <-> P)\n");
            fw.write(u + " si y solo si " + v + " (U <-> V)\n");
            fw.write(u + " si y solo si " + w + " (U <-> W)\n");
            fw.write(u + " si y solo si " + x + " (U <-> X)\n");
            fw.write(u + " si y solo si " + y + " (U <-> Y)\n");
            fw.write("\n");
            
            // Premisa 7
            fw.write("Conjunciones con V \n");
            fw.write(v + " y " + q + " (V ^ Q)\n");
            fw.write(v + " y " + r + " (V ^ R)\n");
            fw.write(v + " y " + s + " (V ^ S)\n");
            fw.write(v + " y " + t + " (V ^ T)\n");
            fw.write(v + " y " + u + " (V ^ U)\n");
            fw.write(v + " y " + p + " (V ^ P)\n");
            fw.write(v + " y " + w + " (V ^ W)\n");
            fw.write(v + " y " + x + " (V ^ X)\n");
            fw.write(v + " y " + y + " (V ^ Y)\n");
            fw.write("\n");
            
            fw.write("Disyunciones con V \n");
            fw.write(v + " o " + q + " (V v Q)\n");
            fw.write(v + " o " + r + " (V v R)\n");
            fw.write(v + " o " + s + " (V v S)\n");
            fw.write(v + " o " + t + " (V v T)\n");
            fw.write(v + " o " + u + " (V v U)\n");
            fw.write(v + " o " + p + " (V v P)\n");
            fw.write(v + " o " + w + " (V v W)\n");
            fw.write(v + " o " + x + " (V v X)\n");
            fw.write(v + " o " + y + " (V v Y)\n");
            fw.write("\n");
            
            fw.write("Condicionales con V \n");
            fw.write(v + " si " + q + " (V -> Q)\n");
            fw.write(v + " si " + r + " (V -> R)\n");
            fw.write(v + " si " + s + " (V -> S)\n");
            fw.write(v + " si " + t + " (V -> T)\n");
            fw.write(v + " si " + u + " (V -> U)\n");
            fw.write(v + " si " + p + " (V -> P)\n");
            fw.write(v + " si " + w + " (V -> W)\n");
            fw.write(v + " si " + x + " (V -> X)\n");
            fw.write(v + " si " + y + " (V -> Y)\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con V \n");
            fw.write(v + " si y solo si " + q + " (V <-> Q)\n");
            fw.write(v + " si y solo si " + r + " (V <-> R)\n");
            fw.write(v + " si y solo si " + s + " (V <-> S)\n");
            fw.write(v + " si y solo si " + t + " (V <-> T)\n");
            fw.write(v + " si y solo si " + u + " (V <-> U)\n");
            fw.write(v + " si y solo si " + p + " (V <-> P)\n");
            fw.write(v + " si y solo si " + w + " (V <-> W)\n");
            fw.write(v + " si y solo si " + x + " (V <-> X)\n");
            fw.write(v + " si y solo si " + y + " (V <-> Y)\n");
            fw.write("\n");
            
            // Premisa 8
            fw.write("Conjunciones con W \n");
            fw.write(w + " y " + q + " (W ^ Q)\n");
            fw.write(w + " y " + r + " (W ^ R)\n");
            fw.write(w + " y " + s + " (W ^ S)\n");
            fw.write(w + " y " + t + " (W ^ T)\n");
            fw.write(w + " y " + u + " (W ^ U)\n");
            fw.write(w + " y " + v + " (W ^ V)\n");
            fw.write(w + " y " + p + " (W ^ P)\n");
            fw.write(w + " y " + x + " (W ^ X)\n");
            fw.write(w + " y " + y + " (W ^ Y)\n");
            fw.write("\n");
            
            fw.write("Disyunciones con W \n");
            fw.write(w + " o " + q + " (W v Q)\n");
            fw.write(w + " o " + r + " (W v R)\n");
            fw.write(w + " o " + s + " (W v S)\n");
            fw.write(w + " o " + t + " (W v T)\n");
            fw.write(w + " o " + u + " (W v U)\n");
            fw.write(w + " o " + v + " (W v V)\n");
            fw.write(w + " o " + p + " (W v P)\n");
            fw.write(w + " o " + x + " (W v X)\n");
            fw.write(w + " o " + y + " (W v Y)\n");
            fw.write("\n");
            
            fw.write("Condicionales con W \n");
            fw.write(w + " si " + q + " (w -> Q)\n");
            fw.write(w + " si " + r + " (w -> R)\n");
            fw.write(w + " si " + s + " (w -> S)\n");
            fw.write(w + " si " + t + " (w -> T)\n");
            fw.write(w + " si " + u + " (w -> U)\n");
            fw.write(w + " si " + v + " (w -> V)\n");
            fw.write(w + " si " + p + " (w -> P)\n");
            fw.write(w + " si " + x + " (w -> X)\n");
            fw.write(w + " si " + y + " (w -> Y)\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con W \n");
            fw.write(w + " si y solo si " + q + " (W <-> Q)\n");
            fw.write(w + " si y solo si " + r + " (W <-> R)\n");
            fw.write(w + " si y solo si " + s + " (W <-> S)\n");
            fw.write(w + " si y solo si " + t + " (W <-> T)\n");
            fw.write(w + " si y solo si " + u + " (W <-> U)\n");
            fw.write(w + " si y solo si " + v + " (W <-> V)\n");
            fw.write(w + " si y solo si " + p + " (W <-> P)\n");
            fw.write(w + " si y solo si " + x + " (W <-> X)\n");
            fw.write(w + " si y solo si " + y + " (W <-> Y)\n");
            fw.write("\n");
            
            // Premisa 9
            fw.write("Conjunciones con X \n");
            fw.write(x + " y " + q + " (X ^ Q)\n");
            fw.write(x + " y " + r + " (X ^ R)\n");
            fw.write(x + " y " + s + " (X ^ S)\n");
            fw.write(x + " y " + t + " (X ^ T)\n");
            fw.write(x + " y " + u + " (X ^ U)\n");
            fw.write(x + " y " + v + " (X ^ V)\n");
            fw.write(x + " y " + w + " (X ^ W)\n");
            fw.write(x + " y " + p + " (X ^ P)\n");
            fw.write(x + " y " + y + " (X ^ Y)\n");
            fw.write("\n");
            
            fw.write("Disyunciones con X \n");
            fw.write(x + " o " + q + " (X v Q)\n");
            fw.write(x + " o " + r + " (X v R)\n");
            fw.write(x + " o " + s + " (X v S)\n");
            fw.write(x + " o " + t + " (X v T)\n");
            fw.write(x + " o " + u + " (X v U)\n");
            fw.write(x + " o " + v + " (X v V)\n");
            fw.write(x + " o " + w + " (X v W)\n");
            fw.write(x + " o " + p + " (X v P)\n");
            fw.write(x + " o " + y + " (X v Y)\n");
            fw.write("\n");
            
            fw.write("Condicionales con X \n");
            fw.write(x + " si " + q + " (X -> Q)\n");
            fw.write(x + " si " + r + " (X -> R)\n");
            fw.write(x + " si " + s + " (X -> S)\n");
            fw.write(x + " si " + t + " (X -> T)\n");
            fw.write(x + " si " + u + " (X -> U)\n");
            fw.write(x + " si " + v + " (X -> V)\n");
            fw.write(x + " si " + w + " (X -> W)\n");
            fw.write(x + " si " + p + " (X -> P)\n");
            fw.write(x + " si " + y + " (X -> Y)\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con X \n");
            fw.write(x + " si y solo si " + q + " (X <-> Q)\n");
            fw.write(x + " si y solo si " + r + " (X <-> R)\n");
            fw.write(x + " si y solo si " + s + " (X <-> S)\n");
            fw.write(x + " si y solo si " + t + " (X <-> T)\n");
            fw.write(x + " si y solo si " + u + " (X <-> U)\n");
            fw.write(x + " si y solo si " + v + " (X <-> V)\n");
            fw.write(x + " si y solo si " + w + " (X <-> W)\n");
            fw.write(x + " si y solo si " + p + " (X <-> P)\n");
            fw.write(x + " si y solo si " + y + " (X <-> Y)\n");
            fw.write("\n");
            
            // Premisa 10
            fw.write("Conjunciones con Y \n");
            fw.write(y + " y " + q + " (Y ^ Q)\n");
            fw.write(y + " y " + r + " (Y ^ R)\n");
            fw.write(y + " y " + s + " (Y ^ S)\n");
            fw.write(y + " y " + t + " (Y ^ T)\n");
            fw.write(y + " y " + u + " (Y ^ U)\n");
            fw.write(y + " y " + v + " (Y ^ V)\n");
            fw.write(y + " y " + w + " (Y ^ W)\n");
            fw.write(y + " y " + x + " (Y ^ X)\n");
            fw.write(y + " y " + p + " (Y ^ P)\n");
            fw.write("\n");
            
            fw.write("Disyunciones con Y \n");
            fw.write(y + " o " + q + " (Y v Q)\n");
            fw.write(y + " o " + r + " (Y v R)\n");
            fw.write(y + " o " + s + " (Y v S)\n");
            fw.write(y + " o " + t + " (Y v T)\n");
            fw.write(y + " o " + u + " (Y v U)\n");
            fw.write(y + " o " + v + " (Y v V)\n");
            fw.write(y + " o " + w + " (Y v W)\n");
            fw.write(y + " o " + x + " (Y v X)\n");
            fw.write(y + " o " + p + " (Y v P)\n");
            fw.write("\n");
            
            fw.write("Condicionales con Y \n");
            fw.write(y + " si " + q + " (Y -> Q)\n");
            fw.write(y + " si " + r + " (Y -> R)\n");
            fw.write(y + " si " + s + " (Y -> S)\n");
            fw.write(y + " si " + t + " (Y -> T)\n");
            fw.write(y + " si " + u + " (Y -> U)\n");
            fw.write(y + " si " + v + " (Y -> V)\n");
            fw.write(y + " si " + w + " (Y -> W)\n");
            fw.write(y + " si " + x + " (Y -> X)\n");
            fw.write(y + " si " + p + " (Y -> P)\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con Y \n");
            fw.write(y + " si y solo si " + q + " (Y <-> Q)\n");
            fw.write(y + " si y solo si " + r + " (Y <-> R)\n");
            fw.write(y + " si y solo si " + s + " (Y <-> S)\n");
            fw.write(y + " si y solo si " + t + " (Y <-> T)\n");
            fw.write(y + " si y solo si " + u + " (Y <-> U)\n");
            fw.write(y + " si y solo si " + v + " (Y <-> V)\n");
            fw.write(y + " si y solo si " + w + " (Y <-> W)\n");
            fw.write(y + " si y solo si " + x + " (Y <-> X)\n");
            fw.write(y + " si y solo si " + p + " (Y <-> P)\n");
            fw.write("\n");
            
            fw.close();
        } catch(Exception e){
            System.out.println("Ocurrio un error: " + e);
            e.printStackTrace();
        }
    }
}
// Linea 666 :p