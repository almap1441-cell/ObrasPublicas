/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obras_publicas;

/**
 *
 * @author rvale
 */
public class Estructura {
    private final int numEstruc;
    private static int contadorEstructura;
    private int habitantes;
    private String tipo;
    private double consumoElectrico;
    
    //constructor
    public Estructura(int habitantes, String tipo,int consumo) {
        this.numEstruc = ++Estructura.contadorEstructura;
        this.habitantes = habitantes;
        this.tipo = tipo;
        this.consumoElectrico = consumo;
    }
    //getters
    public int getHabitantes() {return habitantes;}
    public String getTipo() {return tipo;}
    public int getNumEstruc() {return numEstruc;}
    public double getConsumoElectrico() {return consumoElectrico;}
    
    
    @Override
    public String toString(){
        return "Edificio { #"+this.getNumEstruc()
                +", Tipo: "+this.getTipo()
                +", Consumo electrico: "+ this.getConsumoElectrico()
                +", Habitantes: "+this.getHabitantes()+'}';
    }
}
