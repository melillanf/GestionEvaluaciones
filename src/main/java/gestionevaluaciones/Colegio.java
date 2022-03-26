/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionevaluaciones;
import java.io.*;
import java.util.*;
/**
 *
 * @author melil
 */
public class Colegio {
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Profesor> listaProfesores;

    public Colegio(ArrayList<Alumno> listaAlumnos, ArrayList<Profesor> listaProfesores) {
        this.listaAlumnos = listaAlumnos;
        this.listaProfesores = listaProfesores;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }
    
        
}

