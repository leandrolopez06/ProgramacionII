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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input= new Scanner (System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        
        while (edad<0) {
            System.out.print("ERROR. Ingrese una edad valida: ");
            edad = Integer.parseInt(input.nextLine());
        }
       if ((edad>0)&&(edad<12)) {
           System.out.println("Niño");   
        }if ((edad>=12)&&(edad<=17)) {
             System.out.println("Adolecente");
        }if ((edad>=18)&&(edad<=59)) {
             System.out.println("Adulto"); 
        }if (edad>=60) {
            System.out.println("Adulto Mayor"); 
        }   
    }
    
}
