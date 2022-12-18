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
public class Animal {
    String nombre;
    String sonido;
    int extremidades;
    
    Animal(String nombre, String sonido, int extremidades){
        this.nombre = nombre;
        this.sonido = sonido;
        this.extremidades = extremidades;
    }
    
    void caminar(){
        System.out.println("El " + this.nombre + " camina con " + this.extremidades + " patas");
    }
    
    void comunicar(){
        System.out.println("El " + this.nombre + " se comunica con " + this.sonido);
    }
    
}

class Canino extends Animal{
    String especie;
    String tipoAnimal;
    
    Canino(String nombre, String sonido, int extremidades, String especie, String tipoAnimal){
        super(nombre,sonido,extremidades);
        this.especie = especie;
        this.tipoAnimal = tipoAnimal;
    }
    
    void describir(){
        System.out.println("El " + this.nombre + " es un animal " + tipoAnimal + " que pertenece a la especie " + this.especie);
    }
}

class Felino extends Animal{
    String especie;
    String tipoAnimal;
    
    Felino(String nombre, String sonido, int extremidades, String especie, String tipoAnimal){
        super(nombre,sonido,extremidades);
        this.especie = especie;
        this.tipoAnimal = tipoAnimal;
    }
    
    void describir(){
        System.out.println("El " + this.nombre + " es un animal " + tipoAnimal + " que pertenece a la especie " + this.especie);
    }
}

class Primate extends Animal{
    String especie;
    String tipoAnimal;
    
    Primate(String nombre, String sonido, int extremidades, String especie, String tipoAnimal){
        super(nombre,sonido,extremidades);
        this.especie = especie;
        this.tipoAnimal = tipoAnimal;
    }
    
    void describir(){
        System.out.println("El " + this.nombre + " es un animal " + tipoAnimal + " que pertenece a la especie " + this.especie);
    }
}

class Perro extends Canino{
    Perro(){
        super("Perro","Ladrido",4,"canino","doméstico");
    }
}

class Lobo extends Canino{
    Lobo(){
        super("Lobo","Aullido",4,"canino","salvaje");
    }
}

class Gato extends Felino{
    Gato(){
        super("Gato","Maullidos",4,"felino","doméstico");
    }
}

class Leon extends Felino{
    Leon(){
        super("León","Gruñidos",4,"felino","salvaje");
    }
}

class Chango extends Primate{
    Chango(){
        super("Chango","Gritos",4,"primate","salvaje");
    }
}

class Humano extends Primate{
    Humano(){
        super("Humano","Palabras",2,"primate","");
    }
}