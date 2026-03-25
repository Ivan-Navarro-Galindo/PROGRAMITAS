# U5A1 - ArrayList

Tres ejercicios para practicar **colecciones (`ArrayList`)**, **POO**, **composición de clases** y **gestión de datos dinámicos**.  

---

## Ejercicio 1: colecciones.archivador.Archivador con fichas (gestión de pacientes)

Implementa un **archivador** donde se almacenarán **fichas de pacientes**.  
Cada ficha contiene: **nombre**, **apellidos** y **edad**.

El archivador debe permitir:

- Guardar una ficha  
- Eliminar una ficha  
- Listar todas las fichas registradas  

En el `main`, crea un archivador, añade varias fichas, lista el contenido, elimina una y vuelve a listar.

Interfaz sugerida:

### Clase `colecciones.archivador.Ficha`

```java
public class colecciones.archivador.Ficha {
    private String nombre;
    private String apellidos;
    private int edad;

    public colecciones.archivador.Ficha(String nombre, String apellidos, int edad) { ... }

    public String getNombre() { ... }
    public String getApellidos() { ... }
    public int getEdad() { ... }

    @Override
    public String toString() {
        // "Nombre: X Apellidos: Y Edad: Z"
        ...
    }
}
```

### Clase `colecciones.archivador.Archivador`

```java
import colecciones.archivador.Ficha;

import java.util.ArrayList;

public class colecciones.archivador.Archivador {
  private ArrayList<Ficha> pacientes = new ArrayList<>();

  public void guardar(Ficha f) { ...}

  public void eliminar(Ficha f) { ...}

  public int numeroFichas() { ...}

  public void listar() { ...}
}
```

### Clase `colecciones.archivador.ClinicaApp`

```java
import colecciones.archivador.Archivador;
import colecciones.archivador.Ficha;

public class ClinicaApp {
  public static void main(String[] args) {
    Archivador a = new Archivador();

    Ficha f1 = new Ficha("Nombre1", "Apellidos1", 22);
    Ficha f2 = new Ficha("Nombre2", "Apellidos2", 12);
    Ficha f3 = new Ficha("Nombre3", "Apellidos3", 34);

    a.guardar(f1);
    a.guardar(f2);
    a.guardar(f3);

    a.listar();
    a.eliminar(f1);
    a.listar();
  }
}
```

---

## Ejercicio 2: Gestión de cuentas bancarias

Crea un sistema para gestionar **cuentas bancarias**.  
Cada cuenta tendrá:

- Nombre del cliente  
- Número de cuenta  
- Saldo  
- Tipo de interés  

Requisitos:

- No permitir valores inválidos (interés negativo, nombre vacío, ingreso negativo, reintegro superior al saldo…)
- Usar un `ArrayList<colecciones.banco.Cuenta>` para almacenar todas las cuentas
- Incluir operaciones de:
  - Alta de cuentas  
  - Consulta (buscar por número o por nombre)  
  - Modificación  
  - Anulación (solo si saldo = 0)  
  - Listado  

Interfaz sugerida

### Clase `colecciones.banco.Cuenta`

```java
public class colecciones.banco.Cuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    public colecciones.banco.Cuenta() { }
    public colecciones.banco.Cuenta(String nombre, String cuenta, double saldo, double interes) { ... }

    public String getNombre() { ... }
    public void setNombre(String nombre) { ... }

    public String getCuenta() { ... }
    public void setCuenta(String cuenta) { ... }

    public double getSaldo() { ... }
    public void setSaldo(double saldo) { ... }

    public double getTipoDeInteres() { ... }
    public void setTipoDeInteres(double interes) { ... }

    public void ingreso(double cantidad) { ... }
    public void reintegro(double cantidad) { ... }
}
```

### Clase `Sucursal`

```java
import colecciones.banco.Cuenta;

import java.util.ArrayList;

public class Sucursal {

  private ArrayList<Cuenta> lista = new ArrayList<>();

  public boolean alta(Cuenta cta) { ...}

  public boolean anular(String numCuenta) { ...} // solo si saldo == 0

  public Cuenta buscarPorNumero(String numCuenta) { ...}

  public ArrayList<Cuenta> buscarPorNombre(String nombre) { ...}

  public boolean modificar(Cuenta ctaActualizada) { ...}

  public ArrayList<Cuenta> listar() {
    return new ArrayList<>(lista);
  }
}
```

### Clase `BancoApp`

```java
public class BancoApp {
    public static void main(String[] args) {
        Sucursal banco = new Sucursal();
        
        // Crear algunas cuentas de ejemplo
        // Simular altas, bajas, consultas, modificaciones...
    }
}
```

---

## Ejercicio 3: Pluviómetro

Desarrolla un pluviometro que registre la **precipitación mensual** a lo largo del año.  
Cada mes almacena una lista de valores (un `ArrayList<Double>`).

La clase debe permitir:

- Registrar una precipitación: `insertar(mes, cantidad)`
- Calcular media de un mes
- Calcular media anual
- Visualizar precipitaciones de un mes

Usa un **array** de 12 elementos:  
`ArrayList<Double>[] datosPorMes`

Interfaz sugerida

### Clase `Pluviometro`

```java
import java.util.ArrayList;

public class Pluviometro {

    private ArrayList<Double>[] datosPorMes;

    // Propuesta de constructor: inicializa el array y cada lista
    public Pluviometro() {
        datosPorMes = new ArrayList[12];
        for (int i = 0; i < 12; i++) {
            datosPorMes[i] = new ArrayList<>();
        }
    }

    public void insertar(int mes, double precipitacion) { ... }

    public double calcularMediaMensual(int mes) { ... }

    public double calcularMediaAnual() { ... }

    public ArrayList<Double> visualizar(int mes) { ... }
}
```

### Clase `CentroMeteorologico`

```java
public class CentroMeteorologico {
    public static void main(String[] args) {
        Pluviometro p = new Pluviometro();

        p.insertar(0, 2.8);
        p.insertar(0, 0.0);
        p.insertar(1, 12.3);
        p.insertar(6, 5.5);

        System.out.println("Media enero: " + p.calcularMediaMensual(0));
        System.out.println("Media febrero: " + p.calcularMediaMensual(1));
        System.out.println("Media anual: " + p.calcularMediaAnual());
        System.out.println("Julio: " + p.visualizar(6));

        // Simular más registros y consultas...
    }
}
```
