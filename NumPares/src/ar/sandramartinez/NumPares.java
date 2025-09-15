/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.sandramartinez;

import java.util.Scanner;

/**
 *
 * @author Sandra Martinez
 */
public class NumPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int suma = 0;
        int numero;

        System.out.print("Ingrese un número (ó 0 para terminar): ");
        numero = scan.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            System.out.print("Ingrese un número (ó 0 para terminar): ");
            numero = scan.nextInt();
        }

        System.out.println("La suma de los números pares es: " + suma);
    }
}