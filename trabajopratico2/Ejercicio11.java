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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    static final double descuento=0.10; 
    
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        double precio;  
        
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        precio= validacionDeDatos(precio,input);
        
        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado= precio*descuento;
        double precioFinal= precio-descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        
    }
    
     //Metodo Validacion de datos
    public static double validacionDeDatos(double valor,Scanner input){
       while (valor<0) {
            System.out.print("ERROR:Ingrese valor valido mayor a 0: ");
            valor = Double.parseDouble(input.nextLine());
        }
        return valor;
    }
    
}
