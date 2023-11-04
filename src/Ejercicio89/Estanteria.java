package Ejercicio89;

import java.util.List;
import java.util.ArrayList;

public class Estanteria {
    
    private List<Estante> estantes;

    public Estanteria() {
        this.estantes = new ArrayList<>();
    }

    public Estanteria(List<Estante> estantes) {
        this.estantes = estantes;
    }

    public void agregarEstante(Estante estante) {
        estantes.add(estante);
    }

    public void agregarEstante(List<Estante> estantes) {
        estantes.addAll(estantes);
    }

    public void agregarLibroEstante(Libro libro, Estante estante) {
        estante.agregarLibro(libro);
    }
    
    public void agregarLibroEstante(List<Libro> libros, Estante estante) {
        estante.agregarLibro(libros);
    }

    public void eliminarLibroEstante(Libro libro, Estante estante) {
        estante.eliminarLibro(libro);
    }
    
    public void eliminarLibroEstante(List<Libro> libros, Estante estante) {
        estante.eliminarLibro(libros);
    }

    public String buscarLibro(Libro libro) {
        int posicionEstante;
        int posicionLibro = 0;

        for (Estante estante: estantes) {
            
            if (estante.posicionLibro(libro) != -1) {

                posicionEstante = estantes.indexOf(estante) + 1;
                posicionLibro = estante.posicionLibro(libro);

                return "El libro '" + libro.getNombre() + "' se encuentra en el estante N°" + posicionEstante + 
                        ", en la posición " + posicionLibro;
            }
        }
        return "El libro '" + libro.getNombre() + "' no se encuentra en ningun estante";
    }

    public void listarLibros(Estante estanteFinal) {
        for (Estante estante: estantes) {
            if (estante != estanteFinal) {
                estanteFinal.agregarLibro(estante.getLibros());
                estante.eliminarLibro(estante.getLibros());
            }
        }
    }

    public Double edadPromedio(Estante estante) {
        return estante.promedio();
    }

    public String buscarLibroXAutor(String autor) {
        List<String> librosAutor = new ArrayList<>();

        for (Estante estante: estantes) {
            for (Libro libro: estante.getLibros()) {

                if (libro.getAutor() == autor) {
                    librosAutor.add(libro.getNombre());
                }
            }
        }
        return "Libros de " + autor + ": " + librosAutor.toString();
    }

    public void listarLibrosXAutor(String autor, Estante estanteFinal) {
        for (Estante estante: estantes) {
            List<Libro> aux = new ArrayList<>();
            if (estante != estanteFinal){
                for (Libro libro: estante.getLibros()) {

                    if (libro.getAutor() == autor) {
                        aux.add(libro);
                    }
                }
            }

            estanteFinal.agregarLibro(aux);
            estante.eliminarLibro(aux);
        }
    }

    @Override
    public String toString() {
        String renglon = "";
        for (Estante estante: estantes) {
            renglon += "Estante " + (estantes.indexOf(estante)+1) +": " + estante +"\n\n";
        }
        return renglon;
    }

    
}
