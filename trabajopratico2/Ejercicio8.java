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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        double precioBase,impuesto,descuento,precioFinal;
    
        System.out.print("Ingrese el precio base: ");
        precioBase = Double.parseDouble(input.nextLine());
        precioBase= validacion(precioBase,input);
        
        System.out.print("Ingrese el % Impuesto: ");
        impuesto = Double.parseDouble(input.nextLine())/100.0;
        impuesto = validacion(impuesto,input);
        
        System.out.print("Ingrese el % descuento: ");
        descuento = Double.parseDouble(input.nextLine())/100.0;
        descuento = validacion(descuento,input);
        
        precioFinal= calcularPrecioFinal(precioBase,impuesto,descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
        System.out.println(descuento + " y " + impuesto);
    }
    
    
    
    // Método para calcular el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }    
    
    //Metodo Validacion de datos
    public static double validacion(double valor,Scanner input){
       while (valor<0) {
            System.out.print("ERROR:Ingrese valor valido: ");
            valor = Double.parseDouble(input.nextLine());
        }
        return valor;
    }
    
}
