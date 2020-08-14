package modelos;
import java.util.ArrayList;
public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;
    private ArrayList<Paralelo> paralelos;
    //Calcula y devuelve la nota teorica
    public double notaTeorico(double nexamen, double ndeberes, double nlecciones) {
        return (nexamen + ndeberes + nlecciones) * 0.80;
    }
    //Devuelve true o false si esta dentro de ese paralelo
    public boolean isParalelo(Paralelo p) {
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                return true;
            }
        }
        return false;
    }
    //Calcula y devuelve la nota contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula.
    public double CalcularNota(Paralelo p, double notaTeorico, double ntalleres) {
        double nota = 0;
        if (isParalelo(p)) {
            double notaPractico = (ntalleres) * 0.20;
            nota = notaTeorico + notaPractico;
        }
        return nota;
    }
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p) {
        if (isParalelo(p)) {
            notaTotal = (p.getMateria().notaInicial + p.getMateria().notaFinal) / 2;
        }
        return notaTotal;
    }
}
