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
public class Fracciones {
    int a;
    int b;
    int c;
    int d;
    
    Fracciones(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    void sumar(){
        int suma1 = (this.a*this.d)+(this.b*this.c);
        int suma2 = this.b*this.d;
        System.out.println("El resultado de la suma de fracciones: "+ suma1 + "/" + suma2);
    }
    
    void restar(){
        int resta1 = (this.a*this.d)-(this.b*this.c);
        int resta2 = this.b*this.d;
        System.out.println("El resultado de la resta de fracciones: "+resta1+"/"+resta2);
    }
    
    void multiplicar(){
        int multiplicacion1 = this.a*this.c;
        int multiplicacion2 = this.b*this.d;
        System.out.println("El resultado de la multiplicación de fracciones: "+multiplicacion1+"/"+multiplicacion2);
    }
    
    void dividir(){
        int division1 = this.a*this.d;
        int division2 = this.c*this.b;
        System.out.println("El resultado de la division de fracciones: "+division1+"/"+division2);
    }
}
