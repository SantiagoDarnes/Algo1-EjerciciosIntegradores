package Ejercicio85;

public class Hueco {
    
    private double largo;
    private double ancho;
    private double profundidad;

    public Hueco(double largo, double ancho, double profundidad) {
        this.largo = largo;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public boolean puedeColocarBloque(Bloque bloque) {
        return this.largo == bloque.getLargo() && this.ancho == bloque.getAncho() && this.profundidad == bloque.getAltura();
    }
}
