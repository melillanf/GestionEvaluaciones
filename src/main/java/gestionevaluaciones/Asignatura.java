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
    @SuppressWarnings("FieldMayBeFinal")
    private HashMap<Integer,Pregunta> bancoDePreguntas = new HashMap<>(); //Almacena todas las preguntas de la asignatura creada / key >=1
    @SuppressWarnings("FieldMayBeFinal")
    private HashMap<String, Alumno> listaAlumnos = new HashMap<>();//sera utilizado para obtener informacion de estadisticas, etc
    private String nombreAsignatura;
    
    public HashMap<Integer, Pregunta> getBancoDePreguntas() {
        return bancoDePreguntas;
    }
   
    public void mostrarPreguntas(){
        if(this.bancoDePreguntas.isEmpty()){//Verificar si hay preguntas almacenadas en el banco de preguntas
            System.out.println("No hay preguntas almacenadas de esta asignatura");
        }
        else{
            for(int i=0; i<this.bancoDePreguntas.size();i++){//Mostrar por pantalla el array
                System.out.println("ID: "+this.bancoDePreguntas.get(i).getIdPregunta()+"-"+this.bancoDePreguntas.get(i).getEnunciado()+"\n");
            }
        }
    }
    public void createAddPregunta(){//Crea y anhade una pregunta creada manualmente
        Pregunta aux = new Pregunta();
        aux.crearPregunta();
        aux.setIdPregunta(this.bancoDePreguntas.size()+1);
        this.bancoDePreguntas.put(aux.getIdPregunta(), aux);
    }
    public void addPregunta(Pregunta question){
        int idNueva = this.bancoDePreguntas.size();
        question.setIdPregunta(idNueva);
        this.bancoDePreguntas.put(question.getIdPregunta(),question);
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
    
    public Pregunta eliminarPregunta(int id){
        
        Pregunta auxEliminada = this.bancoDePreguntas.remove(id);
        return auxEliminada;
    }
    
    public void modPregunta(){
        System.out.println("Preguntas almacenadas en la asignatura: \n");
        this.mostrarPreguntas();
        System.out.println("Ingrese la id de la pregunta que desea modificar");
        Scanner lector = new Scanner(System.in);
        int id = lector.nextInt();
        Pregunta elegida = this.bancoDePreguntas.get(id);
        elegida.modPregunta();
    }
    public HashMap getListaAlumnos(){
        return this.listaAlumnos;
    }
    
    public String getNombreAsignatura(){
        return this.nombreAsignatura;
    }
    
    public void setNombreAsignatura(String name){
        this.nombreAsignatura = name;
    }
}
