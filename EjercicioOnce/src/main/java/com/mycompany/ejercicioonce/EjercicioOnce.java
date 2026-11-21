/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioonce;

/**
 *
 * @author Peter
 */
import java.util.Scanner;

public class EjercicioOnce {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int mayor, menor;

        System.out.println("Ingrese el numero 1:");
        numero = sc.nextInt();

        mayor = numero;
        menor = numero;

        for (int i = 2; i <= 10; i++) {

            System.out.println("Ingrese el numero " + i + ":");
            numero = sc.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
