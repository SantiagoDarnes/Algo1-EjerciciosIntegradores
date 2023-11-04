package Ejercicio89;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Estantes
        Estante estante1 = new Estante();
        Estante estante2 = new Estante();
        Estante estante3 = new Estante();
        Estante estante4 = new Estante();
        List<Estante> estantes = new ArrayList<>(Arrays.asList(estante1, estante2, estante3, estante4));

        // Estanteria
        Estanteria estanteria = new Estanteria(estantes);
        
        // Libros
        List<String> autores = new ArrayList<>(Arrays.asList("Gabriel García Márquez", "Mario Vargas Llosa", "Jorge Luis Borges", "Isabel Allende", "Pablo Neruda", "Octavio Paz", "Julio Cortázar", "Federico García Lorca", "Miguel de Cervantes", "Javier Marías"));
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            String nombre = "Libro" + (i + 1);
            String autor = autores.get(random.nextInt(autores.size()));
            String editorial = "Editorial" + (i + 1);
            int anioPublicacion = random.nextInt(50) + 1970;
            Libro libro = new Libro(nombre, autor, editorial, anioPublicacion);
            Estante estante = estantes.get(random.nextInt(estantes.size()));
            estante.agregarLibro(libro);
        }

        System.out.println(estanteria);
    }

}
