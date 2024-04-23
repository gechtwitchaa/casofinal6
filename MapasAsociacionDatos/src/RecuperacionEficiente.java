import java.util.HashMap;
import java.util.Map;
class GestionEstudiantes {
    private Map<String, String> nombres;

    public GestionEstudiantes() {
        nombres = new HashMap<>();
        nombres.put("001", "Juan");
        nombres.put("002", "María");
        nombres.put("003", "Pedro");
    }

    public String obtenerNombre(String id) {
        return nombres.get(id);
    }
}
public class RecuperacionEficiente {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        
        String nombreJuan = gestion.obtenerNombre("001");
        System.out.println("Nombre del estudiante con ID 001: " + nombreJuan);
        
        String nombrePedro = gestion.obtenerNombre("003");
        System.out.println("Nombre del estudiante con ID 003: " + nombrePedro);
    }
}
