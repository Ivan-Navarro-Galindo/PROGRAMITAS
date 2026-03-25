package ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysMetodosTest {

    // --- obtenerArrayComoString ---
    // Comprueba que devuelve "[]" para un array vacío
    @Test
    void testObtenerArrayComoString1() {
        int[] arr = {};
        String resultado = ArraysMetodos.obtenerArrayComoString(arr);
        assertEquals("[]", resultado);
    }

    // Comprueba que devuelve el formato correcto para un solo elemento
    @Test
    void testObtenerArrayComoString2() {
        int[] arr = {42};
        String resultado = ArraysMetodos.obtenerArrayComoString(arr);
        assertEquals("[42]", resultado);
    }

    // --- completarArray ---
    // Comprueba que un array de tamaño 1 se rellena con 0
    @Test
    void testCompletarArray1() {
        int[] arr = new int[1];
        ArraysMetodos.completarArray(arr);
        assertArrayEquals(new int[]{0}, arr);
    }

    // Comprueba que el último elemento de un array grande es correcto
    @Test
    void testCompletarArray2() {
        int[] arr = new int[10];
        ArraysMetodos.completarArray(arr);
        assertEquals(18, arr[9]);
    }

    // --- obtenerSumaArray ---
    // Comprueba suma con valores negativos
    @Test
    void testObtenerSumaArray1() {
        int[] arr = {-5, -10, -15};
        int suma = ArraysMetodos.obtenerSumaArray(arr);
        assertEquals(-30, suma);
    }

    // Comprueba suma con array vacío
    @Test
    void testObtenerSumaArray2() {
        int[] arr = {};
        int suma = ArraysMetodos.obtenerSumaArray(arr);
        assertEquals(0, suma);
    }

    // --- arrayPotencias2 ---
    // Comprueba que devuelve 3 potencias correctas
    @Test
    void testArrayPotencias21() {
        int[] potencias = ArraysMetodos.arrayPotencias2(3);
        assertArrayEquals(new int[]{4, 8, 16}, potencias);
    }

    // Comprueba que devuelve array vacío si el parámetro es 0
    @Test
    void testArrayPotencias22() {
        int[] potencias = ArraysMetodos.arrayPotencias2(0);
        assertArrayEquals(new int[]{}, potencias);
    }

    // --- concatenarStringArray ---
    // Comprueba concatenación con espacios y mayúsculas
    @Test
    void testConcatenarStringArray1() {
        String[] arr = {"Hola", " ", "MUNDO"};
        String resultado = ArraysMetodos.concatenarStringArray(arr);
        assertEquals("Hola MUNDO", resultado);
    }

    // Comprueba concatenación con array vacío
    @Test
    void testConcatenarStringArray2() {
        String[] arr = {};
        String resultado = ArraysMetodos.concatenarStringArray(arr);
        assertEquals("", resultado);
    }

    // --- obtenerSumaLongStringArray ---
    // Comprueba suma de caracteres con símbolos
    @Test
    void testObtenerSumaLongStringArray1() {
        String[] arr = {"@@@", "##", "!"};
        int totalCaracteres = ArraysMetodos.obtenerSumaLongStringArray(arr);
        assertEquals(6, totalCaracteres);
    }

    // Comprueba suma con array vacío
    @Test
    void testObtenerSumaLongStringArray2() {
        String[] arr = {};
        int totalCaracteres = ArraysMetodos.obtenerSumaLongStringArray(arr);
        assertEquals(0, totalCaracteres);
    }

    // --- obtenerLongString ---
    // Comprueba longitudes correctas
    @Test
    void testObtenerLongString1() {
        String[] arr = {"Hola", "adiós", "ok"};
        int[] longitudes = ArraysMetodos.obtenerLongString(arr);
        assertArrayEquals(new int[]{4, 5, 2}, longitudes);
    }

    // Comprueba array vacío
    @Test
    void testObtenerLongString2() {
        String[] arr = {};
        int[] longitudes = ArraysMetodos.obtenerLongString(arr);
        assertArrayEquals(new int[]{}, longitudes);
    }

    // --- obtenerArrString5Vocales ---
    // Comprueba que devuelve vacío si no hay coincidencias
    @Test
    void testObtenerArrString5Vocales1() {
        String[] arr = {"casa", "perro", "sol"};
        String[] resultado = ArraysMetodos.obtenerArrString5Vocales(arr);
        assertEquals(0, resultado.length);
    }

    // Comprueba que devuelve varias cadenas con todas las vocales
    @Test
    void testObtenerArrString5Vocales2() {
        String[] arr = {"murciélago", "aeiou", "xyz"};
        String[] resultado = ArraysMetodos.obtenerArrString5Vocales(arr);
        assertArrayEquals(new String[]{"murciélago", "aeiou"}, resultado);
    }
}
