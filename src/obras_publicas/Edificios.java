/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obras_publicas;

/**
 *
 * @author rvale
 */
public class Edificios{
    private int numEdificio;
    private Estructura[] edificios;
    private static int contadorEstructuras;
    
    private static int contadorEdificios, ESTRUCTURAS_MAX=5;
    
    public Edificios(){
        //cada estructura guarda su numero y se aumenta para el siguiente
        this.numEdificio = ++Edificios.contadorEdificios;
        this.edificios = new Estructura[Edificios.ESTRUCTURAS_MAX];
    }
    
    public void agregarEdificios(Estructura estructura){
        //si al agregar un nuevo edifio al arreglo y se supera el maximo
        //se muestra el mensaje y se dejan de agregarlos
        if (contadorEstructuras < Edificios.ESTRUCTURAS_MAX) {
            this.edificios[contadorEstructuras++] = estructura; 
        }else{
            System.out.println("Se ha superado el limte de productos: " + Edificios.ESTRUCTURAS_MAX);
            System.out.println(estructura + " no fue agregado");
        }
    }
    
    public double Consumo(){
        //Se suma todo el consumo de los edificos colocados
        double consumoT = 0;
        for (int i = 0; i < contadorEstructuras; i++) {
            consumoT += this.edificios[i].getConsumoElectrico();
        }
        return consumoT;
    }
    
    public void mostrarEdificios(){
        //el diablo
        System.out.println("No. de plano #"+ this.numEdificio);
        //se obtiene el total usando el metodo
        double consumoT=this.Consumo();
        //para mas vellesa
        System.out.println("Consumo electrico total "+ consumoT);
        System.out.println("Edificios implemetados");
        //se recorre el arreglo actual y se muestra los productos guardados
        for (int i = 0; i < this.contadorEstructuras; i++) {
            System.out.println(this.edificios[i]);
        }
    }    
    
}
