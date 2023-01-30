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
        } while(opcion != 4);
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
            fw.write(p + " y " + q + "\n");
            fw.write(p + " y " + r + "\n");
            fw.write(p + " y " + s + "\n");
            fw.write(p + " y " + t + "\n");
            fw.write(p + " y " + u + "\n");
            fw.write(p + " y " + v + "\n");
            fw.write(p + " y " + w + "\n");
            fw.write(p + " y " + x + "\n");
            fw.write(p + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con P \n");
            fw.write(p + " o " + q + "\n");
            fw.write(p + " o " + r + "\n");
            fw.write(p + " o " + s + "\n");
            fw.write(p + " o " + t + "\n");
            fw.write(p + " o " + u + "\n");
            fw.write(p + " o " + v + "\n");
            fw.write(p + " o " + w + "\n");
            fw.write(p + " o " + x + "\n");
            fw.write(p + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con P \n");
            fw.write(p + " si " + q + "\n");
            fw.write(p + " si " + r + "\n");
            fw.write(p + " si " + s + "\n");
            fw.write(p + " si " + t + "\n");
            fw.write(p + " si " + u + "\n");
            fw.write(p + " si " + v + "\n");
            fw.write(p + " si " + w + "\n");
            fw.write(p + " si " + x + "\n");
            fw.write(p + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con P \n");
            fw.write(p + " si y solo si " + q + "\n");
            fw.write(p + " si y solo si " + r + "\n");
            fw.write(p + " si y solo si " + s + "\n");
            fw.write(p + " si y solo si " + t + "\n");
            fw.write(p + " si y solo si " + u + "\n");
            fw.write(p + " si y solo si " + v + "\n");
            fw.write(p + " si y solo si " + w + "\n");
            fw.write(p + " si y solo si " + x + "\n");
            fw.write(p + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 2
            fw.write("Conjunciones con Q \n");
            fw.write(q + " y " + p + "\n");
            fw.write(q + " y " + r + "\n");
            fw.write(q + " y " + s + "\n");
            fw.write(q + " y " + t + "\n");
            fw.write(q + " y " + u + "\n");
            fw.write(q + " y " + v + "\n");
            fw.write(q + " y " + w + "\n");
            fw.write(q + " y " + x + "\n");
            fw.write(q + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con Q \n");
            fw.write(q + " o " + p + "\n");
            fw.write(q + " o " + r + "\n");
            fw.write(q + " o " + s + "\n");
            fw.write(q + " o " + t + "\n");
            fw.write(q + " o " + u + "\n");
            fw.write(q + " o " + v + "\n");
            fw.write(q + " o " + w + "\n");
            fw.write(q + " o " + x + "\n");
            fw.write(q + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con Q \n");
            fw.write(q + " si " + p + "\n");
            fw.write(q + " si " + r + "\n");
            fw.write(q + " si " + s + "\n");
            fw.write(q + " si " + t + "\n");
            fw.write(q + " si " + u + "\n");
            fw.write(q + " si " + v + "\n");
            fw.write(q + " si " + w + "\n");
            fw.write(q + " si " + x + "\n");
            fw.write(q + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con Q \n");
            fw.write(q + " si y solo si " + p + "\n");
            fw.write(q + " si y solo si " + r + "\n");
            fw.write(q + " si y solo si " + s + "\n");
            fw.write(q + " si y solo si " + t + "\n");
            fw.write(q + " si y solo si " + u + "\n");
            fw.write(q + " si y solo si " + v + "\n");
            fw.write(q + " si y solo si " + w + "\n");
            fw.write(q + " si y solo si " + x + "\n");
            fw.write(q + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 3
            fw.write("Conjunciones con R \n");
            fw.write(r + " y " + q + "\n");
            fw.write(r + " y " + p + "\n");
            fw.write(r + " y " + s + "\n");
            fw.write(r + " y " + t + "\n");
            fw.write(r + " y " + u + "\n");
            fw.write(r + " y " + v + "\n");
            fw.write(r + " y " + w + "\n");
            fw.write(r + " y " + x + "\n");
            fw.write(r + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con R \n");
            fw.write(r + " o " + q + "\n");
            fw.write(r + " o " + p + "\n");
            fw.write(r + " o " + s + "\n");
            fw.write(r + " o " + t + "\n");
            fw.write(r + " o " + u + "\n");
            fw.write(r + " o " + v + "\n");
            fw.write(r + " o " + w + "\n");
            fw.write(r + " o " + x + "\n");
            fw.write(r + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con R \n");
            fw.write(r + " si " + q + "\n");
            fw.write(r + " si " + p + "\n");
            fw.write(r + " si " + s + "\n");
            fw.write(r + " si " + t + "\n");
            fw.write(r + " si " + u + "\n");
            fw.write(r + " si " + v + "\n");
            fw.write(r + " si " + w + "\n");
            fw.write(r + " si " + x + "\n");
            fw.write(r + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con R \n");
            fw.write(r + " si y solo si " + q + "\n");
            fw.write(r + " si y solo si " + p + "\n");
            fw.write(r + " si y solo si " + s + "\n");
            fw.write(r + " si y solo si " + t + "\n");
            fw.write(r + " si y solo si " + u + "\n");
            fw.write(r + " si y solo si " + v + "\n");
            fw.write(r + " si y solo si " + w + "\n");
            fw.write(r + " si y solo si " + x + "\n");
            fw.write(r + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 4
            fw.write("Conjunciones con S \n");
            fw.write(s + " y " + q + "\n");
            fw.write(s + " y " + r + "\n");
            fw.write(s + " y " + p + "\n");
            fw.write(s + " y " + t + "\n");
            fw.write(s + " y " + u + "\n");
            fw.write(s + " y " + v + "\n");
            fw.write(s + " y " + w + "\n");
            fw.write(s + " y " + x + "\n");
            fw.write(s + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con S \n");
            fw.write(s + " o " + q + "\n");
            fw.write(s + " o " + r + "\n");
            fw.write(s + " o " + p + "\n");
            fw.write(s + " o " + t + "\n");
            fw.write(s + " o " + u + "\n");
            fw.write(s + " o " + v + "\n");
            fw.write(s + " o " + w + "\n");
            fw.write(s + " o " + x + "\n");
            fw.write(s + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con S \n");
            fw.write(s + " si " + q + "\n");
            fw.write(s + " si " + r + "\n");
            fw.write(s + " si " + p + "\n");
            fw.write(s + " si " + t + "\n");
            fw.write(s + " si " + u + "\n");
            fw.write(s + " si " + v + "\n");
            fw.write(s + " si " + w + "\n");
            fw.write(s + " si " + x + "\n");
            fw.write(s + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con S \n");
            fw.write(s + " si y solo si " + q + "\n");
            fw.write(s + " si y solo si " + r + "\n");
            fw.write(s + " si y solo si " + p + "\n");
            fw.write(s + " si y solo si " + t + "\n");
            fw.write(s + " si y solo si " + u + "\n");
            fw.write(s + " si y solo si " + v + "\n");
            fw.write(s + " si y solo si " + w + "\n");
            fw.write(s + " si y solo si " + x + "\n");
            fw.write(s + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 5
            fw.write("Conjunciones con T \n");
            fw.write(t + " y " + q + "\n");
            fw.write(t + " y " + r + "\n");
            fw.write(t + " y " + s + "\n");
            fw.write(t + " y " + p + "\n");
            fw.write(t + " y " + u + "\n");
            fw.write(t + " y " + v + "\n");
            fw.write(t + " y " + w + "\n");
            fw.write(t + " y " + x + "\n");
            fw.write(t + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con T \n");
            fw.write(t + " o " + q + "\n");
            fw.write(t + " o " + r + "\n");
            fw.write(t + " o " + s + "\n");
            fw.write(t + " o " + p + "\n");
            fw.write(t + " o " + u + "\n");
            fw.write(t + " o " + v + "\n");
            fw.write(t + " o " + w + "\n");
            fw.write(t + " o " + x + "\n");
            fw.write(t + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con T \n");
            fw.write(t + " si " + q + "\n");
            fw.write(t + " si " + r + "\n");
            fw.write(t + " si " + s + "\n");
            fw.write(t + " si " + p + "\n");
            fw.write(t + " si " + u + "\n");
            fw.write(t + " si " + v + "\n");
            fw.write(t + " si " + w + "\n");
            fw.write(t + " si " + x + "\n");
            fw.write(t + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con T \n");
            fw.write(t + " si y solo si " + q + "\n");
            fw.write(t + " si y solo si " + r + "\n");
            fw.write(t + " si y solo si " + s + "\n");
            fw.write(t + " si y solo si " + p + "\n");
            fw.write(t + " si y solo si " + u + "\n");
            fw.write(t + " si y solo si " + v + "\n");
            fw.write(t + " si y solo si " + w + "\n");
            fw.write(t + " si y solo si " + x + "\n");
            fw.write(t + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 6
            fw.write("Conjunciones con U \n");
            fw.write(u + " y " + q + "\n");
            fw.write(u + " y " + r + "\n");
            fw.write(u + " y " + s + "\n");
            fw.write(u + " y " + t + "\n");
            fw.write(u + " y " + p + "\n");
            fw.write(u + " y " + v + "\n");
            fw.write(u + " y " + w + "\n");
            fw.write(u + " y " + x + "\n");
            fw.write(u + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con U \n");
            fw.write(u + " o " + q + "\n");
            fw.write(u + " o " + r + "\n");
            fw.write(u + " o " + s + "\n");
            fw.write(u + " o " + t + "\n");
            fw.write(u + " o " + p + "\n");
            fw.write(u + " o " + v + "\n");
            fw.write(u + " o " + w + "\n");
            fw.write(u + " o " + x + "\n");
            fw.write(u + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con U \n");
            fw.write(u + " si " + q + "\n");
            fw.write(u + " si " + r + "\n");
            fw.write(u + " si " + s + "\n");
            fw.write(u + " si " + t + "\n");
            fw.write(u + " si " + p + "\n");
            fw.write(u + " si " + v + "\n");
            fw.write(u + " si " + w + "\n");
            fw.write(u + " si " + x + "\n");
            fw.write(u + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con U \n");
            fw.write(u + " si y solo si " + q + "\n");
            fw.write(u + " si y solo si " + r + "\n");
            fw.write(u + " si y solo si " + s + "\n");
            fw.write(u + " si y solo si " + t + "\n");
            fw.write(u + " si y solo si " + p + "\n");
            fw.write(u + " si y solo si " + v + "\n");
            fw.write(u + " si y solo si " + w + "\n");
            fw.write(u + " si y solo si " + x + "\n");
            fw.write(u + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 7
            fw.write("Conjunciones con V \n");
            fw.write(v + " y " + q + "\n");
            fw.write(v + " y " + r + "\n");
            fw.write(v + " y " + s + "\n");
            fw.write(v + " y " + t + "\n");
            fw.write(v + " y " + u + "\n");
            fw.write(v + " y " + p + "\n");
            fw.write(v + " y " + w + "\n");
            fw.write(v + " y " + x + "\n");
            fw.write(v + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con V \n");
            fw.write(v + " o " + q + "\n");
            fw.write(v + " o " + r + "\n");
            fw.write(v + " o " + s + "\n");
            fw.write(v + " o " + t + "\n");
            fw.write(v + " o " + u + "\n");
            fw.write(v + " o " + p + "\n");
            fw.write(v + " o " + w + "\n");
            fw.write(v + " o " + x + "\n");
            fw.write(v + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con V \n");
            fw.write(v + " si " + q + "\n");
            fw.write(v + " si " + r + "\n");
            fw.write(v + " si " + s + "\n");
            fw.write(v + " si " + t + "\n");
            fw.write(v + " si " + u + "\n");
            fw.write(v + " si " + p + "\n");
            fw.write(v + " si " + w + "\n");
            fw.write(v + " si " + x + "\n");
            fw.write(v + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con V \n");
            fw.write(v + " si y solo si " + q + "\n");
            fw.write(v + " si y solo si " + r + "\n");
            fw.write(v + " si y solo si " + s + "\n");
            fw.write(v + " si y solo si " + t + "\n");
            fw.write(v + " si y solo si " + u + "\n");
            fw.write(v + " si y solo si " + p + "\n");
            fw.write(v + " si y solo si " + w + "\n");
            fw.write(v + " si y solo si " + x + "\n");
            fw.write(v + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 8
            fw.write("Conjunciones con W \n");
            fw.write(w + " y " + q + "\n");
            fw.write(w + " y " + r + "\n");
            fw.write(w + " y " + s + "\n");
            fw.write(w + " y " + t + "\n");
            fw.write(w + " y " + u + "\n");
            fw.write(w + " y " + v + "\n");
            fw.write(w + " y " + p + "\n");
            fw.write(w + " y " + x + "\n");
            fw.write(w + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con W \n");
            fw.write(w + " o " + q + "\n");
            fw.write(w + " o " + r + "\n");
            fw.write(w + " o " + s + "\n");
            fw.write(w + " o " + t + "\n");
            fw.write(w + " o " + u + "\n");
            fw.write(w + " o " + v + "\n");
            fw.write(w + " o " + p + "\n");
            fw.write(w + " o " + x + "\n");
            fw.write(w + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con W \n");
            fw.write(w + " si " + q + "\n");
            fw.write(w + " si " + r + "\n");
            fw.write(w + " si " + s + "\n");
            fw.write(w + " si " + t + "\n");
            fw.write(w + " si " + u + "\n");
            fw.write(w + " si " + v + "\n");
            fw.write(w + " si " + p + "\n");
            fw.write(w + " si " + x + "\n");
            fw.write(w + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con W \n");
            fw.write(w + " si y solo si " + q + "\n");
            fw.write(w + " si y solo si " + r + "\n");
            fw.write(w + " si y solo si " + s + "\n");
            fw.write(w + " si y solo si " + t + "\n");
            fw.write(w + " si y solo si " + u + "\n");
            fw.write(w + " si y solo si " + v + "\n");
            fw.write(w + " si y solo si " + p + "\n");
            fw.write(w + " si y solo si " + x + "\n");
            fw.write(w + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 9
            fw.write("Conjunciones con X \n");
            fw.write(x + " y " + q + "\n");
            fw.write(x + " y " + r + "\n");
            fw.write(x + " y " + s + "\n");
            fw.write(x + " y " + t + "\n");
            fw.write(x + " y " + u + "\n");
            fw.write(x + " y " + v + "\n");
            fw.write(x + " y " + w + "\n");
            fw.write(x + " y " + p + "\n");
            fw.write(x + " y " + y + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con X \n");
            fw.write(x + " o " + q + "\n");
            fw.write(x + " o " + r + "\n");
            fw.write(x + " o " + s + "\n");
            fw.write(x + " o " + t + "\n");
            fw.write(x + " o " + u + "\n");
            fw.write(x + " o " + v + "\n");
            fw.write(x + " o " + w + "\n");
            fw.write(x + " o " + p + "\n");
            fw.write(x + " o " + y + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con X \n");
            fw.write(x + " si " + q + "\n");
            fw.write(x + " si " + r + "\n");
            fw.write(x + " si " + s + "\n");
            fw.write(x + " si " + t + "\n");
            fw.write(x + " si " + u + "\n");
            fw.write(x + " si " + v + "\n");
            fw.write(x + " si " + w + "\n");
            fw.write(x + " si " + p + "\n");
            fw.write(x + " si " + y + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con X \n");
            fw.write(x + " si y solo si " + q + "\n");
            fw.write(x + " si y solo si " + r + "\n");
            fw.write(x + " si y solo si " + s + "\n");
            fw.write(x + " si y solo si " + t + "\n");
            fw.write(x + " si y solo si " + u + "\n");
            fw.write(x + " si y solo si " + v + "\n");
            fw.write(x + " si y solo si " + w + "\n");
            fw.write(x + " si y solo si " + p + "\n");
            fw.write(x + " si y solo si " + y + "\n");
            fw.write("\n");
            
            // Premisa 10
            fw.write("Conjunciones con Y \n");
            fw.write(y + " y " + q + "\n");
            fw.write(y + " y " + r + "\n");
            fw.write(y + " y " + s + "\n");
            fw.write(y + " y " + t + "\n");
            fw.write(y + " y " + u + "\n");
            fw.write(y + " y " + v + "\n");
            fw.write(y + " y " + w + "\n");
            fw.write(y + " y " + x + "\n");
            fw.write(y + " y " + p + "\n");
            fw.write("\n");
            
            fw.write("Disyunciones con Y \n");
            fw.write(y + " o " + q + "\n");
            fw.write(y + " o " + r + "\n");
            fw.write(y + " o " + s + "\n");
            fw.write(y + " o " + t + "\n");
            fw.write(y + " o " + u + "\n");
            fw.write(y + " o " + v + "\n");
            fw.write(y + " o " + w + "\n");
            fw.write(y + " o " + x + "\n");
            fw.write(y + " o " + p + "\n");
            fw.write("\n");
            
            fw.write("Condicionales con Y \n");
            fw.write(y + " si " + q + "\n");
            fw.write(y + " si " + r + "\n");
            fw.write(y + " si " + s + "\n");
            fw.write(y + " si " + t + "\n");
            fw.write(y + " si " + u + "\n");
            fw.write(y + " si " + v + "\n");
            fw.write(y + " si " + w + "\n");
            fw.write(y + " si " + x + "\n");
            fw.write(y + " si " + p + "\n");
            fw.write("\n");
            
            fw.write("Bicondicionales con Y \n");
            fw.write(y + " si y solo si " + q + "\n");
            fw.write(y + " si y solo si " + r + "\n");
            fw.write(y + " si y solo si " + s + "\n");
            fw.write(y + " si y solo si " + t + "\n");
            fw.write(y + " si y solo si " + u + "\n");
            fw.write(y + " si y solo si " + v + "\n");
            fw.write(y + " si y solo si " + w + "\n");
            fw.write(y + " si y solo si " + x + "\n");
            fw.write(y + " si y solo si " + p + "\n");
            fw.write("\n");
            
            fw.close();
        } catch(Exception e){
            System.out.println("Ocurrio un error: " + e);
            e.printStackTrace();
        }
    }
}
// Linea 666 :p