package obras_publicas;

import java.util.Scanner;

/**
 * Clase principal del sistema de obras públicas.
 *
 * @author AlmaPalacios
 */
public class MainObras {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creamos el sistema principal
        Obra_publica sistema = new Obra_publica();

        int opcion = 0;

        do {

            System.out.println();
            System.out.println("MENU DE OBRAS PUBLICAS");
            System.out.println("1. Crear nuevo plano");
            System.out.println("2. Agregar estructura a un plano");
            System.out.println("3. Mostrar todos los planos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            // Verificamos que el usuario escriba un número
            if (!sc.hasNextInt()) {

                System.out.println(
                        "Debe ingresar un numero del 1 al 4."
                );

                sc.next();
                continue;
            }

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    // Creamos un nuevo plano
                    Edificios nuevo = sistema.crearPlano();

                    // Si el plano se creó correctamente,
                    // mostramos su número
                    if (nuevo != null) {

                        System.out.println(
                                "Plano creado correctamente."
                        );

                        System.out.println(
                                "Numero de plano: "
                                + nuevo.getNumEdificio()
                        );

                    } else {

                        // Este mensaje aparece cuando
                        // ya existen 10 planos
                        System.out.println(
                                "No fue posible crear el plano."
                        );
                    }

                    break;

                case 2:

                    // Pedimos el número del plano
                    System.out.print(
                            "Ingrese el numero de plano: "
                    );

                    // Verificamos que escriban un número
                    if (!sc.hasNextInt()) {

                        System.out.println(
                                "El numero de plano debe ser un numero entero."
                        );

                        sc.next();
                        break;
                    }

                    int numPlano = sc.nextInt();

                    // Verificamos que el número sea positivo
                    if (numPlano <= 0) {

                        System.out.println(
                                "El numero de plano debe ser mayor que cero."
                        );

                        break;
                    }

                    // Buscamos el plano
                    Edificios plano = sistema.getPlano(numPlano);

                    // Si no existe el plano mostramos un mensaje
                    if (plano == null) {

                        System.out.println(
                                "El plano no existe."
                        );

                        break;
                    }

                    // Pedimos la cantidad de habitantes
                    System.out.print("Habitantes: ");

                    if (!sc.hasNextInt()) {

                        System.out.println(
                                "Los habitantes deben ser un numero entero."
                        );

                        sc.next();
                        break;
                    }

                    int habitantes = sc.nextInt();

                    // Validamos que no sean negativos
                    if (habitantes < 0) {

                        System.out.println(
                                "Los habitantes no pueden ser negativos."
                        );

                        break;
                    }

                    // Pedimos el consumo eléctrico
                    System.out.print(
                            "Consumo electrico: "
                    );

                    if (!sc.hasNextDouble()) {

                        System.out.println(
                                "El consumo electrico debe ser un numero."
                        );

                        sc.next();
                        break;
                    }

                    double consumo = sc.nextDouble();

                    // Validamos que el consumo no sea negativo
                    if (consumo < 0) {

                        System.out.println(
                                "El consumo electrico no puede ser negativo."
                        );

                        break;
                    }

                    System.out.println();
                    System.out.println(
                            "Seleccione el tipo de estructura:"
                    );
                    System.out.println("1. Casa");
                    System.out.println("2. Escuela");
                    System.out.println("3. Oficina");
                    System.out.println("4. Hospital");
                    System.out.print("Opcion: ");

                    // Verificamos que sea un número
                    if (!sc.hasNextInt()) {

                        System.out.println(
                                "Debe seleccionar una opcion del 1 al 4."
                        );

                        sc.next();
                        break;
                    }

                    int tipo = sc.nextInt();

                    // Variable que guardará la estructura creada
                    Estructura nueva = null;

                    switch (tipo) {

                        case 1:

                            // Pedimos el número de habitaciones
                            System.out.print(
                                    "Numero de habitaciones: "
                            );

                            if (!sc.hasNextInt()) {

                                System.out.println(
                                        "El numero de habitaciones debe ser un entero."
                                );

                                sc.next();
                                break;
                            }

                            int habitaciones = sc.nextInt();

                            // Validamos el número de habitaciones
                            if (habitaciones < 0) {

                                System.out.println(
                                        "El numero de habitaciones no puede ser negativo."
                                );

                                break;
                            }

                            // Creamos una Casa
                            nueva = new Casa(
                                    habitantes,
                                    consumo,
                                    habitaciones
                            );

                            break;

                        case 2:

                            // Pedimos el número de aulas
                            System.out.print(
                                    "Numero de aulas: "
                            );

                            if (!sc.hasNextInt()) {

                                System.out.println(
                                        "El numero de aulas debe ser un entero."
                                );

                                sc.next();
                                break;
                            }

                            int aulas = sc.nextInt();

                            // Validamos el número de aulas
                            if (aulas < 0) {

                                System.out.println(
                                        "El numero de aulas no puede ser negativo."
                                );

                                break;
                            }

                            // Creamos una Escuela
                            nueva = new Escuelas(
                                    habitantes,
                                    consumo,
                                    aulas
                            );

                            break;

                        case 3:

                            // Pedimos el número de pisos
                            System.out.print(
                                    "Numero de pisos: "
                            );

                            if (!sc.hasNextInt()) {

                                System.out.println(
                                        "El numero de pisos debe ser un entero."
                                );

                                sc.next();
                                break;
                            }

                            int pisos = sc.nextInt();

                            // Validamos el número de pisos
                            if (pisos < 0) {

                                System.out.println(
                                        "El numero de pisos no puede ser negativo."
                                );

                                break;
                            }

                            // Creamos una Oficina
                            nueva = new Oficina(
                                    habitantes,
                                    consumo,
                                    pisos
                            );

                            break;

                        case 4:

                            // Pedimos el número de camas
                            System.out.print(
                                    "Numero de camas: "
                            );

                            if (!sc.hasNextInt()) {

                                System.out.println(
                                        "El numero de camas debe ser un entero."
                                );

                                sc.next();
                                break;
                            }

                            int camas = sc.nextInt();

                            // Validamos el número de camas
                            if (camas < 0) {

                                System.out.println(
                                        "El numero de camas no puede ser negativo."
                                );

                                break;
                            }

                            // Creamos un Hospital
                            nueva = new Hospital(
                                    habitantes,
                                    consumo,
                                    camas
                            );

                            break;

                        default:

                            // Si escriben una opción que no existe
                            System.out.println(
                                    "Tipo de estructura no valido."
                            );
                    }

                    // Si se creó correctamente la estructura,
                    // podemos asignarle el color de la fachada
                    if (nueva != null) {

                        System.out.print(
                                "Color de fachada (deje vacio para 'Blanco'): "
                        );

                        // Limpiamos el salto de línea que quedó
                        // después de utilizar nextInt()
                        sc.nextLine();

                        // Leemos el color escrito por el usuario
                        String color = sc.nextLine();

                        // Si escribió un color, lo asignamos
                        // mediante el setter
                        if (!color.trim().isEmpty()) {

                            nueva.setColorFachada(color);
                        }

                        // Agregamos la estructura al plano
                        plano.agregarEdificios(nueva);

                    } else {

                        // Si no se creó ninguna estructura
                        System.out.println(
                                "No se agrego ninguna estructura."
                        );
                    }

                    break;

                case 3:

                    // Mostramos todos los planos
                    sistema.mostrarSistema();

                    break;

                case 4:

                    // Mensaje de salida
                    System.out.println(
                            "Saliendo del sistema..."
                    );

                    break;

                default:

                    // Si escriben una opción que no existe
                    System.out.println(
                            "Opcion no valida. Seleccione una opcion del 1 al 4."
                    );
            }

        } while (opcion != 4);

        // Cerramos el Scanner
        sc.close();
    }
}
