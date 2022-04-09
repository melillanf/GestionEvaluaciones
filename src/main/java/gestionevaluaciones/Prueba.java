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

    public Prueba(String tematica, int puntaje, int nota) {
        this.tematica = tematica;
        this.puntaje = puntaje;
        this.nota = nota;
        this.preguntas = new ArrayList<>();
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
