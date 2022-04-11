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
public class Prueba {
    private ArrayList<Pregunta> preguntas;
    private String tematica;
    private int puntaje;
    private int nota;
    private Profesor profesorEncargado;
    private Alumno alumno;

    public Prueba(String tematica, int puntaje, int nota, Profesor profesorEncargado, Alumno alumno){
        this.tematica = tematica;
        this.puntaje = puntaje;
        this.nota = nota;
        this.profesorEncargado = profesorEncargado;
        this.alumno = alumno;
        this.preguntas = new ArrayList<>();
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Profesor getProfesorEncargado() {
        return profesorEncargado;
    }

    public void setProfesorEncargado(Profesor profesorEncargado) {
        this.profesorEncargado = profesorEncargado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    
    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
