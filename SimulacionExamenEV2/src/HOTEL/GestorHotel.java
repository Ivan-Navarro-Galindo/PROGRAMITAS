package HOTEL;

import java.util.ArrayList;

public class GestorHotel {

    //Atributos
    private ArrayList<Huesped> huespedes;
    private ArrayList<Empleado> empleados;

    //Construcor
    public GestorHotel(){
        huespedes = new ArrayList<>();
        empleados = new ArrayList<>();

    }

    //Añadir, obtner, eliminar yu modificar por indices

    public void addHuesped(Huesped huesped) throws Exception{
        if (huespedes.contains(huesped)) throw new Exception("El huesped ya existe");
        huespedes.add(huesped);
    }

    public void addEmpleado(Empleado empleado) throws Exception{
        if (empleados.contains(empleado)) throw new Exception("El empleado ya existe");
        empleados.add(empleado);
    }

    public Huesped getHuespedByIndex(int index) throws IndexOutOfBoundsException{
       return huespedes.get(index);
    }

    public Empleado getEmpleadoByIndex(int index) throws IndexOutOfBoundsException{
        return empleados.get(index);
    }

    public void removeHuespedByIndex(int index) throws IndexOutOfBoundsException{
        huespedes.remove(index);
    }

    public void removeEmpleadoByIndex(int index) throws IndexOutOfBoundsException{
        huespedes.remove(index);
    }

    public void setHuespedByIndex(int index, Huesped nuevoHuesped) throws IndexOutOfBoundsException{
        huespedes.set(index, nuevoHuesped);
    }

    public void setEmpleadoByIndex(int index, Empleado nuevoempleado) throws IndexOutOfBoundsException{
        empleados.set(index, nuevoempleado);
    }

    //Devolver todos

    public ArrayList<Huesped> getAllHuespedes(){
        return huespedes;
    }

    public ArrayList<Empleado> getAllEmpleados(){
        return empleados;
    }

    //Limpiar
    public void clearAll(){
        huespedes.clear();
        empleados.clear();
    }

    //Devolver valores en el arraylist

    public ArrayList<Huesped> PrecioMayorPorNoche(double precioMayor){
        ArrayList<Huesped> resultado = new ArrayList<>();

        for (Huesped h: huespedes){
            if (h.getPrecioPorNoche() > precioMayor);
            huespedes.add(h);
        }
        return resultado;
    }

    public ArrayList<Empleado> departamentoConcreto(String departamento){
        ArrayList<Empleado> resultado = new ArrayList<>();

        for (Empleado e : empleados){
            if (e.getDepartamento().equals(departamento))
                empleados.add(e);
        }
        return resultado;
    }

    public void removeHuesped(int i) {
    }
}
