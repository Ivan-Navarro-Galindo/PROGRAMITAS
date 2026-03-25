package PRODUCTOS;

import BIBLIOTEXA.GestorBiblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorProductos {
    //Atributo

    private ArrayList<Producto> productos;



    public GestorProductos(){
        productos = new ArrayList<>();

    }


    public void addProducto(Producto p){
        if(productos.contains(p)){
            throw new IllegalArgumentException("Ya existe");
        }
        productos.add(p);
    }

    public Producto getProductoByCodigo(String codigo){

        for (Producto p: productos){
            if(p.getCodigo().equals(codigo))
                return p;
        }
        return null;
    }

    public void deleteProductoByCodigo(String codigo){

        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getCodigo().equals(codigo)){
                productos.remove(productos.get(i));
                return;
            }
        }
    }

    public int deleteProductosByCategoria(String categoria){
        int cantidadEliminados = 0;
        Iterator<Producto> it = productos.iterator();

        while(it.hasNext()){
            Producto p = it.next();
            if(p.getCategoria().equals(categoria)){
                it.remove();
                cantidadEliminados++;
            }
        }
        return cantidadEliminados;
    }

    public ArrayList<Producto> getProductosFilteredByStock(int stockMin){
        ArrayList<Producto> stock = new ArrayList<>();

        for (Producto p : productos){
            if(p.getStock() > stockMin){
                stock.add(p);
            }
        }
        return stock;
    }

    public ArrayList<Producto> getProductosByCategoria(String categoria){

        ArrayList<Producto> categorias = new ArrayList<>();

        for (Producto p : productos){
            if(p.getCategoria().equals(categoria)){
                categorias.add(p);
            }
        }
        return categorias;
    }

    public void updatePreciosCategoria(String categoria, double nuevoPrecio){

        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getCategoria().equals(categoria)){
                productos.get(i).setPrecio(nuevoPrecio);
            }
        }
    }

    public double getTotalStockValue(){
//        double suma = 0;
//        int stock = 0;
//
//        for (int i = 0; i < productos.size(); i++) {
//            suma +=  productos.get(i).getPrecio();
//            stock += productos.get(i).getStock();
//        }
//
//        return suma * stock;

        double total = 0;

        for (Producto p: productos){
            total += p.getPrecio() * p.getStock();
        }
        return total;
    }






}
