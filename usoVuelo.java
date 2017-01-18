/*

 */
package avion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Guille
 */
public class usoVuelo {
    public static void main(String[] args) {
        
        int opcion;
        boolean comprobar=false;
        int id;
        String compania;
        
        
        
        vuelo[] pasajero = new vuelo[5];
        
        Arrays.fill(pasajero, null);
      
        do{
        opcion = vuelo.menu();
        
        
            switch (opcion) {
                case 1:
                    for (int i = 0; i < pasajero.length; i++) {
                        
                        if (pasajero[i]==null) {
                            
                            pasajero[i] = new vuelo();
                            JOptionPane.showMessageDialog(null, "Reserva realizada", "information", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                        }
                       
                      
                        
                    }
                    break;
                    
                case 2:
                    id=Integer.parseInt(JOptionPane.showInputDialog("Id"));
                    comprobar=false;
                    
                    for (int i = 0; i < pasajero.length; i++) {
                        
                        if (pasajero[i]!=null && pasajero[i].getidViajero()== id) {
                            
                            pasajero[i].mostrarDatos();
                            comprobar=true;
                            break;
                        } 
                        if(pasajero[i]==null){
                            JOptionPane.showMessageDialog(null, "Esta id no contiene registros", "information", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        
                        
                        
                    }
                    
                    break; 
                    
                case 3:
                    compania=JOptionPane.showInputDialog("introduce el nombre de la compañia(easyJet,Ryanair,McFlay)");
                   
                    
                    for (int i = 0; i < pasajero.length; i++) {
                       
                        if (pasajero[i]!=null && pasajero[i].getCompania().equalsIgnoreCase(compania)) {
                            
                                pasajero[i].mostrarDatos();
                                
                                break;
                        }
                       
                        
                    }
                
                    break;
                    
                case 4:
                    
                     id=Integer.parseInt(JOptionPane.showInputDialog("Id"));
                     comprobar=false;
                    
                    for (int i = 0; i < pasajero.length; i++) {
                        
                        if (pasajero[i]!=null && pasajero[i].getidViajero()== id) {
                            
                            pasajero[i].modificar();
                            
                            comprobar=true;
                            break;
                        }
                    }
                    if (comprobar) {
                        JOptionPane.showMessageDialog(null, "Modificacion realizada", "information", JOptionPane.INFORMATION_MESSAGE); 
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta id no contiene registros", "information", JOptionPane.ERROR_MESSAGE);
                    }
        
                    break;
                case 5:
                 comprobar=false;		
					
		 id=Integer.parseInt(JOptionPane.showInputDialog("Id"));
                   
                    
                    for (int i = 0; i < pasajero.length; i++) {
                        
                        if (pasajero[i]!=null && pasajero[i].getidViajero()== id) {
                           pasajero[i]=null;
                           id--;
                            comprobar = true;
                            
                        }
                    }
                    if (comprobar) {
                        System.out.println("Se ha eliminado correctamente");
                        
                    }else{
                        System.out.println("No se ha encontrado ninguna pelicula");
                    }
        
                    break;
        
        
        
            }
        
        }while(opcion!=0);
        
        
        }
}
