/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopratico2;

/**
 *
 * @author PC
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
          
           System.out.println("Precios originales:");
           
           imprimirArrayRecursivo(precios, 0);
           
           precios[2] = 129.99;
           
           System.out.println("\nPrecios modificados:");
           imprimirArrayRecursivo(precios, 0);
          
    }
    public static void imprimirArrayRecursivo(double[] arr, int indice) {
        if (indice >= arr.length) {
           return; 
        }
        System.out.println("Precio: $" + arr[indice]);
        imprimirArrayRecursivo(arr, indice + 1);
    }
}
