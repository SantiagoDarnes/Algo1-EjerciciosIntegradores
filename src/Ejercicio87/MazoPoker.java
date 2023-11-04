package Ejercicio87;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MazoPoker {
 
    private List<Carta> cartas;

    public MazoPoker() {
        cartas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 10; i++) {
                cartas.add(new Carta(palo, Integer.toString(i)));
            }
            cartas.add(new Carta(palo, "J"));
            cartas.add(new Carta(palo, "Q"));
            cartas.add(new Carta(palo, "K"));
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> sacarCartasDeArriba(int cantidad) {
        List<Carta> cartasSacadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            if (!cartas.isEmpty()) {
                cartasSacadas.add(cartas.remove(0));
            }
        }
        return cartasSacadas;
    }

    public List<Carta> sacarCartasDeAbajo(int cantidad) {
        List<Carta> cartasSacadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            if (!cartas.isEmpty()) {
                cartasSacadas.add(cartas.remove(cartas.size() - 1));
            }
        }
        return cartasSacadas;
    }

    public void colocarCartasArriba(List<Carta> cartasNuevas) {
        cartas.addAll(0, cartasNuevas);
    }

    public void colocarCartasAbajo(List<Carta> cartasNuevas) {
        cartas.addAll(cartasNuevas);
    }

    public void ordenarPorPalo(Palo palo1, Palo palo2, Palo palo3, Palo palo4) {
        Collections.sort(cartas);

        List<Carta> palo1Cartas = new ArrayList<>();
        List<Carta> palo2Cartas = new ArrayList<>();
        List<Carta> palo3Cartas = new ArrayList<>();
        List<Carta> palo4Cartas = new ArrayList<>();

        for (Carta carta: cartas) {

            if (carta.getPalo() == palo1) {
                palo1Cartas.add(carta);
            }
            else if (carta.getPalo() == palo2) {
                palo2Cartas.add(carta);
            }
            if (carta.getPalo() == palo3) {
                palo3Cartas.add(carta);
            }
            else {
                palo4Cartas.add(carta);
            }
        }

        cartas.clear();
        cartas.addAll(palo1Cartas);
        cartas.addAll(palo2Cartas);
        cartas.addAll(palo3Cartas);
        cartas.addAll(palo4Cartas);

    }

    public void mostrarMazo() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
