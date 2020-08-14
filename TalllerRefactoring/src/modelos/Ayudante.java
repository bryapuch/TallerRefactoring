package modelos;

import java.util.ArrayList;

public class Ayudante {
    protected Estudiante est;
    private ArrayList<Paralelo> paralelos;

    Ayudante(Estudiante e){
    	est = e;
    }
    public Estudiante getEstudiante(){
        return this.est;
    }
    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }
    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }
    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
