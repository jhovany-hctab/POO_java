/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_fracciones;

/**
 *
 * @author hctab
 */
public class Main {
    public static void main (String [] args){
        Fracciones fracciones = new Fracciones(4,2,5,3);
        fracciones.sumar();
        fracciones.restar();
        fracciones.multiplicar();
        fracciones.dividir();
        
    }
}
