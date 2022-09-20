/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Your Name <Ronald Torres>
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro");
        m1.setNombre("Pepe Chiquito");
        
        m1.pasear(100);
        
        System.out.println(m1);
        
        
        
        
        
        
//    public String nombre;
//    public String apodo;
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
    
    
    
        
        
    }
    
}
