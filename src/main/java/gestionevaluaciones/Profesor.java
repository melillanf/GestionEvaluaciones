/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionevaluaciones;
import java.util.*;
/**
 *
 * @author melil
 */
public class Profesor {
    private String rut;
    private String nombre;
    private Asignatura ramoAsignado;

    public Profesor(String rut, String nombre, Asignatura ramoAsignado) {
        this.rut = rut;
        this.nombre = nombre;
        this.ramoAsignado = ramoAsignado;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura getRamoAsignado() {
        return ramoAsignado;
    }

    public void setRamoAsignado(Asignatura ramoAsignado) {
        this.ramoAsignado = ramoAsignado;
    }
    
    public void addPregunta(Pregunta question){
        this.getRamoAsignado().addPregunta(question);
    }
    
    public void addAlumno(Colegio mainColegio){
        Alumno nuevo = new Alumno();
        nuevo.crearAlumno();//Crea manualmente @ class Alumno
        this.getRamoAsignado().getListaAlumnos().put(nuevo.getRut(), nuevo);//Insercion nuevo alumno en la asignatura
        if(!mainColegio.getMapAlumnos().containsKey(nuevo.getRut())){//Verifica si el nuevo alumno existe dentro del colegio, si no esta lo guarda
            mainColegio.addAlumno(nuevo);
        }
    }
    
    public void eliminarPregunta(){
        Scanner lector = new Scanner(System.in);
        int id;
        System.out.println("A continuacion una lista de las preguntas almacenadas en su asignatura asignada: \n");
        this.ramoAsignado.mostrarPreguntas();
        System.out.println("Ingrese el id de la pregunta que desea eliminar: ");
        id = lector.nextInt();
        Pregunta auxEliminada = new Pregunta();
        auxEliminada = this.ramoAsignado.getBancoDePreguntas().remove(id);
        System.out.println("El enunciado de la pregunta eliminada era el siguiente:\n"+auxEliminada.getEnunciado());
    }
    
}
