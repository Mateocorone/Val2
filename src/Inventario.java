import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Integer> medicinas;

    public Inventario() {
        medicinas = new HashMap<String, Integer>();
    }

    public void agregarMedicina(String nombre, int cantidad) {
        if (medicinas.containsKey(nombre)) {
            System.out.println("Error: la medicina ya existe en el inventario.");
        } else {
            medicinas.put(nombre, cantidad);
        }
    }

}
