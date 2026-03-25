package ejercicios.practica4;

public class Product {
    //atributos
    private String id;
    private String name;
    private double price;

    //Constructor
    public Product (String id, String name, double price) {
        this.id = id;
        setName(name);
        setPrice(price);
    }
    //GETTERS
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //SETTERS
    public void setName(String newName) {
        name = newName;
    }
    public void setPrice(double newPrice)  {
        price = newPrice;
    }


}
