package Modulos;

import java.util.Objects;

public class Alumno implements Comparable {
    private int legajo;
    private String nombre;

    public Alumno(int legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int aux = 0;
        if (o instanceof Alumno) {
            Alumno miAlumno = (Alumno) o;
            if (miAlumno.getLegajo()>this.legajo)
            {
                aux = 1;
            } else if (miAlumno.getLegajo() == this.legajo) {
                aux = 0;
            } else {
                aux = -1;
            }
        }
        return aux;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return legajo == alumno.legajo && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo, nombre);
    }
}
