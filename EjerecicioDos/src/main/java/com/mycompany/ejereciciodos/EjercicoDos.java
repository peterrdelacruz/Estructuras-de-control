/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejereciciodos;

/**
 *
 * @author Peter De la Cruz
 */
import java.util.Scanner;

public class EjercicoDos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        int suma, resta, multiplicacion;

        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero:");
        num2 = sc.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        if (num2 != 0) {
            System.out.println("Division: " + (double) num1 / num2);
            System.out.println("Residuo: " + num1 % num2);
        } else {
            System.out.println("No se puede dividir para cero.");
        }
    }
}