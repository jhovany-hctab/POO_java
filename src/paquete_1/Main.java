/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_1;

import paquete_2.Mensajes;
import paquete_2.Secretos;

/**
 *
 * @author hctab
 */
public class Main {
    public static void main (String [] args){
        Mensajes mensajes = new Mensajes();
        Secretos secretos = new Secretos();
        
        System.out.println(mensajes.mensaje_1);
        System.out.println(mensajes.mensaje_2);
        System.out.println();
        
        mensajes.imprimir_mensaje_secreto(1);
        mensajes.imprimir_mensaje_secreto(2);
        System.out.println();
        
        secretos.imprimir_secreto(1);
        secretos.imprimir_secreto(2);
        
    }
}
