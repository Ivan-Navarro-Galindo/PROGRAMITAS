package ejercicios.practica4;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Cart {
    //atributo
    private CartLine[] lines;
    private int numLines;

    //atributos auxiliares

    //Constructores
    public Cart(int capacity) {

        lines = new CartLine[capacity];
        this.numLines = 0;
    }
    //GETTERS
    public int getTotalItems() {
        int totalItems = 0; //Inicializamos el contador a 0
        //Comprobaciojn de chill
        if (lines == null) {
            return 0;
        }
        for (int i = 0; i < lines.length; i++) { //recorremos el array y lo sumamos al total
            totalItems += lines[i].getQuantity();
        }
        return totalItems; //devolvemos el total

    }

    public int getNumProducts(){
//        int totalProducts = 0;
//        for (int i = 0; i < lines.length; i++) {
//            if (numLines == 0) {
//                i++;
//            } else
       // }
        return numLines; //ens torna les linies ocupades per productes
    }
    public double getTotalPrice(){
        double totalPrice = 0;
        if (lines == null) {
            return 0;
        }
        for (int i = 0; i < lines.length; i++) {
            totalPrice += lines[i].getSubtotal();

        }
        return totalPrice;
    }

    //otros
    public void addProduct(Product p, int quantity) {
        // Busquem el producte amb findProductById
        int position = findProductById(p.getId());
        // - Si existeix (findProductById >=0), afegir lo que ja hi havia + la nova quantitat
        if (position >= 0) {
            int currentquant = lines[position].getQuantity();
            lines[position].setQuantity(currentquant +quantity);
        } else {
            // - Si no existeix (findProductById =-1), afegir el producte al llistat
        } if (numLines < lines.length) {
            //Creem un nou CartLine i la afegim
            lines[numLines] = new CartLine(p,quantity);
            numLines++; //incrementem el contador de linies ocupades
        } else {
            System.out.println("El carrito esta lleno");
        }


    }
    // recibe qué?
    // devuelve qué?
    // necesito un for?
    // necesito comparar?
    // necesito sumar?
    public void modifyQuantity(String productId, int newQuantity) {

        int position = findProductById(productId);

        //si la cantitat es 0 eliminem el producte
        if (newQuantity == 0) {
            removeProduct(productId);
        } else { //si existeix li modifiquem la cantitat
            lines[position].setQuantity(newQuantity);
        }

        if (position == -1 )
            System.out.println("No existe el producto");
        return;
    }
    public void incrementQuantity(String productId) {

        int position = findProductById(productId);

        if (position != -1){
            //obtenim la cuantitat actual del producte
            int currentquantity = lines[position].getQuantity();
            //utilitzem el setter per a sumarli 1 a la cantitat
            lines[position].setQuantity(currentquantity + 1);
        }

    }
    public void decrementQuantity(String productId) {

        int position = findProductById(productId);

        //eliminem la linea
        if (numLines == -1) {
            removeProduct(productId);
        }
        int currentquantity = lines[position].getQuantity();

        //baixem u a la cantitat del producte
        if (currentquantity >1 ) {
            lines[position].setQuantity(currentquantity -1);
        } else {
            //en este cas era la ultima unitat entonces eliminem el carrito
            removeProduct(productId);
        }


    }
    public void removeProduct(String productId) {

        int position = findProductById(productId);

        if (position == -1) {
            removeProduct(productId);
        }
        if (numLines == -1) {
            removeProduct(productId);
        }
    }

    public void clear() {
        //todo a null
        for (int i = 0; i < numLines; i++) {
            lines[i] = null;
        }
        //reiniciem contador
        numLines = 0;

    }

    public void printCar() {
        if (numLines == 0) {
            System.out.println("El carrito esta vacio");
        } else {
            //recorrem nomes les posicions ocupades en del arrray
            for (int i = 0; i < numLines; i++) {
                Product p = lines[i].getProduct();
                int quantity = lines[i].getQuantity();
                double subtotal = lines[i].getSubtotal();

            }
            System.out.println("----------------------");
            System.out.printf("Total a pagar: ", getTotalPrice() );
            System.out.println("Total de articulos: " +getTotalItems());
        }
        System.out.println("------------------------------");
    }

    //otros auxilares
    private int findProductById(String productId) {
        for (int i = 0; i < lines.length ; i++) { //recorremos el array
            //luego vamos desde lo mas alto hasta lo mas bajo
            if(lines[i].getProduct().getId().equals(productId)) {
                return i;
            }
        }
        return -1;
    }
}
