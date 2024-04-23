import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacionListadoArchivos {
     public static List<String> listarArchivos(String directorio) {
        List<String> archivos = new ArrayList<>();
        File carpeta = new File(directorio);

        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.out.println("El directorio no existe o no es válido.");
            return archivos;
        }

        listarRecursivo(carpeta, archivos);
        Collections.sort(archivos);
        return archivos;
    }

    private static void listarRecursivo(File carpeta, List<String> archivos) {
        File[] archivosCarpeta = carpeta.listFiles();

        if (archivosCarpeta != null) {
            for (File archivo : archivosCarpeta) {
                if (archivo.isDirectory()) {
                    listarRecursivo(archivo, archivos);
                } else {
                    archivos.add(archivo.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {

        String directorio = "C:\\Users\\usuario\\Directorio";

        List<String> archivosListados = listarArchivos(directorio);

        System.out.println("Archivos ordenados alfabéticamente:");
        for (String archivo : archivosListados) {
            System.out.println(archivo);
        }
    }
}
