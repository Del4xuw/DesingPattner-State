package main;
import reproductordemusica.ReproductorMusica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReproductorMusica reproductor = new ReproductorMusica();

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Reproducir");
            System.out.println("2. Pausar");
            System.out.println("3. Detener");
            System.out.println("4. Mostrar estado");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    reproductor.reproducir();
                    break;
                case 2:
                    reproductor.pausar();
                    break;
                case 3:
                    reproductor.detener();
                    break;
                case 4:
                    reproductor.mostrarEstado();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close(); // Importante cerrar el Scanner
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
