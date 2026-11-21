/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciouno;

/**
 *
 * @author Peter De La Cruz
 */
import java.util.Scanner; 
public class EjercicioUno {

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        String carrera;
        double estatura;

        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();

        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese su carrera:");
        carrera = sc.nextLine();

        System.out.println("Ingrese su estatura:");
        estatura = sc.nextDouble();

        System.out.println("----- DATOS PERSONALES -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura);
        
    }
}
