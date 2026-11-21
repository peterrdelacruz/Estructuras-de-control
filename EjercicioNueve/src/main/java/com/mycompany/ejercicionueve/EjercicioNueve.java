/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicionueve;

/**
 *
 * @author Peter
 */
import java.util.Scanner;

public class EjercicioNueve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero:");
        numero = sc.nextInt();

        for (int i = 1; i <= 12; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}