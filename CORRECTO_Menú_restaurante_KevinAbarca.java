/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avance1;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Kevin A
 */
public class Avance1 {
    static class Platillo {
        int numero;
        String nombre;
        String descripcion;
        double precio;
        String tipo;

        public Platillo(int numero, String nombre, String descripcion, double precio, String tipo) {
            this.numero = numero;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return "Número del platillo #" + numero + " | Nombre: " + nombre + " | Descripción: " + descripcion +
                   " | Precio: ₡" + precio + " | Tipo: " + tipo;
        }
    }

    private static ArrayList<Platillo> platillos = new ArrayList<>();
    private static int nextPlatilloNumber = 300;

    public static void main(String[] args) {
        precargarPlatillos();
        int opcion = -1;

        do {
            try {
                String menu = "Menú:\n"
                            + "1- Mostrar menú\n"
                            + "2- Agregar platillo\n"
                            + "3- Editar platillo\n"
                            + "4- Eliminar platillo\n"
                            + "5- Salir\n"
                            + "Seleccione una opción:";
                String input = JOptionPane.showInputDialog(menu);

                // Validación de entrada vacía o cancelada
                if (input == null) {
                    opcion = 5; // salir si se cancela
                } else {
                    opcion = Integer.parseInt(input);
                }

                switch (opcion) {
                    case 1:
                        mostrarMenu();
                        break;
                    case 2:
                        agregarPlatillo();
                        break;
                    case 3:
                        editarPlatillo();
                        break;
                    case 4:
                        eliminarPlatillo();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Gracias por visitar nuestro restaurante de mariscos.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número.");
            }
        } while (opcion != 5);
    }

    private static void precargarPlatillos() {
        platillos.add(new Platillo(nextPlatilloNumber++, "Ceviche de pescado", "Ceviche fresco con pescado blanco marinado en limón, culantro y cebolla.", 3500, "ENTRADA"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Camarones al ajillo", "Camarones salteados en una mezcla de ajo y especias.", 4500, "ENTRADA"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Sopa de mariscos", "Sopa con una mezcla de mariscos frescos y especias tradicionales.", 5000, "SOPA"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Casado de pescado", "Plato típico con pescado, arroz, frijoles, ensalada y plátano maduro.", 4000, "PLATILLO_PRINCIPAL"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Arroz con camarones", "Arroz con camarones frescos, pimientos y especias.", 5500, "PLATILLO_PRINCIPAL"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Filete de corvina", "Filete de corvina a la plancha con salsa de limón y mantequilla.", 6000, "PLATILLO_PRINCIPAL"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Tacos de pescado", "Tacos suaves rellenos de pescado frito con salsa de aguacate y repollo.", 3500, "ENTRADA"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Calamares fritos", "Calamares empanizados y fritos, servidos con salsa tártara.", 3200, "ENTRADA"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Pasta con mariscos", "Pasta con mariscos en una cremosa salsa de ajo y vino blanco.", 7500, "PLATILLO_PRINCIPAL"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Churchill", "Churchill tradicional del puerto", 5000, "ENTRADA"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Parrillada de mariscos", "Variedad de mariscos a la parrilla con vegetales.", 9000, "PLATILLO_PRINCIPAL"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Pescado entero frito", "Pescado entero frito servido con arroz y ensalada.", 5500, "PLATILLO_PRINCIPAL"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Coctel de camarones", "Camarones servidos con salsa especial", 3000, "ENTRADA"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Flan de coco", "Flan suave con sabor a coco, servido frío.", 2000, "POSTRE"));
        platillos.add(new Platillo(nextPlatilloNumber++, "Bebida natural de horchata", "Refrescante bebida natural de horchata hecha en casa.", 1200, "BEBIDA"));
    }

    private static void mostrarMenu() {
        System.out.println("Menú de Platillos:");
        for (Platillo platillo : platillos) {
            System.out.println(platillo);
        }
    }

    private static void agregarPlatillo() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del platillo:");
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del platillo:");
        double precio;

        while (true) {
            String precioInput = JOptionPane.showInputDialog("Ingrese el precio del platillo (IVA incluido):");
            try {
                precio = Double.parseDouble(precioInput);
                if (precio >= 0) break;
                else JOptionPane.showMessageDialog(null, "El precio debe ser positivo. Inténtelo de nuevo.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida para el precio. Intente nuevamente.");
            }
        }

        String[] tipos = {"ENTRADA", "SOPA", "POSTRE", "PLATILLO PRINCIPAL", "BEBIDA"};
        int tipoIndex = JOptionPane.showOptionDialog(null, "Seleccione el tipo de platillo:", "Tipo", 
                          JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
        String tipo = tipos[tipoIndex];

        Platillo nuevoPlatillo = new Platillo(nextPlatilloNumber++, nombre, descripcion, precio, tipo);
        platillos.add(nuevoPlatillo);
        JOptionPane.showMessageDialog(null, "Platillo agregado correctamente\n" + nuevoPlatillo);
    }

    private static void editarPlatillo() {
        // Implementación de editarPlatillo aquí
    }

    private static void eliminarPlatillo() {
        // Implementación de eliminarPlatillo aquí
    }
}

