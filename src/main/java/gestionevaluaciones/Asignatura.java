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
public class Asignatura {
    private ArrayList<Pregunta> bancoDePreguntas; //Almacena todas las preguntas de la asignatura creada
    
    public Asignatura(){
        this.bancoDePreguntas = new ArrayList<Pregunta>();
    }

    public ArrayList<Pregunta> getBancoDePreguntas() {
        return bancoDePreguntas;
    }
   
    public void mostrarPreguntas(){
        if(this.bancoDePreguntas.isEmpty()){//Verificar si hay preguntas almacenadas en el banco de preguntas
            System.out.println("No hay preguntas almacenadas de esta asignatura");
        }
        else{
            for(int i=0; i<this.bancoDePreguntas.size();i++){//Mostrar por pantalla el array
                System.out.println(this.bancoDePreguntas.get(i).getEnunciado()+"\n");
            }
        }
    }
    
    public void addPregunta(Pregunta question){
        this.bancoDePreguntas.add(question);
    }
    //Sobrecarga de busqueda de preguntas
    public void buscarPreguntas(String tematica){
         if(this.bancoDePreguntas.isEmpty()){ //Verificacion inicial 
            System.out.println("No hay preguntas almacenadas de esta asignatura");
            return;
        }
         int cont = 0;//testing purposes
         for(int i = 0;i<this.bancoDePreguntas.size();i++){//Recorrido del array de Preguntas
             if(this.bancoDePreguntas.get(i).getTematica().equals(tematica)){//Verificacion que sea del mismo tema que se esta buscando
                 cont++;
                 System.out.println("\n"+this.bancoDePreguntas.get(i).getEnunciado());//Mostrar en pantalla
                 System.out.println("\n"+this.bancoDePreguntas.get(i).getTematica());//Mostrar en pantalla
             }
         }
         
    }
    
    public void buscarPregunta(int puntaje){//Reminder: puntaje equivale a dificultad
        if(this.bancoDePreguntas.isEmpty()){ //Verificacion inicial 
            System.out.println("No hay preguntas almacenadas de esta asignatura");
            return;
        }
         int cont = 0;//testing purposes
         for(int i = 0;i<this.bancoDePreguntas.size();i++){//Recorrido del array de Preguntas
             if(this.bancoDePreguntas.get(i).getPuntos()==puntaje){//Verificacion que sea del mismo puntaje/dificultad
                 cont++;
                 System.out.println("\n"+this.bancoDePreguntas.get(i).getEnunciado());//Mostrar en pantalla
                 System.out.println("\nPuntaje/Dificultad"+this.bancoDePreguntas.get(i).getPuntos());//Mostrar en pantalla
             }
         } 
    }

    Collection<? extends Pregunta> getBancoDePreguntas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
