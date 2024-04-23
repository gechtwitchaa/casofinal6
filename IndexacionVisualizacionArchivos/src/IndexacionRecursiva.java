import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class IndexacionRecursiva {
    public static Map<String, String> indexarArchivos(String directorio) {
        Map<String, String> indice = new HashMap<>();
        File carpeta = new File(directorio);

        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.out.println("El directorio no existe o no es válido.");
            return indice;
        }

        indexarRecursivo(carpeta, indice);
        return indice;
    }

    private static void indexarRecursivo(File carpeta, Map<String, String> indice) {
        File[] archivos = carpeta.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    indexarRecursivo(archivo, indice);
                } else {
                    indice.put(archivo.getName(), archivo.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {

        String directorio = "C:\\Users\\usuario\\Directorio";

        Map<String, String> indice = indexarArchivos(directorio);

        System.out.println("Índice de archivos:");
        for (Map.Entry<String, String> entrada : indice.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
