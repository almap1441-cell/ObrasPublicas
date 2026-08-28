package obras_publicas;

/**
 * Representa una casa.
 *
 * @author AlmaPalacios
 */
public class Casa extends Estructura {

    // Número de habitaciones de la casa
    private int numHabitaciones;

    // Constructor
    public Casa(
            int habitantes,
            double consumoElectrico,
            int numHabitaciones) {

        // Llamamos al constructor de Estructura
        super(habitantes, "Casa", consumoElectrico);

        this.numHabitaciones = numHabitaciones;
    }

    // Regresa el número de habitaciones
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    // Cambia el número de habitaciones
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    // POLIMORFISMO:
    // Una casa aumenta su consumo dependiendo
    // del número de habitaciones.
    @Override
    public double calcularConsumoTotal() {

        return getConsumoElectrico()
                + (numHabitaciones * 5);
    }

    // Muestra la información de la casa
    @Override
    public String toString() {

        return super.toString()
                + ", Habitaciones: "
                + numHabitaciones
                + ", Consumo total: "
                + calcularConsumoTotal();
    }
}