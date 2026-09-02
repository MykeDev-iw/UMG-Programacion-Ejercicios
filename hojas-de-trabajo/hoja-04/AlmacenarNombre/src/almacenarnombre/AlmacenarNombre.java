
package almacenarnombre;
import java.util.Scanner;
import java.util.ArrayList;

public class AlmacenarNombre {

   
    public static void main(String[] args) {
         ArrayList<String> nombres = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
            String entrada = "";

        System.out.println("Ingresa nombres a la lista (escribe 'listo' para terminar):");

        while (true) {
            System.out.print("Nombre: ");
            entrada = scanner.nextLine();

            
            if (entrada.equalsIgnoreCase("listo")) {
                break;
            }

       
            nombres.add(entrada);
        }

      
        System.out.println("Lista de Nombres Registrados");
        if (nombres.isEmpty()) {
            System.out.println("No se ingresó ningún nombre.");
        } else {
            for (String nombre : nombres) {
                System.out.println("- " + nombre);
            }
        }

        scanner.close();
    }
    
}
