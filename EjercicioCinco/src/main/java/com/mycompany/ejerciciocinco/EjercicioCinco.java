/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocinco;

/**
 *
 * @author Peter
 */
import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.println("Ingrese una calificacion entre 0 y 10:");
        nota = sc.nextDouble();

        if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente");
        } else if (nota >= 8 && nota < 9) {
            System.out.println("Muy Bueno");
        } else if (nota >= 7 && nota < 8) {
            System.out.println("Bueno");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Regular");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Deficiente");
        } else {
            System.out.println("Calificacion fuera del rango.");
        }
    }
}
