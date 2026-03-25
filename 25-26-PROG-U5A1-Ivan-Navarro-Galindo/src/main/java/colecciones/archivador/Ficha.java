package colecciones.archivador;

public class Ficha {
       //atrivutos
        private String nombre;
        private String apellidos;
        private int edad;

        //Constructor
        public Ficha(String nombre, String apellidos, int edad) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }
        //GETTERS
        public String getNombre() {
            return nombre;
        }
        public String getApellidos() {
            return apellidos;}

        public int getEdad() {
            return edad;
        }

        //Otros metodos
        @Override
        public String toString() {
            // "Nombre: X Apellidos: Y Edad: Z"
            return "Nombre: " +nombre+ " Apellidos: " +apellidos+ " Edad: " +edad;
        }
    }

