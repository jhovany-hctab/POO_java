/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_coche;

import POO_fracciones.Fracciones;

/**
 *
 * @author hctab
 */
public class Main {
    public static void main (String [] args){
        
        //Coche coche = new Coche("4 cilindros",4,4);
        
        //coche.imprimir_argumentos();    
        
        Deportivo coche_deportivo = new Deportivo();
        
        coche_deportivo.acelerar();
        coche_deportivo.arrancar();
        coche_deportivo.frenar();
        
    }
}
