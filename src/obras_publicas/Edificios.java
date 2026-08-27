package obras_publicas;

/**
 * Representa un plano que puede contener varias estructuras.
 *
 * @author AlmaPalacios
 */
public class Edificios {

    // Número que identifica al plano
    private int numEdificio;

    // Arreglo donde se guardan las estructuras del plano
    private Estructura[] edificios;

    // Indica cuántas estructuras tiene este plano
    private int contadorEstructuras;

    // Contador para asignar un número diferente a cada plano
    private static int contadorEdificios;

    // Cantidad máxima de estructuras por plano
    private static final int ESTRUCTURAS_MAX = 5;

    // Constructor
    public Edificios() {

        // Se asigna un número automático al plano
        this.numEdificio = ++Edificios.contadorEdificios;

        // Se crea el arreglo con espacio para 5 estructuras
        this.edificios = new Estructura[ESTRUCTURAS_MAX];

        // Al comenzar no hay estructuras
        this.contadorEstructuras = 0;
    }

    // Regresa el número del plano
    public int getNumEdificio() {
        return numEdificio;
    }

    // Agrega una estructura al plano
    public void agregarEdificios(Estructura estructura) {

        // Verificamos que todavía haya espacio
        if (contadorEstructuras < ESTRUCTURAS_MAX) {

            edificios[contadorEstructuras] = estructura;

            contadorEstructuras++;

            System.out.println("Estructura agregada correctamente.");

        } else {

            System.out.println(
                    "Se ha superado el límite de estructuras: "
                    + ESTRUCTURAS_MAX
            );

            System.out.println("La estructura no fue agregada.");
        }
    }

    // Calcula el consumo eléctrico total del plano
    public double Consumo() {

        double consumoTotal = 0;

        // Recorremos todas las estructuras que existen
        for (int i = 0; i < contadorEstructuras; i++) {

            // POLIMORFISMO:
            // Java utiliza el cálculo correspondiente
            // al tipo real de estructura.
            consumoTotal += edificios[i].calcularConsumoTotal();
        }

        return consumoTotal;
    }

    // Muestra la información del plano
    public void mostrarEdificios() {

        System.out.println("Plano #" + this.numEdificio);

        // Obtenemos el consumo total
        double consumoTotal = this.Consumo();

        System.out.println(
                "Consumo electrico total: "
                + consumoTotal
        );

        System.out.println("Estructuras implementadas:");

        // Mostramos cada estructura del plano
        for (int i = 0; i < contadorEstructuras; i++) {

            System.out.println(edificios[i]);
        }
    }
}