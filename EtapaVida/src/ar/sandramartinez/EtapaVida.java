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
public class EtapaVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();

        if (edad < 12) {
            System.out.println("Sos un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Sos un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Sos un Adulto.");
        } else {
            System.out.println("Sos un Adulto mayor.");
        }
    }
}