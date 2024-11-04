import java.util.Scanner; // importe scanner para leer  lo que marque el usuario

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada de la terminal

        // Mostrar el mensaje inicial y las opciones del menu
        System.out.println("Bienvenidos al restaurante grupo 3");
        System.out.println("Opción 1: Entrar");
        System.out.println("Opción 2: Salir");
        System.out.print("Seleccione una opción (1 o 2): ");

        // Leer lo que elija el usuario
        String opcion = scanner.nextLine();
        boolean continuar = true;

        while (continuar) {
            switch (opcion) {
                case "1":
                    // Crear una instancia del restaurante y mostrar el estado de las mesas
                    Restaurante restaurante = new Restaurante();
                    restaurante.mostrarEstadoMesas();
                    continuar = false; // Finalizar el bucle para no mostrar el menú nuevamente
                    break;

                case "2":
                    // Opción para salir del programa
                    System.out.println("Gracias por visitar el restaurante grupo 3. ¡Hasta pronto!");
                    continuar = false; // Finalizar el bucle
                    break;

                default:
                    // Mensaje si el usuario ingresa una opción inválida
                    System.out.println("Opción no válida, por favor seleccione 1 o 2.");
                    System.out.print("Seleccione una opción (1 o 2): ");
                    opcion = scanner.nextLine();
                    break;
            }
        }

        scanner.close(); 
    }
}
