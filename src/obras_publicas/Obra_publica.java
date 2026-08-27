/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obras_publicas;

/**
 *
 * @author AlmaPalacios
 */
public class Obra_publica {
   // Arreglo donde se almacenan los planos creados
    private Edificios[] planos;

    // Indica cuántos planos se han creado
    private int contadorPlanos;

    // Cantidad máxima de planos permitidos
    private final int MAX_PLANOS = 10;

    // Constructor
    public Obra_publica() {
        this.planos = new Edificios[MAX_PLANOS];
        this.contadorPlanos = 0;
    }

    // Crea un nuevo plano si todavía hay espacio
    public Edificios crearPlano() {

        if (contadorPlanos < MAX_PLANOS) {

            Edificios nuevo = new Edificios();

            // Se guarda el nuevo plano en el arreglo
            planos[contadorPlanos] = nuevo;

            contadorPlanos++;

            return nuevo;

        } else {

            System.out.println("No se pueden crear más planos.");
            return null;
        }
    }

    // Busca un plano por su número
    public Edificios getPlano(int numero) {

        // Verificamos que el número del plano sea válido
        if (numero <= 0 || numero > contadorPlanos) {
            return null;
        }

        // Los arreglos empiezan en 0,
        // por eso restamos 1 al número del plano
        return planos[numero - 1];
    }

    // Muestra todos los planos registrados
    public void mostrarSistema() {

        System.out.println("SISTEMA DE OBRAS PUBLICAS");

        // Recorremos solamente los planos que existen
        for (int i = 0; i < contadorPlanos; i++) {

            planos[i].mostrarEdificios();

            System.out.println();
        }
    }
}