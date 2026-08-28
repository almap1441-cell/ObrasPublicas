package obras_publicas;

/**
 * Clase padre que representa una estructura de una obra pública.
 *
 * @author AlmaPalacios
 */
public class Estructura {

    // Número que identifica a cada estructura
    private final int numEstruc;

    // Contador utilizado para asignar números automáticamente
    private static int contadorEstructura;

    // Cantidad de habitantes de la estructura
    private int habitantes;

    // Tipo de estructura
    private String tipo;

    // Consumo eléctrico base
    private double consumoElectrico;

    // Color de la fachada
    private String colorFachada;

    // Constructor
    public Estructura(int habitantes, String tipo, double consumoElectrico) {

        // Se asigna un número diferente a cada estructura
        this.numEstruc = ++Estructura.contadorEstructura;

        this.habitantes = habitantes;
        this.tipo = tipo;
        this.consumoElectrico = consumoElectrico;

        // Color inicial
        this.colorFachada = "Blanco";
    }

    // Regresa el número de la estructura
    public int getNumEstruc() {
        return numEstruc;
    }

    // Regresa la cantidad de habitantes
    public int getHabitantes() {
        return habitantes;
    }

    // Regresa el tipo de estructura
    public String getTipo() {
        return tipo;
    }

    // Regresa el consumo eléctrico base
    public double getConsumoElectrico() {
        return consumoElectrico;
    }

    // Regresa el color de la fachada
    public String getColorFachada() {
        return colorFachada;
    }

    // Cambia la cantidad de habitantes
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    // Cambia el consumo eléctrico
    public void setConsumoElectrico(double consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    // Cambia el color de la fachada
    public void setColorFachada(String colorFachada) {
        this.colorFachada = colorFachada;
    }

    // Método que puede ser redefinido por las clases hijas
    public double calcularConsumoTotal() {
        return consumoElectrico;
    }

    // Muestra la información de la estructura
    @Override
    public String toString() {

        return "Edificio { #"
                + this.getNumEstruc()
                + ", Tipo: "
                + this.getTipo()
                + ", Consumo electrico: "
                + this.getConsumoElectrico()
                + ", Habitantes: "
                + this.getHabitantes()
                + ", Color de fachada: "
                + this.getColorFachada()
                + " }";
    }
}