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
public class Alumno {//Esta clase no será utilizada aún 
   private String nombre;
   private String rut;
   private HashMap <String,ArrayList> notas = new HashMap<>();//Clave nombre de asignatura / almacena las notas de cada ramo

    public Alumno(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
    public Alumno(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public HashMap<String, ArrayList> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<String, ArrayList> notas) {
        this.notas = notas;
    }
   
    public void crearAlumno(){
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno:\n");
        String name = lector.nextLine();
        System.out.println("Ingrese el rut del alumno:\n");
        String run = lector.nextLine();
        this.setNombre(name);
        this.setRut(run);
        
    }
   

   
}
