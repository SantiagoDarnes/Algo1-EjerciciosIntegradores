package Ejercicio92;

public class Producto {
    
    private String nombre;
    private Double precio;
    private int stock;

    public Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "[Producto: " + nombre + ", Precio: " + precio + ", Stock: " + stock + "]";
    }
}
