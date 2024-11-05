/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menurest;

/**
 *
 * @author Kevin A
 */

import javax.swing.JOptionPane;

public class MenuRest {
    private static double totalCuenta = 0;
    public static void main(String[] args) {
        int opcion;
        do {
            String menu = "*Menú*\n"
                        + "1. Comidas/Bebidas\n"
                        + "2. Hacer pedido\n"
                        + "3. Terminar orden\n"
                        + "4. Salir\n"
                        + "Seleccione una opción:";
            String input = JOptionPane.showInputDialog(menu);
            opcion = Integer.parseInt(input);
            switch (opcion) {
                case 1:
                    Menu();
                    break;
                case 2:
                    HacerPedido();
                    break;
                case 3:
                    Total_a_Pagar();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Vuelva pronto!!:3");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor intenta de nuevo.");
            }
            
        } while (opcion != 3 && opcion != 4);
    }
    
    public static void Menu() {
        String menuComidas = "*Menú*\n"
                           + "1. Hamburguesas - ₡2000\n"
                           + "2. Empanadas - ₡1000\n"
                           + "3. Gallos - ₡1500\n"
                           + "4. Bebida - ₡700\n";
        
        JOptionPane.showMessageDialog(null, menuComidas);
    }
    
    public static void HacerPedido() {
        String menuPedido = "Seleccione lo que quiere pedir:\n"
                           + "1. Hamburguesas - ₡2000\n"
                           + "2. Empanadas - ₡1000\n"
                           + "3. Gallos - ₡1500\n"
                           + "4. Bebida - ₡700\n";
        
        String inputProducto = JOptionPane.showInputDialog(menuPedido);
        int producto = Integer.parseInt(inputProducto);        
        switch (producto) {
            case 1:
                totalCuenta += 2000;
                JOptionPane.showMessageDialog(null, "Ha añadido una Hamburguesa a su pedido. Total: ₡" + totalCuenta);
                break;
            case 2:
                totalCuenta += 1000;
                JOptionPane.showMessageDialog(null, "Ha añadido una empanada a su pedido. Total: ₡" + totalCuenta);
                break;
            case 3:
                totalCuenta += 1500;
                JOptionPane.showMessageDialog(null, "Ha añadido un gallo a su pedido. Total: ₡" + totalCuenta);
                break;
            case 4:
                totalCuenta += 700;
                JOptionPane.showMessageDialog(null, "Ha añadido una Bebida a su pedido. Total parcial: ₡" + totalCuenta);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no valida, por favor intenta de nuevo.");
        }
    }
    
    public static void Total_a_Pagar() {
        JOptionPane.showMessageDialog(null, "El total a pagar es: ₡" + totalCuenta);
    }
}

