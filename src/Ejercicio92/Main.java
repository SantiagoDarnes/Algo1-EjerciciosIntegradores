package Ejercicio92;

public class Main {
    public static void main(String[] args) {
        Producto agua = new Producto("agua", 23.4, 72);
        Producto leche = new Producto("leche", 17.2, 61);
        Producto cafe = new Producto("cafe", 38.9, 0);

        Inventario inventario = new Inventario();
        inventario.agregarProducto(agua);
        inventario.agregarProducto(leche);
        inventario.agregarProducto(cafe);

        inventario.venderProducto("agua", 72);
        System.out.println(agua.getStock());
        System.out.println("");

        System.out.println(inventario.valorInventario());
        System.out.println("");

        System.out.println(inventario.productosAgotados());
        System.out.println("");

        System.out.println(inventario.buscarProducto("leche"));
        System.out.println("");

        System.out.println(inventario);
    }
}