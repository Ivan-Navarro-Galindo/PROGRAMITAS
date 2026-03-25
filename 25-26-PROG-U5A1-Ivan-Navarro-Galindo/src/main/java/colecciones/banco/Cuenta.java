package colecciones.banco;

public class Cuenta {
    //Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    //Atributos auxiliares
    final int NEGATIVO = 0;
    final int SALDO_A_CERO =0;

    //Contructor original
    public Cuenta() {

    }
    //Constructor completo
    public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) {
        this.nombre = getNombre();
        this.cuenta = getCuenta();
        this.saldo = getSaldo();
        this.tipoDeInteres = getTipoDeInteres();
    }

    //Getter y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nuevoNombre) {
        if(nuevoNombre.isEmpty()){
            System.out.println("El nombre no puede estar vacio!");
        } else nombre = nuevoNombre;
    }

    public String getCuenta() {
        return cuenta;
    }
    public void setCuenta(String nuevaCuenta) {
        if (nuevaCuenta.length() < 4 )
            return;
        cuenta = nuevaCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double nuevoSaldo) {
        if(nuevoSaldo < 0) {
            System.out.println("No puedes poner un saldo negativo");
        } else nuevoSaldo = saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }
    public void setTipoDeInteres(double nuevoInteres) {
        if(tipoDeInteres < 0 ){
            System.out.println("El interes no puede ser");
        } else  tipoDeInteres = nuevoInteres;
    }

    //Otros metodos
    //Metodo para sumar cantidad de dinero
    public void ingreso(double ingresarCantidad) {
        if(ingresarCantidad < NEGATIVO)
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        saldo += ingresarCantidad;
    }

    //Metodo para retirar dinero
    public void reintegro(double retirarCantidad) {
        if(retirarCantidad == saldo){
            saldo = 0;
        } else if (retirarCantidad == SALDO_A_CERO) {
            throw new IllegalArgumentException("Error, no puedes retirar 0 €");
        } saldo -= retirarCantidad;
    }
}