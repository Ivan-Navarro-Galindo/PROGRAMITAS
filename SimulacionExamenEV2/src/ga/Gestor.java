package ga;

import java.util.ArrayList;

public class Gestor {

    //Atributos
    private ArrayList<Comercial> comerciales;
    private ArrayList<Repartidor> repartidores;

    //Constructores


    public Gestor(){

        comerciales = new ArrayList<>();
        repartidores = new ArrayList<>();

    }

    //Añadir comercial

    public void addComercial(Comercial comercial) throws Exception{
        if (comerciales.contains(comercial)) throw new Exception("El comercial ya existe");
        comerciales.add(comercial);
    }

    //Añadir repartidor
    public void addRepartidor(Repartidor repartidor) throws Exception{
        if (repartidores.contains(repartidor)) throw new Exception("El repartidor ya existe");
        repartidores.add(repartidor);
    }

    //Obtener comercial por indice
    public Comercial getComercialByIndex(int index) throws IndexOutOfBoundsException{
        return comerciales.get(index);
    }
    //Obtener repartidor por indice
    public Repartidor getRepartidorByIndex(int index) throws IndexOutOfBoundsException{
        return repartidores.get(index);
    }

    //Eliminar ga.Comercial por Indice
    public void removeComercialByIndex(int index) throws IndexOutOfBoundsException{
        comerciales.remove(index);
    }

    //Eliminar ga.Repartidor por Indice
    public void removeRepartidorByIndex(int index) throws IndexOutOfBoundsException{
        repartidores.remove(index);
    }

    //Modificar comercial por indice
    public void setComercialByIndex(int index, Comercial nuevoComercial) throws IndexOutOfBoundsException{
        comerciales.set(index, nuevoComercial);
    }

    //Modificar repartidor por indice
    public void setRepartidorByIndex(int index, Repartidor nuevoRepartidor) throws IndexOutOfBoundsException{
        repartidores.set(index, nuevoRepartidor);
    }

    //Devolver Comerciales GETTER NORMAL
    public ArrayList<Comercial> getComercial(){
        return comerciales;
    }
    //Devolver Repartidores
    public ArrayList<Repartidor> getRepartidor(){
        return repartidores;
    }

    public void cleanComerciales(){
        comerciales.clear();
    }

    public void cleanRepartidores(){
        repartidores.clear();
    }

    public ArrayList<Repartidor> getRepartidoresByZone(String zona){
        ArrayList<Repartidor> repartidoresPorZona = new ArrayList<>();

        for (Repartidor repartidor : repartidores){
           if (repartidor.getZona().equals(zona)){
               repartidoresPorZona.add(repartidor);
           }
        }
        return repartidoresPorZona;
    }

    public ArrayList<Comercial> getComercialesByComision(double comison){
        ArrayList<Comercial> comercialPorComision = new ArrayList<>();

        for (Comercial comercial: comercialPorComision){
            if (comercial.getComision() == comison){
                comercialPorComision.add(comercial);
            }
        }
        return comercialPorComision;
    }



}
