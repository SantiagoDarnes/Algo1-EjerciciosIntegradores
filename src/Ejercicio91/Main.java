package Ejercicio91;

public class Main {
    public static void main(String[] args) {
        
        Empleado santi = new Empleado("Santiago", "Darnes Pallitto", 7345);
        Empleado flor = new Empleado("Florencia", "Montti", 8322);
        Empleado tomi = new Empleado("Tomas", "Gomez", 1883);
        Empleado gonza = new Empleado("Gonzalo", "Jara", 7623);


        Area marketing = new Area("Marketing", 213);
        marketing.registro(santi);
        marketing.registro(flor);

        Area finanzas = new Area("Finanzas", 634);
        finanzas.registro(tomi);
        finanzas.registro(gonza);
        
        Empresa hsjdd = new Empresa();
        hsjdd.agregarArea(marketing);
        hsjdd.agregarArea(finanzas);


        hsjdd.registroEmpleado("Victoria", "Arrudi", 9102, marketing);
        hsjdd.transferirEmpleado(santi.getNumeroEmpleado(), finanzas);
        hsjdd.bajaEmpleado(santi);

        System.out.println(hsjdd);
    
    }
}
