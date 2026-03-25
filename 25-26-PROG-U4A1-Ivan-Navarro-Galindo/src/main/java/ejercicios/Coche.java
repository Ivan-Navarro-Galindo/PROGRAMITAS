package ejercicios;

import com.sun.jdi.request.StepRequest;

import java.io.StringReader;
import java.util.stream.Stream;

public class Coche {

    //atributos
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String matricula;
    private String tipoDeCoche; //MINI, UTILITARIO, FAMILIAR o DEPORTIVO
    private int añoFabricacion;
    private String seguro; // TERCEROS o TODO_RIESGO


    public Coche (String modelo, String color, boolean pinturaMetalizada, String matricula, String tipoDeCoche, int añoFabricacion, String seguro){
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.matricula = matricula;
        this.tipoDeCoche = tipoDeCoche;
        this.añoFabricacion = añoFabricacion;
        this.seguro = seguro;
    }
    public void imprimirCoche(){
        System.out.println("Modelo " +modelo);
        System.out.println("Color " +color);
    }
}
