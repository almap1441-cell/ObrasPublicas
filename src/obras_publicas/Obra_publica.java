/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obras_publicas;

/**
 *
 * @author rvale
 */
public class Obra_publica {
        private Edificios[] planos;
        private int contadorPlanos;
        private final int MAX_PLANOS = 10;

        public Obra_publica() {
            this.planos = new Edificios[MAX_PLANOS];
            this.contadorPlanos = 0;
        }
        
        // Crear un nuevo plano (Edificios)
        public Edificios crearPlano() {
            if (contadorPlanos < MAX_PLANOS) {
                Edificios nuevo = new Edificios();
                planos[contadorPlanos++] = nuevo;
                return nuevo;
            } else {
                System.out.println("No se pueden crear más planos.");
                return null;
            }
        }
        
        public Edificios getPlano(int numero) {
            if (numero <= 0 || numero > contadorPlanos) {
                return null;
            }
            return planos[numero - 1];
        }
        
        // Mostrar todos los planos y sus estructuras
        public void mostrarSistema() {
            System.out.println("=== SISTEMA DE OBRAS PÚBLICAS ===");
            for (int i = 0; i < contadorPlanos; i++) {
                planos[i].mostrarEdificios();
                System.out.println("-----------------------------");
        }
    }
}
