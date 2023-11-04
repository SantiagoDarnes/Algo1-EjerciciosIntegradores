package Ejercicio90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Map <String, List<String>> a = new HashMap<>();
        List<String> dato = new ArrayList<>(Arrays.asList("E. de Rosas 12", "11-5989-0300"));

        a.put("Santiago", dato);

        AgendaTelefonica agenda = new AgendaTelefonica(a);

        agenda.agregarIndividuo("Florencia", "JFK 298", "11-3423-4564");
        System.out.println(agenda);
    }
}
