import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class TransaccionVenta {
    private String producto;
    private double monto;
    private String fecha;

    public TransaccionVenta(String producto, double monto, String fecha) {
        this.producto = producto;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Monto: " + monto + ", Fecha: " + fecha;
    }
}

public class AnalisisRegistros {
    public static void main(String[] args) {
        ArrayList<TransaccionVenta> transacciones = new ArrayList<>();
        transacciones.add(new TransaccionVenta("Producto A", 100, "2024-04-01"));
        transacciones.add(new TransaccionVenta("Producto B", 200, "2024-04-02"));
        transacciones.add(new TransaccionVenta("Producto C", 150, "2024-04-03"));

        Collections.sort(transacciones, Comparator.comparing(TransaccionVenta::getFecha));
        System.out.println("Transacciones ordenadas por fecha ascendente:");
        for (TransaccionVenta transaccion : transacciones) {
            System.out.println(transaccion);
        }

        Collections.sort(transacciones, Comparator.comparingDouble(TransaccionVenta::getMonto).reversed());
        System.out.println("\nTransacciones ordenadas por monto descendente:");
        for (TransaccionVenta transaccion : transacciones) {
            System.out.println(transaccion);
        }
    }
}
