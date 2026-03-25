package colecciones.pluviometro;
import java.util.ArrayList;

public class Pluviometro {

    private ArrayList<Double>[] datosPorMes;
    private final int DIAS_MES = 30;
    private final int DIAS_ANIO = 365;

    // Propuesta de constructor: inicializa el array y cada lista
    public Pluviometro() {
        datosPorMes = new ArrayList[12];
        for (int i = 1; i <= 12; i++) {
            datosPorMes[i] = new ArrayList<>();
        }
    }

    //que recibe?
    //que nos devueve?
    //necesito un if?
    //necesito un bucle?
    public void insertar(int mes, double precipitacion) {

        if(datosPorMes == null){
            System.out.println("No hay datos almacenados");
        }
        if(mes > 12 && mes < 1){
            System.out.println("Error");
        } else {
            for (int i = 1; i < datosPorMes.length; i++) {
                datosPorMes[i].add(precipitacion);
            }
        }

        System.out.println("Datos introducidos correctamente");

    }

    public double calcularMediaMensual(int mes) {
        //Ajustem el index per si el primer mes no te res no salte el return directe
        ArrayList<Double> listaDelMes = datosPorMes[mes -1];
        double suma = 0;

        if(listaDelMes.isEmpty()){
           return 0.0;
        } else {
            for (Double valor : listaDelMes) {
                suma += valor;
            }
        }

        double media = suma / listaDelMes.size();

        return media;

    }

    public double calcularMediaAnual() {
        ArrayList<Double> listaAnual;



    }

    public ArrayList<Double> visualizar(int mes) {

        return mes;

    }
}