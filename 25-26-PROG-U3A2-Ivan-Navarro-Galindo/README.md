# U3 A2 - Arrays y Métodos

Escribe una clase de nombre ArraysMetodos con los métodos estáticos que se proponen a continuación. Incluir en el método `main()` de 
la clase las sentencias necesarias para comprobar el correcto funcionamiento de dichos métodos.

## Ejercicio 1: mostrarArrayPantalla
Escribe un método que reciba por parámetro un array de enteros y muestre sus valores por pantalla separados por comas, con el siguiente formato: `3, 7, -2, 0, 8`.

## Ejercicio 2: obtenerArrayComoString
Escribe un método que reciba un array de enteros por parámetro y devuelva una cadena de caracteres con su contenido. No debes utilizar `Arrays.toString()`.

**Ejemplo:**
````java
int[] arr = {3, 7, -2, 0, 8};
String resultado = obtenerArrayComoString(arr);
// resultado contiene: "[3, 7, -2, 0, 8]"
````

## Ejercicio 3: completarArray
Escribe un método que reciba un array de enteros por parámetro y lo rellene de forma que contenga tantos números pares, a partir del cero, como permita su capacidad.

**Ejemplo:**
````java
int[] arr = new int[6];
completarArray(arr);
// arr ahora contiene: [0, 2, 4, 6, 8, 10]
````

## Ejercicio 4: obtenerSumaArray
Escribe un método que reciba por parámetro un array de enteros y devuelva la suma de sus elementos.

**Ejemplo:**
````java
int[] arr = {5, 10, 15, 20};
int suma = obtenerSumaArray(arr);
// suma contiene: 50
````

## Ejercicio 5: arrayPotencias2
Escribe un método que cree un array y lo rellene con potencias de 2. Las potencias de 2 comenzarán en 2² y el número total de ellas se recibirá por parámetro. El método devolverá el array creado.

**Ejemplo:**
````java
int[] potencias = arrayPotencias2(5);
// potencias contiene: [4, 8, 16, 32, 64]
````

## Ejercicio 6: concatenarStringArray
Escribe un método que reciba como parámetro un array de String y devuelva el String resultante de concatenar todos las contenidos en el array.

**Ejemplo:**
````java
String[] arr = {"Hola", " ", "mundo", "!"};
String resultado = concatenarStringArray(arr);
// resultado contiene: "Hola mundo!"
````

## Ejercicio 7: obtenerSumaLongStringArray
Escribe un método que reciba por parámetro un array de String y devuelva el número total de caracteres de todos los String del array.

**Ejemplo:**
````java
String[] arr = {"Java", "Python", "C++"};
int totalCaracteres = obtenerSumaLongStringArray(arr);
// totalCaracteres contiene: 13
````

## Ejercicio 8: obtenerLongString
Escribe un método que reciba por parámetro un array de String y devuelva un array de enteros con los tamaños de los String contenidos en el array.

**Ejemplo:**
````java
String[] arr = {"Hola", "adiós", "ok"};
int[] longitudes = obtenerLongString(arr);
// longitudes contiene: [4, 5, 2]
```` 

## Ejercicio 9: obtenerArrString5Vocales
Escribe un método que reciba por parámetro un array de cadenas y devuelva un array con las que contengan las 5 vocales. Para la consideración de un carácter como vocal no se tendrá en cuenta si está en mayúsculas o minúsculas.

**Ejemplo:**
````java
String[] arr = {"educación", "murciélago", "casa", "euforia"};
String[] resultado = obtenerArrString5Vocales(arr);
// resultado contiene: ["educación", "murciélago", "euforia"]
```` 
