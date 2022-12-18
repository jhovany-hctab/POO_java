/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_2;

/**
 *
 * @author hctab
 */
public class Mensajes {
    
    public String mensaje_1 = "Mensaje 1 es público";
    public String mensaje_2 = "Mensaje 2 es público";
    public String mensaje_3;
    
    public void imprimir_mensaje_secreto(int a){
        System.out.println("Mensaje secreto " + a +" es default");
    }
    
}
