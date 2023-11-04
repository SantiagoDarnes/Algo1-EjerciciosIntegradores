package Ejercicio87;

    
public class Carta implements Comparable<Carta> {

    private Palo palo;
    private String valor;

    public Carta(Palo palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public int compareTo(Carta otraCarta) {
        // Orden personalizado para las cartas
        int paloComparacion = this.palo.compareTo(otraCarta.getPalo());
        if (paloComparacion != 0) {
            return paloComparacion;
        } else {
            return this.valor.compareTo(otraCarta.getValor());
        }
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
