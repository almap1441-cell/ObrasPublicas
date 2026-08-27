package obras_publicas;

/**
 * Representa una escuela.
 *
 * @author AlmaPalacios
 */
public class Escuelas extends Estructura {

    // Número de aulas de la escuela
    private int numAulas;

    // Constructor
    public Escuelas(
            int habitantes,
            double consumoElectrico,
            int numAulas) {

        // Llamamos al constructor de la clase padre
        super(habitantes, "Escuela", consumoElectrico);

        this.numAulas = numAulas;
    }

    // Regresa el número de aulas
    public int getNumAulas() {
        return numAulas;
    }

    // Cambia el número de aulas
    public void setNumAulas(int numAulas) {

        if (numAulas < 0) {
            throw new IllegalArgumentException(
                    "El número de aulas no puede ser negativo"
            );
        }

        this.numAulas = numAulas;
    }

    // POLIMORFISMO:
    // Cada aula aumenta el consumo eléctrico.
    @Override
    public double calcularConsumoTotal() {

        return getConsumoElectrico()
                + (numAulas * 15);
    }

    // Muestra la información de la escuela
    @Override
    public String toString() {

        return super.toString()
                + ", Aulas: "
                + numAulas
                + ", Consumo total: "
                + calcularConsumoTotal();
    }
}