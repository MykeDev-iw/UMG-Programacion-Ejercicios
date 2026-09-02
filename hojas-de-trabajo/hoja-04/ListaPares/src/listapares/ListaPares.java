
package listapares;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaPares {

    
    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        System.out.println("FILTRADOR DE NÚMEROS PARES");
        System.out.println("Ingrese números enteros (escriba 'listo' para terminar):");

        
        while (true) {
            System.out.print("Número: ");
            entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("listo")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido o 'liato'.");
            }
        }

        
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        
        System.out.println("RESULTADOS");
        System.out.println("Lista completa de números ingresados: " + numeros);

        if (pares.isEmpty()) {
            System.out.println("No se encontraron números pares en la lista.");
        } else {
            System.out.println("Números pares filtrados: " + pares);
        }

        scanner.close();
    }
    
}
