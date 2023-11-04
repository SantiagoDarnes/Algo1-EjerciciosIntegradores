package Ejercicio85;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class JuegoEncastre {
    
    private List<Hueco> huecos;
    private List<Bloque> bloques;
    private int intentos;

    public JuegoEncastre(int cantidadHuecos) {
        this.huecos = new ArrayList<>(cantidadHuecos);
        this.bloques = new ArrayList<>(cantidadHuecos);
        this.intentos = 0;

        for (int i = 0; i < cantidadHuecos; i++) {
            
            double largo = Math.random() * 10;
            double ancho = Math.random() * 10;
            double profundidad = Math.random() * 10;

            Hueco hueco = new Hueco(largo, ancho, profundidad); 
            huecos.add(hueco);
            Bloque bloque = new Bloque(largo, ancho, profundidad);
            bloques.add(bloque);
        }

        Collections.shuffle(bloques);
    }

    public int jugar() {

        for (Bloque bloque: bloques) {
            
            for (Hueco hueco: huecos) {

                if (hueco.puedeColocarBloque(bloque)) {

                    huecos.remove(hueco);
                    intentos++;
                    break;
                }

                intentos++;
            }
        }

        return intentos;
    }
}
