/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocuatro;

/**
 *
 * @author Peter
 */
import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.println("Ingrese la nota del estudiante:");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
