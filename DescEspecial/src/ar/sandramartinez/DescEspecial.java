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
public class DescEspecial {

    /**
     * @param args the command line arguments
     */
    static double descuentoGlobal = 0.10; // 10% de descuento

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
