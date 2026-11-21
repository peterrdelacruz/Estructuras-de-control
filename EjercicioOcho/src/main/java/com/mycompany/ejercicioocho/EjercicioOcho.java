/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioocho;

/**
 *
 * @author Peter
 */
import java.util.Scanner;

public class EjercicioOcho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contrasena;

        System.out.println("Ingrese la contrasena:");
        contrasena = sc.nextLine();

        while (!contrasena.equals("java2026")) {

            System.out.println("Contrasena incorrecta.");
            System.out.println("Intente nuevamente:");
            contrasena = sc.nextLine();
        }

        System.out.println("Acceso concedido.");
    }
}
