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
public class MayorNumero {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scan.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scan.nextInt();

        int mayor = esMayor(num1, num2, num3);

        System.out.println("El mayor de los tres valores ingresados es: " + mayor);
    }

    public static int esMayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }
}