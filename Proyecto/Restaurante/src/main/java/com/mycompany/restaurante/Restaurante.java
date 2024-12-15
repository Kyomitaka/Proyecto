/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;

import java.util.Scanner;

/**
 *
 * @author kiyomi
 */
public class Restaurante {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenidos al restaurante grupo 3");
            System.out.println("1: Mostrar estado de mesas");
            System.out.println("2: Gestionar menú");
            System.out.println("3: Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    restaurante.mostrarEstadoMesas();
                    break;
                case 2:
                    restaurante.getMenu().main(null); // Inicia el menú del restaurante
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Gracias por visitar el restaurante grupo 3. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        scanner.close();
    }
}
}