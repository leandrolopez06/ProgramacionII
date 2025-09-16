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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int stockActual,cantidadVendida,cantidadRecibida,stockActualizado;
        
        
        System.out.print("Ingrese stock actual: ");
        stockActual= Integer.parseInt(input.nextLine());
        stockActual= validacionDeDatos(stockActual,input);
        
        System.out.print("Ingrese cantidad vendida: ");
        cantidadVendida= Integer.parseInt(input.nextLine());
        cantidadVendida= validacionDeDatos(cantidadVendida,input);
        
        System.out.print("Ingrese cantidad recibida: ");
        cantidadRecibida= Integer.parseInt(input.nextLine());
        cantidadRecibida= validacionDeDatos(cantidadRecibida,input);
        
        stockActualizado=actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + stockActualizado);
        
    }
   
    
    public static int actualizarStock(int stockActual,int cantidadVendida,int cantidadRecibida){
      int  nuevoStock= (stockActual-cantidadVendida)+cantidadRecibida;
      return nuevoStock;
    }
    
    //Metodo Validacion de datos
    public static int validacionDeDatos(int valor,Scanner input){
       while (valor<0) {
            System.out.print("ERROR:Ingrese valor valido mayor a 0: ");
            valor = Integer.parseInt(input.nextLine());
        }
        return valor;
    }
    
}
