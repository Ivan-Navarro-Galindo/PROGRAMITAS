# U4 A1 - Iniciación a la POO

Escribe las siguientes clases en Java según los enunciados proporcionados.
Añade una clase `Main` para instanciar los objetos y probar su funcionamiento.

Nota: Observad los casos de test que se proporcionan para obtener detalles de los métodos a implementar.

---

## Ejercicio 1: `ejercicios.Coche`

**a)** Definir una clase que represente a un coche. En la definición se debe incluir:
- El modelo
- El color
- Si la pintura es metalizada o no
- La matrícula
- El tipo de coche: `MINI`, `UTILITARIO`, `FAMILIAR` o `DEPORTIVO`
- El año de fabricación
- La modalidad del seguro: a terceros o a todo riesgo

**b)** Añadir a la clase ejercicios.Coche un método `imprimeCoche()` que imprima el modelo y el color del coche.

## Ejercicio 2: `ejercicios.Asignatura`

- Una asignatura tiene un nombre, un código numérico y el curso en el cual se imparte
- Los valores iniciales han de proporcionarse en el constructor
- La clase ha de tener métodos para obtener los valores de los atributos
- El programa ha de construir un objeto con los siguientes valores: nombre "Matemáticas", código 1017, curso 1
- A continuación, el programa ha de imprimir los valores del objeto por pantalla

## Ejercicio 3: `ejercicios.Punto` (2D)

**a)** Definir una clase que represente un punto en un espacio bidimensional. La clase debe disponer de un constructor con las coordenadas del punto y métodos accesores a las coordenadas.

**b)** Escribe un programa que instancie cuatro puntos:
- El primero situado en el origen
- El segundo situado en (5, 3)
- El tercero en (2, -1)
- El cuarto situado en el punto medio entre el segundo y el tercero

**c)** Añade a la clase ejercicios.Punto un constructor sin parámetros que construya puntos en el origen de coordenadas.

**d)** Añade un método que calcule la distancia a otro punto.

**e)** Escribe un programa que cree un punto en (4, 3) y visualice la distancia del punto al origen de coordenadas.

**f)** Escribe la clase ejercicios.Punto con dos métodos sobrecargados llamados `distancia()`: uno que calcula la distancia a otro punto y otro que calcula la distancia al origen.

## Ejercicio 4: `ejercicios.Reloj` (hora, minuto, segundo)

**a)** La clase dispondrá de dos constructores:
- Uno sin parámetros que pone el reloj a 0:0:0
- Otro al que se le pasa la hora, los minutos y los segundos

**b)** Un método que devuelve la hora, los minutos y los segundos separados por ":" en una cadena.

**c)** Un método que devuelve la hora en formato 24 horas o 12 horas (con "am" o "pm").

**d)** Un método para poner el reloj en hora pasando la hora y los minutos (segundos a 0).

**e)** Un método para poner el reloj en hora pasando también los segundos.

**f)** Añada un método para poner la hora especificando si es AM o PM.

## Ejercicio 5: **Ampliación (opcional)** — **Movimiento Rectilíneo Uniforme (MRU)**

El móvil puede seguir una trayectoria en cualquier recta del plano. Se conoce la posición inicial del móvil, así como su velocidad lineal.

Escribe un programa que ejercite dichas clases, instanciando un móvil que:
- Se mueve a una velocidad de 2.4 m/s
- Parte de la posición (2.1, 5.2)
- Se mueve sobre la recta y = 2x + 1
- Se irá moviendo en incrementos de tiempo arbitrarios
- Determine las posiciones tras el paso de 3.5, 4 y 6.2 unidades de tiempo e imprima los resultados

**Nota:** El punto de partida del móvil ha de pertenecer a la recta que define el movimiento.

