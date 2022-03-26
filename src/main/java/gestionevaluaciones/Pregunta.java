/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionevaluaciones;

/**
 *
 * @author melil
 */
public class Pregunta {
    String enunciado;
    String[] alternativas;
    String respuesta;
    
    public Pregunta(String enunciado, String[] alternativas, String respuesta){
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respuesta = respuesta;
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
    
}
