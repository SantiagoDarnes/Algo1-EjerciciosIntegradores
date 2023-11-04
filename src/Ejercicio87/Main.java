package Ejercicio87;

public class Main {
    public static void main(String[] args) {
        
        MazoPoker mazo = new MazoPoker();

        mazo.mostrarMazo();
        System.out.println("------------------");

        mazo.barajar();
        mazo.mostrarMazo();
        System.out.println("------------------");

        mazo.ordenarPorPalo(Palo.CORAZON, Palo.PICA, Palo.TREBOL, Palo.DIAMANTE);
        mazo.mostrarMazo();
        
    }
}
