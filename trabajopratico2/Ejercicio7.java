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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int nota;
        
        
        /*Para poder mostrar "Error nota invalida" debemos usar un if dentro de 
          do-while, esto es una practica poco util ya que directamente podemos utilizar
          el while desde comienzo*/
        do {            
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
        } while (nota<0 || nota>10);
       
        System.out.println("Nota guardada correctamente");
    }
    
}
