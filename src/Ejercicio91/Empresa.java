package Ejercicio91;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
    
    private List<Area> areas;

    public Empresa() {
        this.areas = new ArrayList<>();
    }

    public Empresa(List<Area> areas) {
        this.areas = areas;
    }

    public String perteneceArea(int numeroEmpleado) {
        try {
            for (Area area: areas) {
                if (area.pertenece(numeroEmpleado)) {
                return area.getNombre();
                }
            }
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return null;
    }

    public void registroEmpleado(Empleado empleado, Area area) {
        area.registro(empleado);
    }

    public void registroEmpleado(String nombre, String apellido, int numeroEmpleado, Area area) {
        area.registro(new Empleado(nombre, apellido, numeroEmpleado));
    }

    public void transferirEmpleado(int numeroEmpleado, Area areaTraslado) {
        for (Area area: areas) {
            try {
                if(area.pertenece(numeroEmpleado) && area != areaTraslado) {
                    for (Empleado empleado: area.getEmpleados()) {
                        if (empleado.getNumeroEmpleado() == numeroEmpleado) {
                            areaTraslado.registro(empleado);
                            area.baja(numeroEmpleado);
                            break;
                        }
                    }
                }
            }
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    public void bajaEmpleado(Empleado empleado) {
        for (Area area: areas) {
            if (area.pertenece(empleado.getNumeroEmpleado())) {
                area.baja(empleado);
            }
        }
    }

    public void bajaEmpleado(int numeroEmpleado) {
        for (Area area: areas) {
            if (area.pertenece(numeroEmpleado)) {
                area.baja(numeroEmpleado);
            }
        }
    }

    public void agregarArea(Area area) {
        areas.add(area);
    }

    public List<Area> getAreas() {
        return areas;
    }

    @Override
    public String toString() {
        String out = "";

        for (Area area: areas) {
            out += "\n-------------------------------\n" + area;
        }

        return out;
    }


}
