/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package venta.entradas.teatro;

import java.util.Scanner;
public class VentaEntradasTeatro {

        static String nombreTeatro = "Teatro Moro";
        static int entradasVendidas = 0;
        static double totalIngresos = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String tipoEntrada;
        String tipoCliente;
        double precioEntrada = 0;

        System.out.println("Bienvenido al " + nombreTeatro);
        
        int seguirComprando = 1;
        while (seguirComprando == 1) {
        
            entradasVendidas ++;
        System.out.println("Por favor, seleccione el tipo de entrada que desee comprar guiandose con los siguientes numeros:");
        System.out.println("1 : VIP");
        System.out.println("2 : Platea Baja");
        System.out.println("3 : Platea Alta");
        System.out.println("4 : Palco");
        String opcionTipo = sc.nextLine();
        
        switch (opcionTipo) {
    case "1":
        tipoEntrada = "VIP";
        break;
    case "2":
        tipoEntrada = "Platea Baja";
        break;
    case "3":
        tipoEntrada = "Platea Alta";
        break;
    case "4":
        tipoEntrada = "Palco";
        break;
    default:
        tipoEntrada = "ERROR";
        System.out.println("ERROR: Opcion invalida");
        System.exit(0);
        }
        
        System.out.println("Por favor, a continuacion ingrese su edad para aplicar el descuento correspondiente en el caso que sea estudiante o adulto mayor.");
       int edad = sc.nextInt();
       
        if (edad <= 18) {
            tipoCliente = "Estudiante";
            System.out.println("Tiene un descuento del 10% por entrada.");
        } else if (edad < 65) {
            tipoCliente = "Publico General";
            System.out.println("No tiene descuento.");
        } else {
            tipoCliente = "Adulto Mayor";
            System.out.println("Tiene un descuento del 15% por entrada");
        }
        
        System.out.println("Su entrada entonces es "+ tipoCliente +" en la ubicacion "+ tipoEntrada);
        
                switch (tipoEntrada) {
            case "VIP":
                if (tipoCliente.equals("Publico General")) {
                    precioEntrada = 30000;
                }   else if (tipoCliente.equals("Estudiante")) {
                    precioEntrada = 30000 * 0.9;
                }   else {
                    precioEntrada = 30000 * 0.85;
                }   break;
            case "Platea Baja":
                if (tipoCliente.equals("Publico General")) {
                    precioEntrada = 25000;
                }   else if (tipoCliente.equals("Estudiante")){
                    precioEntrada = 25000 * 0.9;
                }   else {
                    precioEntrada = 25000 * 0.85;
                }   break;
            case "Platea Alta":
                if (tipoCliente.equals("Publico General")){
                    precioEntrada = 18000;
                }   else if (tipoCliente.equals("Estudiante")){
                    precioEntrada = 18000 * 0.9;
                }   else {
                    precioEntrada = 18000 * 0.85;
                }   break;
            case "Palco":
                if (tipoCliente.equals("Publico General")){
                    precioEntrada = 10000;
                }   else if (tipoCliente.equals("Estudiante")){
                    precioEntrada = 10000 * 0.9;
                }   else {
                    precioEntrada = 10000 * 0.85;
                }   break;
            default:
                break;
        }

                if (entradasVendidas >=3) {
                    precioEntrada *= 0.9;
                    System.out.println("Descuento especial por haber comprado más de tres entradas.");
                }
            totalIngresos += precioEntrada;
                System.out.println("El total a pagar en su caso es de: "+ totalIngresos);
                
                System.out.println("En total, el numero de cantidades compradas es de: "+ entradasVendidas);
                
                System.out.println("Si desea seguir comprando, presione 1. Por el contrario, presione 2.");
                seguirComprando = sc.nextInt();
                sc.nextLine();
            if (seguirComprando!= 1){

                System.out.println("Gracias por comprar en Teatro Moro. Disfrute su funcion");
                System.exit(0);
            }
            }
    }        
}