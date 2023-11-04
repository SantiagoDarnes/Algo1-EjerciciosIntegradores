package Ejercicio91;

import java.util.List;
import java.util.ArrayList;

public class Area {
    
    private String nombre;
    private int codigoArea;
    private List<Empleado> empleados;

    public Area() {
        this.empleados = new ArrayList<>();
    }

    public Area(String nombre, int codigoArea) {
        this.nombre = nombre;
        this.codigoArea = codigoArea;
        this.empleados = new ArrayList<>();
    }

    public Area(String nombre, int codigoArea, List<Empleado> empleados) {
        this.nombre = nombre;
        this.codigoArea = codigoArea;
        this.empleados = empleados;
    }

    public boolean pertenece(Empleado empleado) {
        return empleados.contains(empleado);
    }

    public boolean pertenece(int numeroEmpleado) {
        for (Empleado empleado: empleados) {
            if (empleado.getNumeroEmpleado() == numeroEmpleado) {
                return true;
            }
        } return false;
    }

    public void registro(Empleado empleado) {
        empleados.add(empleado);
    }


    public void baja(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void baja(int numeroEmpleado) {
        for (Empleado empleado: empleados) {
            if (empleado.getNumeroEmpleado() == numeroEmpleado) {
                empleados.remove(empleado);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        String out = "Area: " + nombre + ", Codigo: " + codigoArea + "\n";
        for (int i = 0; i < empleados.size(); i++){
            out += (i+1) + ". " + empleados.get(i).toString() + "\n";
        }
        return out;
    }

    
}
