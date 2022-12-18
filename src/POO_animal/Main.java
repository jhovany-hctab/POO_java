/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_animal;

/**
 *
 * @author hctab
 */
public class Main {
    public static void main(String [] args){
        Perro perro = new Perro();
        Lobo lobo = new Lobo();
        Gato gato = new Gato();
        Leon leon = new Leon();
        Chango chango = new Chango();
        Humano humano = new Humano();
        
        perro.caminar();
        perro.comunicar();
        perro.describir();
        System.out.println();
        
        lobo.caminar();
        lobo.comunicar();
        lobo.describir();
        System.out.println();
        
        gato.caminar();
        gato.comunicar();
        gato.describir();
        System.out.println();
        
        leon.caminar();
        leon.comunicar();
        leon.describir();
        System.out.println();
        
        chango.caminar();
        chango.comunicar();
        chango.describir();
        System.out.println();
        
        humano.caminar();
        humano.comunicar();
        humano.describir();
        System.out.println();
    }
    
}
