/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author Guille
 */
public class vuelo {
    private String nombre;
    private int dni;
    private String compania;
    private int idViajero;
    private static int id=1;
   
    public vuelo(){
        setNombre();
        setDni();
        setCompania();
        //id unico y personal
        setid();
    }
    public void setid(){
        idViajero = id;
        id++;
    }
    public void setNombre() {
       
       String nombre = JOptionPane.showInputDialog("Nombre");
       
       
       
       this.nombre = nombre;
       
    }

    public void setDni() {
       
        int dni = parseInt(JOptionPane.showInputDialog("DNI"));
        
        this.dni = dni;
        
    }
    

    public void setCompania() {
        
        String compania = JOptionPane.showInputDialog("Compañia de vuelo");
        
        
       this.compania  = compania;
        
        
    }
    //metodos getter
    public int getidViajero(){
        return idViajero;
    }
    public String getNombre(){
       return nombre; 
    }
    public String getCompania(){
        return compania;
    }
    public int getDni(){
        return dni;
    }
    
    //menu
    public static int menu(){
        int opcion;
        
        do{
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "0. Salir"
					+ "\n1. Reservar pasajero con id "+id
					+ "\n2. Mostrar todos los datos de un pasajero mediante Id"
                                        + "\n3. Mostrar todos los datos de un pasajero por la compañia de vuelo"
                                        + "\n4. Modificar Reserva"
                                        + "\n5. Eliminar Reserva"
                    
                                        , "Menú", 3));
            
            
        }while(opcion < 0 || opcion >5);
        
        return opcion;
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Id: " + getidViajero()
				+ "\nNombre: " + getNombre() 
				+ "\nDNI: " + getDni()
                                + "\nDNI: " + getCompania()
				, "Datos del viajero", 1);
        
        
    }
    public void modificar(){
        String nombre = JOptionPane.showInputDialog("Nombre");
        int dni = parseInt(JOptionPane.showInputDialog("DNI"));
        String compania = JOptionPane.showInputDialog("Apellidos");
        
         this.nombre = nombre;
         this.dni = dni;
         this.compania  = compania;
         
         
    }
    public void eliminar(){
        idViajero = id;
        id = id--;
        
    }
    
    
    
}
