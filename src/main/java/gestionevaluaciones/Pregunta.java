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
public class Pregunta {
    private String enunciado; //Enunciado completo de la pregunta
    private ArrayList<String> alternativas; //Lista de alternativas
    private String respuesta;
    private String tematica; //Tematica de la pregunta - Ej en Matematicas: Algebra, geometria, etc.
    private int puntos; //Puntaje que asigna la pregunta, relacionado directamente a la dificultad de la misma 5pts: Facil - 10pts: Intermedio - 15pts: Dificil

    public Pregunta(String enunciado, String respuesta, String tematica, int puntos, ArrayList alternativas) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.tematica = tematica;
        this.puntos = puntos;
        this.alternativas = new ArrayList<>();
        this.alternativas.addAll(alternativas);
    }

    public ArrayList<String> getAlternativas() {
        return alternativas;
    }
    
    

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

   
}
