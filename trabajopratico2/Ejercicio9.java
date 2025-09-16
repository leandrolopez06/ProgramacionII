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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        double precioProducto,pesoPaquete,totalPagar,costoEnvio;
        String zonaEnvio;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        precioProducto= validacionDeDatos(precioProducto,input);
                
        System.out.print("Ingrese el peso del paquete en Kg: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        pesoPaquete= validacionDeDatos(pesoPaquete,input);
        
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        zonaEnvio = input.nextLine();
        while (!((zonaEnvio.equalsIgnoreCase("nacional")) || (zonaEnvio.equalsIgnoreCase("internacional")))) {
            System.out.print("ERROR: Ingrese la zona de envio (Nacional/Internacional): ");
            zonaEnvio = input.nextLine();
        } 
        
        costoEnvio = calcularCostoEnvio(pesoPaquete,zonaEnvio);
        
        totalPagar = calcularTotalCompra(precioProducto,costoEnvio);
            
        System.out.println("El costo del envio es: $" + costoEnvio +  "\nEl total a pagar es: $" + totalPagar);
        
        
    }
    
    //Calculamos el total de la compra:
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double total= precioProducto + costoEnvio;
        return total;
    }
    
    //Caulculamos el costo del envio:
    public static double calcularCostoEnvio(double peso,String zona){
        double costo = 0;
        if (zona.equalsIgnoreCase("Nacional")) {
           costo= (peso * 5);
        }
        if (zona.equalsIgnoreCase("Internacional")) {
            costo= (peso * 10);
        }
        return costo;
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

