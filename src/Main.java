public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarMedicina("Aspirina", 10);
        inventario.agregarMedicina("Ibuprofeno", 5);
        inventario.agregarMedicina("Aspirina", 20); // Muestra un mensaje de error
    }
}
