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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
        int num,suma;
        
        suma=0;
        num=1;
        
        while (num!=0) {
           System.out.print("Ingrese un numero: ");
           num = Integer.parseInt(input.nextLine());
            if (num%2==0) {
                suma += num;
            }
           
        }
        System.out.println("La suma de los numero pares es: "  + suma);
               
    }
    
}
