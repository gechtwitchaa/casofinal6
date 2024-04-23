import java.util.TreeSet;

public class OrdenacionBusqueda {
    public static void main(String[] args) {
        TreeSet<String> nombres = new TreeSet<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");

        System.out.println("Nombres ordenados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
