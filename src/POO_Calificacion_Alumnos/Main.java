/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_Calificacion_Alumnos;

/**
 *
 * @author hctab
 */
public class Main {
    
    public static void main (String [] args){
        Alumno a1 = new Alumno("Clara", "Ramos", "F34A024", 90);
        Alumno a2 = new Alumno("Jorge", "Rodriguez", "F27A031", 46);
        Alumno a3 = new Alumno("Ivan", "Hernandez", "F24A123", 71);
        Alumno a4 = new Alumno("Jazmin", "Peralta", "F30A078", 58);
        
        a1.imprimir_resultado();
        a2.imprimir_resultado();
        a3.imprimir_resultado();
        a4.imprimir_resultado();
        
    }
    
}
