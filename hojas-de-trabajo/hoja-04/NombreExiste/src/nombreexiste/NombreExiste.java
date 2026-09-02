
package nombreexiste;
import java.util.ArrayList;
import java.util.Scanner;

public class NombreExiste {

  
    public static void main(String[] args) {
       ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        nombres.add("José");
        nombres.add("Mario");
        nombres.add("Sarah");
        nombres.add("Miguel");

        System.out.println("Lista actual de nombres: " + nombres);

        System.out.print("\nIngrese el nombre que desea buscar: ");
        String nombreBuscado = scanner.nextLine().trim();

       
        if (nombres.contains(nombreBuscado)) {
            System.out.println("¡El nombre '" + nombreBuscado + "' SÍ existe en la lista!");
        } else {
            System.out.println("El nombre '" + nombreBuscado + "' NO se encuentra en la lista.");
        }

        scanner.close();
    }
    
}
