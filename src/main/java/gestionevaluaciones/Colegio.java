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
    private HashMap<String, Alumno> mapAlumnos;
    private HashMap<String, Profesor> mapProfesor;

    public HashMap<String, Alumno> getMapAlumnos() {
        return mapAlumnos;
    }

    public void setMapAlumnos(HashMap<String, Alumno> mapAlumnos) {
        this.mapAlumnos = mapAlumnos;
    }

    public HashMap<String, Profesor> getMapProfesor() {
        return mapProfesor;
    }

    public void setMapProfesor(HashMap<String, Profesor> mapProfesor) {
        this.mapProfesor = mapProfesor;
    }
    
    
    public Colegio(){
        this.mapAlumnos = new HashMap<>();
        this.mapProfesor = new HashMap<>();
    }
    
    public void addAlumno(Alumno student){//Agregar alumno sin necesidad de pasar por parametro el rut
        this.mapAlumnos.put(student.getRut(), student);
    }
    
    public void addProfesor(Profesor teacher){
        this.mapProfesor.put(teacher.getRut(), teacher);
    }
    
    public void removeAlumno(String rut){
        this.mapAlumnos.remove(rut);
    }
    
    public void removeProfesor(String rut){
        this.mapProfesor.remove(rut);
    }
    //Sobrecarga en busqueda de alumno
    public void searchAlumno(){//Busqueda por rut
        String rut;
        Scanner lector = new Scanner(System.in);
       
        System.out.println("Ingrese el RUT del alumno:/n"); 
        rut = lector.nextLine();
        if(!this.mapAlumnos.containsKey(rut)){
            System.out.println("No se encuentra el estudiante indicado/n");
            return;
        }
        Alumno aux = this.mapAlumnos.get(rut);
        System.out.println("Nombre del alumno:/n"+aux.getNombre());
    }
    
    public void crearReporte(){
                            try{
                        System.out.println("Creando reporte");
                        BufferedWriter escritorBw;
                        File reporte = new File("reporte.txt");
                        FileWriter w = new FileWriter(reporte);
                        BufferedWriter bw = new BufferedWriter(w);
                        PrintWriter wr = new PrintWriter(bw);
                        if(!reporte.exists()){//Verificar si el archivo no existe
                            reporte.createNewFile();//Se crea
                        }
                        Set<String> keysProfesores = this.mapProfesor.keySet();
                        Set<String> keysAlumnos = this.mapAlumnos.keySet();
                        int contReport = 0;
                        for(String key:keysProfesores){
                            Profesor auxProfesor = mapProfesor.get(key);
                            wr.write("Nombre profesor: "+auxProfesor.getNombre()+"\n RUT: "+auxProfesor.getRut()+"Asignatura: "+auxProfesor.getRamoAsignado().getNombreAsignatura());
                            Set<Integer> keysPreguntas = auxProfesor.getRamoAsignado().getBancoDePreguntas().keySet();
                            System.out.println("Preguntas almacenadas en la asignatura: \n");
                            for(int id:keysPreguntas){
                                Pregunta auxPregunta = auxProfesor.getRamoAsignado().getBancoDePreguntas().get(id);
                                wr.write("Enunciado: "+auxPregunta.getEnunciado());
                                wr.write("Tematica: "+auxPregunta.getTematica());
                                wr.write("Puntaje: "+auxPregunta.getPuntos());
                                for(int i=0;i<auxPregunta.getAlternativas().size();i++){
                                String auxAlternativa = auxPregunta.getAlternativas().get(i);
                                wr.write("Alternativa "+i+": "+auxAlternativa);
                                }
                            }
                            wr.write("/////////////////////////////\n");
                            contReport++;//TESTING
                        } 
                        for(String key:keysAlumnos){
                               Alumno auxAlumno = this.mapAlumnos.get(key);
                               wr.write("Nombre: "+auxAlumno.getNombre()+" /RUT: "+auxAlumno.getRut()+"\n");
                               wr.write("/////////////////////////////\n");
                            }
                        wr.close();
                        bw.close();
                        System.out.println("Reporte creado exitosamente");
                    }
                    catch(IOException dou){
                    }
    }
    
    
}
