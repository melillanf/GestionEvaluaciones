/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionevaluaciones;

import java.util.ArrayList;

/**
 *
 * @author melil
 */
public class Alumno {//Esta clase no será utilizada aún 
   private String nombre;
   private String rut;
   private String curso;//Ej: 8vo A, 8vo B, 8vo C, etc

    public Alumno(String nombre, String rut, String curso) {
        this.nombre = nombre;
        this.rut = rut;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
   
}
