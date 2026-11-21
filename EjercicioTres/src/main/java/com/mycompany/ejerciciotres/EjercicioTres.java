/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;

/**
 *
 * @author Peter
 */
import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
    }
}
