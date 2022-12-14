/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_coche;

/**
 *
 * @author hctab
 */
public class Coche {
    
    String motor;
    int puertas;
    int ruedas;
    
    Coche(String motor, int puertas, int ruedas){
        System.out.println("El objeto coche inicializa con argumentos");
        this.motor = motor;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }
    
    void imprimir_argumentos(){
        System.out.println("El coche tiene motor de " + this.motor +
                " con " + this.puertas + " puertas y " +
                this.ruedas + " ruedas.");
    }
    
    void arrancar(){
        System.out.println("El coche arranca.");
    }
    
    void frenar(){
        System.out.println("El coche frena.");
    }
    
    void acelerar(){
        System.out.println("El coche acelera.");
    }
    
}
