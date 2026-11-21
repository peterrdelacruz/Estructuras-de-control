/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodiez;

/**
 *
 * @author Peter
 */
import java.util.Scanner;

public class EjercicioDiez {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Ingrese el numero " + i + ":");
            numero = sc.nextInt();

            suma = suma + numero;
        }

        promedio = suma / 10.0;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
