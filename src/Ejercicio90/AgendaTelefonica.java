package Ejercicio90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaTelefonica {
    
    private Map<String, List<String>> agenda;

    public AgendaTelefonica() {
        this.agenda = new HashMap<>();
    }

    public AgendaTelefonica(Map<String, List<String>> agenda) {
        this.agenda = agenda;
    }
    
    public String datos(String nombre) {
        return nombre + " -> " + agenda.get(nombre);
    }

    public void agregarIndividuo(String nombre, String direccion, String telefono) {
        List<String> dato = new ArrayList<>(Arrays.asList(direccion, telefono));

        agenda.put(nombre, dato);
    }

    public void eliminarIndividuo(String nombre) {
        agenda.remove(nombre);
    }

    @Override
    public String toString() {
        String out = "Agenda Telefonica\n-----------------\n";
        for(Map.Entry<String, List<String>> entry: agenda.entrySet()){
            out += entry.getKey() + " -> " + entry.getValue();
            out += "\n";
        }
        return out;
    }

    
}
