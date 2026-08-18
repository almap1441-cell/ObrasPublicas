package obras_publicas;

import java.util.Scanner;

public class MainObras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Obra_publica sistema = new Obra_publica();

        int opcion;
        
        System.out.println("Maximo de planos 10\nMaximo de estructuras por plano 5");
        
        do {
            System.out.println("\n=== MENU OBRAS PUBLICAS ===");
            System.out.println("1. Crear nuevo plano");
            System.out.println("2. Agregar estructura a un plano");
            System.out.println("3. Mostrar todos los planos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1: {
                    // Crear un nuevo plano
                    Edificios nuevo = sistema.crearPlano();
                    if (nuevo != null) {
                        System.out.println("Plano creado correctamente.");
                    }
                    break;
                }

                case 2: {
                    // Agregar estructura a un plano
                    System.out.print("Ingrese el numero de plano: ");
                    int numPlano = sc.nextInt();

                    Edificios plano = sistema.getPlano(numPlano);
                    if (plano == null) {
                        System.out.println("El plano no existe.");
                        break;
                    }

                    System.out.print("Habitantes: ");
                    int hab = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    System.out.print("Tipo de estructura: ");
                    String tipo = sc.nextLine();

                    System.out.print("Consumo electrico: ");
                    int consumo = sc.nextInt();

                    Estructura nueva = new Estructura(hab, tipo, consumo);
                    plano.agregarEdificios(nueva);

                    break;
                }

                case 3: {
                    sistema.mostrarSistema();
                    break;
                }

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}

