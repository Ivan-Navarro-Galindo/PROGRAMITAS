package colecciones.banco;

public class BancoApp {
    public static void main(String[] args) {
        Sucursal banco = new Sucursal();

        Cuenta c1 = new Cuenta("Ivan", "1234567",2.000,2);
        Cuenta c2 = new Cuenta("Pepe","123123",1.000,3);
        Cuenta c3 = new Cuenta("Pedro","PSOE-IBAN",800.000,0);

       banco.alta(c1);
       banco.alta(c2);
       banco.alta(c3);


        System.out.println(banco.listar());


    }
}
