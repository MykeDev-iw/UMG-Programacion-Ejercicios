
package listaproducto;
import java.util.ArrayList;

public class ListaProducto {

  
    public static void main(String[] args) {
        ArrayList<producto> productos = new ArrayList<>();

        productos.add(new producto(1, "Teclado", 100.00, 5));
        productos.add(new producto(2, "Mouse", 50.00, 10));
        productos.add(new producto(3, "Monitor", 200.00, 8));

        aumentarPrecios(productos, 10);

        for (producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void aumentarPrecios(
            ArrayList<producto> productos, double porcentaje) {

        for (producto producto : productos) {
            if (producto.getStock() < 10) {
                double nuevoPrecio =
                        producto.getPrecio() * (1 + porcentaje / 100.0);

                producto.setPrecio(nuevoPrecio);
            }
        }
    }
}