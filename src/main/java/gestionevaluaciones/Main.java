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
        //creando pregunta de Lenguaje
        ArrayList<String> alternativasLeng = new ArrayList<>();
        alternativasLeng.add("Tomate");
        alternativasLeng.add("Sonrisa");
        alternativasLeng.add("Felicidad");
        String enunciadoLeng = "Que termino no esta relacionado con la palabra 'Alegria'?";
        String respuestaLeng = "Tomate";
        String tematicaLeng = "Sinonimos";
        int puntos = 5;
        Pregunta preguntaLeng = new Pregunta(enunciadoLeng, respuestaLeng, tematicaLeng, puntos, alternativasLeng);
        lenguaje.addPregunta(preguntaLeng);
        //creando pregunta Historia
        ArrayList<String> alternativasHist = new ArrayList<>();
        alternativasHist.add("1991");
        alternativasHist.add("1820");
        alternativasHist.add("1962");
        String enunciadoHist = "En que anio se se desarrollo el Mundial de Futbol en Chile?";
        String respuestaHist = "1962";
        String tematicaHist = "Sucesos historicos de Chile";
        Pregunta preguntaHist = new Pregunta(enunciadoHist, respuestaHist, tematicaHist, puntos, alternativasHist);
        historia.addPregunta(preguntaHist);
        //HashMap mapAlumnos
        Alumno estudiante1 = new Alumno("Francisco Huaiquipan","5.131.266-6","8vo A");
        Alumno estudiante2 = new Alumno("Santiago Muñez","7.771.313-0", "8vo B");
        mainColegio.addAlumno(estudiante1);
        mainColegio.addAlumno(estudiante2);
        //HashMap mapProfesor
        Profesor profe1 = new Profesor("1.336.818-0", "Pep Guardiola", historia);
        Profesor profe2 = new Profesor("3.449.188-7", "Peineta Garces", lenguaje);
        //Menu
        int op= 99;
        Scanner lector = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Menu Principal\n");
        System.out.println("Bienvenido/a\n");
        System.out.println("Elige una opcion:\n");
        do{
            System.out.println("1.Crear pregunta y almacenarla");//Elegir en que asignatura se almacenara            
            System.out.println("2.Mostrar preguntas");//Mostrar preguntas almacenadas en el banco por criterio
            System.out.println("3.Buscar alumno");//Mostrar alumnos almacenados en Colegio por criterio
            System.out.println("4.Guardar alumno");//Almacenar alumno
            op = lector.nextInt();
            switch(op){
                case 1:{//Crear y almacenar pregunta
                    System.out.println("Escriba el enunciado de la pregunta:/n");
                    String auxEnunciado = lector.nextLine();
                    System.out.println("Agregue las alternativas a continuacion:/nOpcion 1: ");
                    String alternativa1 = lector.nextLine();
                    System.out.println("Opcion 2:/n");
                    String alternativa2 = lector.nextLine();
                    System.out.println("Opcion 3:/n");
                    String alternativa3 = lector.nextLine();
                    System.out.println("Escriba la respuesta correcta de la pregunta:/n");
                    String correcta = lector.nextLine();
                    ArrayList<String> alternativas = new ArrayList<>();
                    alternativas.add(alternativa1);
                    alternativas.add(alternativa2);
                    alternativas.add(alternativa3);
                    
                    
                    System.out.println("Ingrese la asignatura asociada: /n");
                    String asignatura = lector.nextLine();
                    System.out.println("Ingrese la tematica asociada a la asignatura:/n");
                    String tematica = lector.nextLine();
                    System.out.println("Ingrese el puntaje de la pregunta:/n(5pts: facil / 10pts = intermedia / 15pts = dificil)/n");
                    int puntaje = lector.nextInt();
                    
                    Pregunta nueva = new Pregunta(auxEnunciado, correcta,tematica, puntaje, alternativas);
                    if(asignatura.equals("lenguaje")){
                        lenguaje.addPregunta(nueva);
                    }
                    if(asignatura.equals("historia")){
                        historia.addPregunta(nueva);
                    }
                    break;
                    
                    
                    
                }
                case 2:{//Mostrar preguntas dependiendo el criterio: asignatura especifica o todas
                    System.out.println("Seleccione el criterio: 1.-Todas 2.-Historia 3.-Lenguaje");
                    int opc1 = lector.nextInt();
                    switch(opc1){
                        case 1:{
                            
                            
                            for(int i=0;i<historia.getBancoDePreguntas().size();i++){//Proceso de asignatura Historia
                                ArrayList<Pregunta> auxHistoria = new ArrayList<>();                                                            
                                auxHistoria.addAll(historia.getBancoDePreguntas());    
                                Pregunta auxPregunta = auxHistoria.get(i); 
                                System.out.println("Enunciado:\n"+auxPregunta.getEnunciado()+"\n");
                                System.out.println("Alternativa 1: "+auxPregunta.getAlternativas().get(0)+"\n");
                                System.out.println("Alternativa 2: "+auxPregunta.getAlternativas().get(1)+"\n");
                                System.out.println("Alternativa 3: "+auxPregunta.getAlternativas().get(2)+"\n");
                                System.out.println("Asignatura: Historia");
                                System.out.println("Tematica: "+auxPregunta.getTematica()+"\n");
                            }
                            for(int i=0;i<lenguaje.getBancoDePreguntas().size();i++){//Proceso de asignatura Lenguaje
                                ArrayList<Pregunta> auxLenguaje = new ArrayList<>();                                                            
                                auxLenguaje.addAll(lenguaje.getBancoDePreguntas());    
                                Pregunta auxPregunta = auxLenguaje.get(i); 
                                System.out.println("Enunciado:\n"+auxPregunta.getEnunciado()+"\n");
                                System.out.println("Alternativa 1: "+auxPregunta.getAlternativas().get(0)+"\n");
                                System.out.println("Alternativa 2: "+auxPregunta.getAlternativas().get(1)+"\n");
                                System.out.println("Alternativa 3: "+auxPregunta.getAlternativas().get(2)+"\n");
                                System.out.println("Asignatura: Lenguaje\n");
                                System.out.println("Tematica: "+auxPregunta.getTematica()+"\n");
                                System.out.println("Puntaje: "+auxPregunta.getPuntos()+"\n");
                               
                            }
                            break;
                        }
                        case 2:{
                            for(int i=0;i<historia.getBancoDePreguntas().size();i++){//Proceso de asignatura Historia
                                ArrayList<Pregunta> auxHistoria = new ArrayList<>();                                                            
                                auxHistoria.addAll(historia.getBancoDePreguntas());    
                                Pregunta auxPregunta = auxHistoria.get(i); 
                                System.out.println("Enunciado:\n"+auxPregunta.getEnunciado()+"\n");
                                System.out.println("Alternativa 1: "+auxPregunta.getAlternativas().get(0)+"\n");
                                System.out.println("Alternativa 2: "+auxPregunta.getAlternativas().get(1)+"\n");
                                System.out.println("Alternativa 3: "+auxPregunta.getAlternativas().get(2)+"\n");
                                System.out.println("Asignatura: Historia");
                                System.out.println("Tematica: "+auxPregunta.getTematica()+"\n");
                            }
                            break;
                        }
                        case 3:{
                            for(int i=0;i<lenguaje.getBancoDePreguntas().size();i++){//Proceso de asignatura Lenguaje
                                ArrayList<Pregunta> auxLenguaje = new ArrayList<>();                                                            
                                auxLenguaje.addAll(lenguaje.getBancoDePreguntas());    
                                Pregunta auxPregunta = auxLenguaje.get(i); 
                                System.out.println("Enunciado:\n"+auxPregunta.getEnunciado()+"\n");
                                System.out.println("Alternativa 1: "+auxPregunta.getAlternativas().get(0)+"\n");
                                System.out.println("Alternativa 2: )"+auxPregunta.getAlternativas().get(1)+"\n");
                                System.out.println("Alternativa 3: "+auxPregunta.getAlternativas().get(2)+"\n");
                                System.out.println("Asignatura: Lenguaje\n");
                                System.out.println("Tematica: "+auxPregunta.getTematica()+"\n");
                                System.out.println("Puntaje: "+auxPregunta.getPuntos()+"\n");                             
                            }
                            break;
                        }
                    }
                }
                case 3:{//Buscar alumno hashmap de Colegio
                    System.out.println("Seleccione el criterio de busqueda: 1-Mostrar alumnos de un curso 2-Buscar alumno especifico por RUT\n");
                    int opcx = lector.nextInt();
                    if(opcx == 1){
                        Scanner lectoraux = new Scanner(System.in);
                        System.out.println("Ingrese el curso que quiere mostrar: \n");
                        String auxCurso = lectoraux.nextLine();
                        mainColegio.searchAlumno(auxCurso);   
                        break;
                    }
                    if(opcx == 2){
                        mainColegio.searchAlumno();
                        break;
                    }
                }
                case 4:{//Crear y guardar alumno en hashmap de Colegio
                    System.out.println("Nombre y Apellido: ");
                    String nombre = lector.nextLine();
                    System.out.println("\n");
                    System.out.println("RUT: ");
                    String rut = lector.nextLine();
                    System.out.println("\n");
                    System.out.println("Curso: ");
                    String curso = lector.nextLine();
                    System.out.println("\n");
                    break;
                }
            }
        }while(op!=0);
        


    }
}
