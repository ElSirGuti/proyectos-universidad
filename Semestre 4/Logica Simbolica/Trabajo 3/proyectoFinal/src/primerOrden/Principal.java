package primerOrden;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ListPremisa obj = new ListPremisa();
        
        byte opcion;
        
        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Menu Principal \n "
                    + "1. Agregar Premisa "
                    + "\n 2. Lista de Premisas "
                    + "\n 3. Vaciar Premisas "
                    + "\n 4. Operaciones "
                    + "\n 5. Todas las combinaciones posibles \n"
                    + "(Tienen que haber 10 premisas para esto)"
                    + "\n 6. Salir")); 
            
            switch(opcion){
                case 1:
                    obj.addPremisa();
                    break;
                case 2:
                    obj.getPremisas();
                    break;
                case 3:
                    obj.clearListPremisa();
                    break;
                case 4:
                    obj.operaciones();
                    break;
                case 5:
                    obj.combinaciones();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Adios :D");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No encontrado");
                    break;
                    
            }
            
        }while(opcion != 5);
        
    }

}
