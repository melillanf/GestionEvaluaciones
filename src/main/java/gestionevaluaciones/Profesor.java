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
    
}
