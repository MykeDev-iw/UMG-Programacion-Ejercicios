
package listaproducto;


public class producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
     public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d | Nombre: %s | Precio: %.2f | Stock: %d",
            id, nombre, precio, stock
        );
    }
}
