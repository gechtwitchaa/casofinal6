import java.util.HashMap;
import java.util.Map;

public class GestionRelaciones {
    public static void main(String[] args) {

        Map<Integer, String> numerosLetras = new HashMap<>();
        numerosLetras.put(1, "A");
        numerosLetras.put(2, "B");
        numerosLetras.put(3, "C");

        int numero = 2;
        String letra = numerosLetras.get(numero);
        System.out.println("Letra asociada al número " + numero + ": " + letra);

        Map<Integer, String> numerosTexto = new HashMap<>();
        numerosTexto.put(1, "uno");
        numerosTexto.put(2, "dos");
        numerosTexto.put(3, "tres");

        int numero2 = 3;
        String texto = numerosTexto.get(numero2);
        System.out.println("Representación textual del número " + numero2 + ": " + texto);
    }
}
