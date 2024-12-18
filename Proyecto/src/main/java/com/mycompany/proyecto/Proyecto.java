/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

import java.util.Random;
import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int Numero_Mesa = random.nextInt(5) + 8; 
        Mesa[] mesas = new Mesa[Numero_Mesa];
        String[] meseros = {"Maria Salas, Lucia Torres, Pablo Lopez, Roberto Ramirez"};

       
        for (int i = 0; i < Numero_Mesa; i++) {
            int Cantidad_Sillas = random.nextInt(5) + 2; 
            String estado = "Disponible";
            boolean Vista_Mar = random.nextDouble() < 0.25; 
            String Mesero = meseros[random.nextInt(meseros.length)];
            mesas[i] = new Mesa(i + 1, Cantidad_Sillas, estado, Vista_Mar, Mesero);
        }

        while (true) {
            System.out.println("\n[Restaurante] / [Órdenes] / [Menú] / [Reportes] / [Salir]");
            String opcion = scanner.nextLine().trim().toLowerCase();

            if (opcion.equals("restaurante")) {
                System.out.println("____________________________");
                for (Mesa mesa : mesas) {
                    mesa.mostrarInfo();
                }
                System.out.println("____________________________");
            } else if (opcion.equals("salir")) {
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }
}