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
public class Alumno {
    String nombre;
    String apellido;
    String matricula;
    int calificacion;
    
    Alumno(String nombre, String apellido, String matricula, int calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }
    
    void imprimir_resultado(){
        String alumno = "Alumn@: " + this.nombre+ " Apellido: " + this.apellido + "Matrícula:" + this.matricula;
        String mensajeReprobado = " Tu calificación no es aprobatoria. Te sugerimos estudies nuevamente los temas vistos.";
        String mensajeAprobado = " Bien echo tu calificación es aprobatoria.";
        String mensajeExcelente = " Felicidades tu calificación es excelente!!";
        if (this.calificacion < 70) {
            System.out.println(alumno +"\n"+ mensajeReprobado);
        }else if(this.calificacion >=70 && this.calificacion<90){
            System.out.println(alumno +"\n"+ mensajeAprobado);
        }else {
            System.out.println(alumno +"\n"+ mensajeExcelente);
        }
    }
}
