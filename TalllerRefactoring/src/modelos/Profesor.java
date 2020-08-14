package modelos;

import java.util.ArrayList;

public class Profesor extends Persona {

    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
    private InformacionAdicionalProfesor info;
    private ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos = new ArrayList<>();
    }

    public void anadirParalelos(Paralelo p) {
        paralelos.add(p);
    }

    public double calcularSueldo(Profesor prof) {
        double sueldo = 0;
        sueldo = prof.info.getAñosdeTrabajo() * 600 + prof.info.getBonoFijo();
        return sueldo;
    }

}
