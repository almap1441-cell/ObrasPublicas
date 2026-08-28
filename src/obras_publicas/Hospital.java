package obras_publicas;

/**
 * Representa un hospital.
 *
 * @author AlmaPalacios
 */
public class Hospital extends Estructura {

    // Número de camas del hospital
    private int numCamas;

    // Constructor
    public Hospital(
            int habitantes,
            double consumoElectrico,
            int numCamas) {

        // Llamamos al constructor de la clase padre
        super(habitantes, "Hospital", consumoElectrico);

        this.numCamas = numCamas;
    }

    // Regresa el número de camas
    public int getNumCamas() {
        return numCamas;
    }

    // Cambia el número de camas
    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    // POLIMORFISMO:
    // Cada cama aumenta el consumo eléctrico.
    @Override
    public double calcularConsumoTotal() {

        return getConsumoElectrico()
                + (numCamas * 20);
    }

    // Muestra la información del hospital
    @Override
    public String toString() {

        return super.toString()
                + ", Camas: "
                + numCamas
                + ", Consumo total: "
                + calcularConsumoTotal();
    }
}