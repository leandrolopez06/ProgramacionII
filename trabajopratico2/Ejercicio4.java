/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopratico2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
        double precio,descuento = 0;
        String categoria;
        
        System.out.print("Ingrese el precio de su producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la categoria de su producto A,B,C: ");
        categoria = input.nextLine();
        
        while (!(categoria.equalsIgnoreCase("A") || categoria.equalsIgnoreCase("B") || categoria.equalsIgnoreCase("C"))) {
           System.out.print("ERROR: Ingrese una categoria valida: ");
           categoria = input.nextLine();
        }
        
        if (categoria.equalsIgnoreCase("A")){
            descuento = 10;
            precio -= precio * 10 / 100;
        }
        if (categoria.equalsIgnoreCase("B")){
            descuento = 15;
            precio -= precio * 15 / 100;
        }
        if (categoria.equalsIgnoreCase("C")){
            descuento = 20;
            precio -= precio * 20 / 100;
            
        }
        
        System.out.println("Descuento aplicado: " + descuento + "%\nPrecio Final: $" + precio);
            
    }
    
    
}
