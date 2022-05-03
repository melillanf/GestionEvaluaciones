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
    private ArrayList<String> alternativas = new ArrayList<>(); //Lista de alternativas
    private String respuesta;
    private String tematica; //Tematica de la pregunta - Ej en Matematicas: Algebra, geometria, etc.
    private int puntos; //Puntaje que asigna la pregunta, relacionado directamente a la dificultad de la misma 5pts: Facil - 10pts: Intermedio - 15pts: Dificil
    private int idPregunta; //id provisto por la clase asignatura

    public Pregunta(String enunciado, String respuesta, String tematica, int puntos, ArrayList alternativas) {//Constructor
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.tematica = tematica;//Excluido de momento
        this.puntos = puntos;
        this.alternativas = new ArrayList<>();
        this.alternativas.addAll(alternativas);
    }

    public Pregunta(){
    //Esto sirve para poder usar la funcion crearPregunta y createAddPregunta @ Asignatura
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
    
    public void setAlternativas(ArrayList opciones){//Reemplazo de alternativas
        this.alternativas.clear();
        this.alternativas.addAll(opciones);
    }
    
    public void setIdPregunta(int id){
        this.idPregunta = id;
    }
    public int getIdPregunta(){
        return this.idPregunta;
    }
    
    public void showAlternativas(){
        for(int i = 0;i<this.alternativas.size();i++){
            System.out.println((i+1)+" "+this.alternativas.get(i)+"\n");
        }
    }
    public void crearPregunta(){//Creacion manual de Pregunta
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escriba el enunciado de la pregunta:/n");//Obtener y almacenar los componentes de la Pregunta
        String auxEnunciado = lector.nextLine();
        System.out.println("Agregue las alternativas a continuacion:/nOpcion 1: ");
        String alternativa1 = lector.nextLine();
        System.out.println("Opcion 2:/n");
        String alternativa2 = lector.nextLine();
        System.out.println("Opcion 3:/n");
        String alternativa3 = lector.nextLine();
        System.out.println("Escriba la respuesta correcta de la pregunta:/n");
        String correcta = lector.nextLine();
        System.out.println("Ingrese la tematica asociada a la asignatura:/n");
        String unidad = lector.nextLine();
        System.out.println("Ingrese el puntaje de la pregunta:/n(5pts: facil / 10pts = intermedia / 15pts = dificil)/n");
        int puntaje = lector.nextInt();
        
        ArrayList<String> opciones = new ArrayList<>();//Agregar las alternativas al Array
        opciones.add(alternativa1);
        opciones.add(alternativa2);
        opciones.add(alternativa3);            
        this.setEnunciado(auxEnunciado);
        this.setPuntos(puntaje);
        this.setRespuesta(correcta);
        this.setTematica(unidad);
        this.setAlternativas(opciones);
    }
   
    public void modPregunta(){
        boolean flag = true;
        Scanner lector = new Scanner(System.in);
        int opc;
        do{
            System.out.println("Elija una de las opciones que desee modificar: \n");
            System.out.println("1- Enunciado");
            System.out.println("2- Alternativas");
            System.out.println("3- Tematica");
            System.out.println("4- Puntaje");
            System.out.println("0- Salir");
            opc = lector.nextInt();
            switch(opc){
                case 1: {//Mod Enunciado
                    System.out.println("Enunciado actual: "+this.getEnunciado());//Muestra x pantalla el enunciado actual de la pregunta
                    System.out.println("Ingrese el nuevo enunciado: \n");
                    String nuevoEnunciado = lector.nextLine();//Obtiene el nuevo enunciado
                    this.setEnunciado(nuevoEnunciado);//Establece el nuevo enunciado
                    System.out.println("Nuevo enunciado : "+this.getEnunciado());//Mostrar x pantalla
                    break;
                }
                case 2:{//Mod Alternativas
                    System.out.println("Alternativas actuales: \n");//Mostrar alternativas
                    this.showAlternativas();
                    System.out.println("Ingrese las nuevas alternativas: ");
                    ArrayList<String> nuevasAlternativas = new ArrayList<>();
                    for(int i=0;i<this.alternativas.size();i++){//Ingresar las nuevas alternativas
                       nuevasAlternativas.add(lector.nextLine());
                    }
                    this.setAlternativas(nuevasAlternativas);//Set nuevas alternativas
                    break;
                }
                case 3:{//Mod Tematica
                    System.out.println("Tematica actual: \n"+this.getTematica());
                    System.out.println("Ingrese la nueva tematica: \n");
                    String nuevaTematica = lector.nextLine();
                    this.setTematica(nuevaTematica);
                    break;
                }
                case 4:{//Mod puntaje
                    System.out.println("Puntaje actual: \n"+this.getPuntos());
                    System.out.println("Ingrese el nuevo puntaje: \n");
                    int nuevoPuntaje = lector.nextInt();
                    this.setPuntos(nuevoPuntaje);
                    break;
                }
                case 0:{
                    flag = false;
                    break;
                }
            }
        }while(flag);
    }
}
