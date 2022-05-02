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
public class Main {
    public static void main(String[] args) {
        //Variables y datos iniciales
        Colegio mainColegio = new Colegio();
        Asignatura lenguaje = new Asignatura();
        Asignatura historia = new Asignatura();
        Profesor profe1 = new Profesor("1.336.818-0", "Pep Guardiola", historia);
        Profesor profe2 = new Profesor("3.449.188-7", "Peineta Garces", lenguaje);
        
        //HashMap mapAlumnos
        Alumno estudiante1 = new Alumno("Francisco Huaiquipan","5.131.266-6");
        Alumno estudiante2 = new Alumno("Santiago Muñez","7.771.313-0");
        mainColegio.addAlumno(estudiante1);
        mainColegio.addAlumno(estudiante2);
        //HashMap mapProfesor
        mainColegio.addProfesor(profe1);
        mainColegio.addProfesor(profe2);
        //Preguntas iniciales
        String enunciado1 = "Elija el sinonimo de la palabra: Feliz";
        ArrayList<String> alternativas1 = new ArrayList();
        alternativas1.add("Enojado");
        alternativas1.add("Blindado");
        alternativas1.add("Contento");
        String respuesta1 = "Contento";
        String tematica1 = "Sinonimos";
        int puntos1 = 5;
        Pregunta question1 = new Pregunta(enunciado1, respuesta1, tematica1, puntos1, alternativas1);
        String enunciado2 = "Elija el sinonimo de la palabra: Maldad";
        ArrayList<String> alternativas2 = new ArrayList();
        alternativas2.add("Locura");
        alternativas2.add("Malicia");
        alternativas2.add("Belleza");
        String respuesta2 = "Malicia";
        String tematica2 = "Sinonimos";
        int puntos2 = 5;
        Pregunta question2 = new Pregunta(enunciado2, respuesta2, tematica2, puntos2, alternativas2);
        profe1.addPregunta(question1);
        profe1.addPregunta(question2);
        //Agregar al mainColegio
        mainColegio.addAlumno(estudiante2);
        mainColegio.addAlumno(estudiante1);
        mainColegio.addProfesor(profe1);
        mainColegio.addProfesor(profe2);
        //Menu
        int op= 99;
        Scanner lector = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Menu Principal\n");
        System.out.println("Bienvenido/a\n");
        System.out.println("Elija una opcion de ingreso:\n");//El menu principal se divide en 2 vistas
        boolean flag = true;
        do{
            Scanner lector1 = new Scanner(System.in);
            System.out.println("1.Profesor");//En esta opcion se pueden agregar, buscar, eliminar y mostrar preguntas de la Asignatura asignada al profesor     
            System.out.println("2.Estudiante");//En esta opcion el alumno puede desarrollar las pruebas y ver sus notas
            System.out.println("0.Salir");
            op = lector.nextInt();
            switch(op){
                case 1:{//Vista Profesor add, create, delete n show
                    boolean flaggy = true;
                    do{
                        System.out.println("Ingrese su rut: \n");
                        String rutProfe = lector1.nextLine();
                        Profesor admin = mainColegio.getMapProfesor().get(rutProfe);
                        System.out.println("Bienvenido profesor "+admin.getNombre()+"\n");
                        System.out.println("Menu Profesores: \n");
                        System.out.println("Elija una opcion: \n1. Agregar alumno a su Asignatura\n");
                        System.out.println("2. Crear pregunta\n");
                        System.out.println("3. Mostrar preguntas almacenadas\n");
                        System.out.println("4. Eliminar pregunta\n");
                        System.out.println("5. Modificar pregunta\n");
                        System.out.println("0. Salir\n");
                        int option = lector1.nextInt();
                        
                        switch(option){
                            case 1:{//Agregar manualmente Alumno
                                admin.addAlumno(mainColegio);
                                break;
                            }
                            case 2:{//Crear pregunta manualmente
                                admin.getRamoAsignado().createAddPregunta();
                                break;
                            }
                            case 3:{//Mostrar preguntas almacenadas de la Asignatura
                                admin.getRamoAsignado().mostrarPreguntas();
                                break;
                            }
                            case 4:{//Eliminar pregunta almacenada
                                admin.eliminarPregunta();
                                break;
                        }
                            case 5:{//Mod pregunta almacenada
                            admin.getRamoAsignado().modPregunta();
                        }
                        case 0:{//Salir
                        flaggy = false;
                        break;
                        }
                    }
                    }while(flaggy);    
                }
                case 2:{//Vista Alumno hacer prueba y ver notas
                    
                }
                case 0:{
                   flag = false;
                }
                
            }                                                                          
             
        }while(flag);
        


    }
}
