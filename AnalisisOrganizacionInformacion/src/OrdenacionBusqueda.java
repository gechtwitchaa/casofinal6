import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Venta {
    private String producto;
    private double monto;

    public Venta(String producto, double monto) {
        this.producto = producto;
        this.monto = monto;
    }

    public String getProducto() {
        return producto;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Monto: " + monto;
    }
}

public class OrdenacionBusqueda {
    public static void main(String[] args) {
        ArrayList<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta("Producto A", 100));
        ventas.add(new Venta("Producto B", 200));
        ventas.add(new Venta("Producto C", 150));

        Collections.sort(ventas, Comparator.comparingDouble(Venta::getMonto));
        System.out.println("Ventas ordenadas por monto ascendente:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }

        Collections.sort(ventas, Comparator.comparingDouble(Venta::getMonto).reversed());
        System.out.println("\nVentas ordenadas por monto descendente:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
}
