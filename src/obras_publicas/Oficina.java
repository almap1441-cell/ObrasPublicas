package obras_publicas;

/**
 * Representa un edificio de oficinas.
 *
 * @author AlmaPalacios
 */
public class Oficina extends Estructura {

    // Número de pisos de la oficina
    private int numPisos;

    // Constructor
    public Oficina(
            int habitantes,
            double consumoElectrico,
            int numPisos) {

        // Llamamos al constructor de la clase padre
        super(habitantes, "Oficina", consumoElectrico);

        this.numPisos = numPisos;
    }

    // Regresa el número de pisos
    public int getNumPisos() {
        return numPisos;
    }

    // Cambia el número de pisos
    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    // POLIMORFISMO:
    // Cada piso aumenta el consumo eléctrico.
    @Override
    public double calcularConsumoTotal() {

        return getConsumoElectrico()
                + (numPisos * 10);
    }

    // Muestra la información de la oficina
    @Override
    public String toString() {

        return super.toString()
                + ", Pisos: "
                + numPisos
                + ", Consumo total: "
                + calcularConsumoTotal();
    }
}