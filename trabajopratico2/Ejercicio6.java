/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopratico2;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int num,positivos=0,negativos=0,ceros=0 ;
        
        for (int i = 0; i < 10; i++) {
           System.out.print("Ingrese un numero: ");
           num = Integer.parseInt(input.nextLine());
            if (num>0) {
                positivos += 1;
            }
            if (num<0) {
                negativos += 1;
            }
            if (num==0) {
                ceros += 1;
            }
        }
        
        System.out.println("Resultados\nPositivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros );
               
      
    }
    
}
