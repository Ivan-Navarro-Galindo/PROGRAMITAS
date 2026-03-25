package ejercicios;

import java.util.Arrays;

public class ArraysMetodos {


    public static void main(String[] args) {
//        int[] array = {3,7,-2,0,8};
//        mostrarArrayPantalla(array);
//        int[] arr ={3,7,-2,0,8};
//        String resultado = obtenerArrayComoString(arr);
//        System.out.println(resultado);
//        int[] arr = new int[6];
//        completarArray(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr = {5, 10, 15, 20,};
        int suma = obtenerSumaArray(arr);
        System.out.println(suma);
    }

    public static String obtenerArrayComoString(int[] arr) { //Devuelve cadena de Strings
        StringBuilder sb = new StringBuilder(); //Clase mutable para contruir cadenas de texto
        sb.append("["); //se agrega este caracter al principio
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]); //Se agrega a la cadena que estamos contruyendo
            if (i < arr.length - 1) {
                sb.append(","); //Si no es el último número se agrega ,
            }
        }
        sb.append("]"); //se agrega el caracter al final del String
        return sb.toString(); //
    }

    public static void mostrarArrayPantalla(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ","); //imprimimos con coma solo si no es el ultimo elemento
            } else {
                System.out.print(array[i]);
            }
        }
    }

    public static void completarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0){
//                System.out.println(i);
            arr[i] = i * 2; //Asigno el nuemro par en cada posición
        }
    }


    public static int obtenerSumaArray(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i]; //Sumar el valor de arr[i] al total de la suma
        }
        return suma; //Devolver la suma total
    }
}
