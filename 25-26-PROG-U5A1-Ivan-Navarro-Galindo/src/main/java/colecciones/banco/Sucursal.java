package colecciones.banco;

import colecciones.banco.Cuenta;

import java.util.ArrayList;
import java.util.Iterator;

public class Sucursal {

    private ArrayList<Cuenta> lista = new ArrayList<>();

    public boolean alta(Cuenta cta) {
         if(cta == null) return false;
         return lista.add(cta);
    }

    public boolean anular(String numCuenta) {
        if(numCuenta == null )
            return false;
        return
        lista.removeIf(cuenta -> cuenta.getCuenta().equals(numCuenta) && cuenta.getSaldo() == 0);
   } // solo si saldo == 0

    public Cuenta buscarPorNumero(String numCuenta) {
        Iterator<Cuenta> iter = lista.iterator();

        while (iter.hasNext()) {

         Cuenta c = iter.next();

         //Buscamos la cuenta creando un iterador
         if(c.getCuenta().equals(numCuenta)){
             return c;
             }
     }

     return null;
    }

    public ArrayList<Cuenta> buscarPorNombre(String nombre) {
        ArrayList<Cuenta> resultado = new ArrayList<>();

        for (Cuenta c: lista) {
            if(c.getNombre().equals(nombre)){
                return resultado;
            }
        }
        return null;

    }

    public boolean modificar(Cuenta ctaActualizada) {

        for (int i = 0; i < lista.size(); i++) {
            //Buscamos la cuenta
            if (lista.get(i).getCuenta().equals(ctaActualizada.getCuenta())){
                //si la encomtramos actualizamos datos
                lista.set(i,ctaActualizada);
                return true;
            }

        }
        return false;

    }

    public ArrayList<Cuenta> listar() {
        return (lista);
    }
}