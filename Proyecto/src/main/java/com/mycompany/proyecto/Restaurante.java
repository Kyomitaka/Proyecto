import java.util.Random;

// Clase principal que representa el restaurante y gestiona mesas y meseros
public class Restaurante {
    private Mesa[] mesas; 
    private Mesero[] meseros; 

    public Restaurante() {
        generarMeseros(); // Genera los mesers
        generarMesas(); // Genera las mesas aleatoriamente
        asignarMeseros(); // Asigna meseros a las mesas
    }

    // Método que genera mesas con propiedades aleatorias
    private void generarMesas() {
        Random rand = new Random();
        int numeroMesas = rand.nextInt(5) + 8; // Genera entre 8 y 12 mesas
        mesas = new Mesa[numeroMesas]; 

        for (int i = 0; i < numeroMesas; i++) {
            int cantidadSillas = rand.nextInt(5) + 2; // Genera entre 2 y 6 sillas
            boolean vistaAlMar = rand.nextInt(4) == 0; // 25% de probabilidad de vista al mar
            mesas[i] = new Mesa(i + 1, cantidadSillas, vistaAlMar); // Crea cada mesa con sus atributos
        }
    }

    
    private void generarMeseros() {
        meseros = new Mesero[4]; // Se crean 4 meseros
        String[] nombres = {"Kevin", "Kevin", "Kenneth", "Kyomi"};
        String[] apellidos = {"Perez", "Abarca", "Murillo", "Vargas"};
        String[] turnos = {"Mañana", "Tarde", "Noche"}; // Turnos posibles

        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            String nombreCompleto = nombres[i] + " " + apellidos[i]; // Asigna nombre completo
            String turno = turnos[rand.nextInt(3)]; // Asigna un turno aleatorio
            int idMesero = 1000 + i; 
            meseros[i] = new Mesero(idMesero, nombreCompleto, turno); // Crea el mesero
        }
    }

    // Metodo que asigna meseros a las mesas aleatoriamente
    private void asignarMeseros() {
        Random rand = new Random();
        for (Mesa mesa : mesas) {
            Mesero meseroAsignado = meseros[rand.nextInt(meseros.length)]; 
            mesa.setMeseroAsignado(meseroAsignado); // Asigna el mesero a la mesa
        }
    }

    // Metodo que muestra el estado de todas las mesas en la consola
    public void mostrarEstadoMesas() {
        for (Mesa mesa : mesas) {
            System.out.println("Mesa #" + mesa.getNumeroMesa());
            System.out.println("Cantidad de sillas: " + mesa.getCantidadSillas());
            System.out.println("Estado: " + (mesa.isEstado() ? "Ocupada" : "Disponible"));
            System.out.println("Vista al mar: " + (mesa.isVistaAlMar() ? "Sí" : "No"));
            System.out.println("Mesero asignado: " + mesa.getMeseroAsignado().getNombreCompleto());
            System.out.println("Turno del mesero: " + mesa.getMeseroAsignado().getTurno());
            System.out.println("-----------------------------");
        }
    }
}


