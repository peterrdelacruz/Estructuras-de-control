/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosietee;

/**
 *
 * @author Peter
 */
import java.util.Scanner;

public class EjercicioSietee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese un numero positivo o negativo para terminar:");
        numero = sc.nextInt();

        while (numero >= 0) {

            suma = suma + numero;
            contador++;

            System.out.println("Ingrese otro numero:");
            numero = sc.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + contador);
        System.out.println("Suma total: " + suma);
    }
}
