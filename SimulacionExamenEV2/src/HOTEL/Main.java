//package HOTEL;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//
//        GestorHotel gestor = new GestorHotel();
//
//        // 1. Añadir 3 huéspedes y 3 empleados
//        gestor.addHuesped(new Huesped("Ana", "García", 25, "ana@gmail.com"));
//        gestor.addHuesped(new Huesped(new Persona("Luis", "Pérez", 40, "luis@gmail.com"), "101", 90.0));
//        gestor.addHuesped(new Huesped(new Persona("Marta", "López", 33, "marta@gmail.com"), "202", 120.0));
//
//        gestor.addEmpleado(new Empleado("Carlos", "Ruiz", 35, "carlos@gmail.com"));
//        gestor.addEmpleado(new Empleado(new Persona("Sofía", "Díaz", 28, "sofia@gmail.com"), "Recepción", 1500.0));
//        gestor.addEmpleado(new Empleado(new Persona("Pedro", "Mora", 45, "pedro@gmail.com"), "Cocina", 1400.0));
//
//        // 2. Listar todos
//        System.out.println("=== LISTADO INICIAL ===");
//        listarTodos(gestor);
//
//        // 3. Eliminar un huésped (índice 0)
//        System.out.println("\n--- Eliminando huésped en índice 0 ---");
//        gestor.removeHuespedByIndex(0);
//
//        // 4. Modificar un empleado (índice 0)
//        System.out.println("--- Modificando empleado en índice 0 ---");
//        gestor.updateEmpleado(0, new Empleado(new Persona("Carlos", "Ruiz", 35, "carlos@gmail.com"), "Recepción", 1600.0));
//
//        // 5. Volver a listar todos
//        System.out.println("\n=== LISTADO ACTUALIZADO ===");
//        listarTodos(gestor);
//
//        // 6. Huéspedes con precio por noche > 80€
//        System.out.println("\n=== HUÉSPEDES CON PRECIO > 80€ ===");
//        for (Huesped h : gestor.getHuespedesPorPrecio(80)) {
//            System.out.println(h);
//        }
//
//        // 7. Empleados del departamento Recepción
//        System.out.println("\n=== EMPLEADOS DE RECEPCIÓN ===");
//        for (Empleado e : gestor.getEmpleadosPorDepartamento("Recepción")) {
//            System.out.println(e);
//        }
//
//        // 8. Limpiar el gestor
//        System.out.println("\n--- Limpiando gestor ---");
//        gestor.limpiar();
//        System.out.println("Huéspedes: " + gestor.getHuespedesList().size());
//        System.out.println("Empleados: " + gestor.getEmpleadosList().size());
//    }
//
//    // Método auxiliar para listar todos
//    public static void listarTodos(GestorHotel gestor) {
//        System.out.println("Huéspedes:");
//        for (Huesped h : gestor.getHuespedesList()) {
//            System.out.println("  " + h);
//        }
//        System.out.println("Empleados:");
//        for (Empleado e : gestor.getEmpleadosList()) {
//            System.out.println("  " + e);
//        }
//    }
//}