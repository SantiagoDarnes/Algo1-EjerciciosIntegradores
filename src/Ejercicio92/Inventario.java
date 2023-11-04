package Ejercicio92;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    
    private List<Producto> inventario;

    public Inventario() {
        this.inventario = new ArrayList<>();
    }

    public Inventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }   

    public void venderProducto(String nombre, int cantidad) {
        for (Producto producto: inventario) {
            if (producto.getNombre() == nombre) {
                producto.setStock(producto.getStock() - cantidad);
            }
        }
    }

    public Double valorInventario() {
        Double total = 0.0;
        
        for (Producto producto: inventario) {
            total += producto.getPrecio() * producto.getStock();
        }
        return total;
    }

    public List<Producto> productosAgotados() {
        List<Producto> agotados = new ArrayList<>();

        for (Producto producto: inventario) {
            if(producto.getStock() == 0) {
                agotados.add(producto);
            }
        }
        return agotados;
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto: inventario) {
            if (producto.getNombre() == nombre) {
                return producto;
            }
        }return null;
    }

    @Override
    public String toString() {
        String out = "";

        for (int i = 0; i < inventario.size(); i++) {
            out += (i+1) + ". " + inventario.get(i) + "\n";
        }
        return out;
    }

}
