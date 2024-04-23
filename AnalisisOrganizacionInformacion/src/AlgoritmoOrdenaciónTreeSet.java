import java.util.TreeSet;

public class AlgoritmoOrdenaciónTreeSet {
    public static void main(String[] args) {
        // Ejemplo de ordenación de nombres usando TreeSet
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
