/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopratico2;

/**
 *
 * @author PC
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99,299.5,149.75,399.0,89.99};
        
        System.out.println("precios originales");
        for (int i = 0; i < precios.length; i++) {
              System.out.println("precio:$" + precios[i]);    
        }
        
        precios[2]=129.99;
        
        System.out.println("precios Modificados");
        for (int i = 0; i < precios.length; i++) {
              System.out.println("precio:$" + precios[i]);    
        }
    }
    
}
