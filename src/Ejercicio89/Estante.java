package Ejercicio89;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Estante {
    
    private List<Libro> libros;

    public Estante() {
        this.libros = new ArrayList<>();
    }

    public Estante(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarLibro(List<Libro> libros) {
        libros.addAll(libros);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public void eliminarLibro(List<Libro> libros) {
        libros.removeAll(libros);
    }

    public int posicionLibro(Libro libro) {

        if (libros.contains(libro)) {
            
            return libros.indexOf(libro) + 1;
        }
        else {
            return -1;
        }
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public Double promedio() {
        Double edades = 0.0;

        for (Libro libro: libros) {
            edades += Year.now().getValue() - libro.getAñoPublicacion();
        }

        return edades/libros.size();
    }

    public String toString() {
        String renglon = "";
        for (Libro libro: libros) {
            renglon += libro + " | ";
        }

        return renglon.substring(0, renglon.length() - 3);
    }

}
