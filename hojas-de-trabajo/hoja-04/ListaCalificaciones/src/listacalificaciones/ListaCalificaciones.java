
package listacalificaciones;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaCalificaciones {

   
    public static void main(String[] args) {
         ArrayList<Double> calificaciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        System.out.println("CALCULADORA DE PROMEDIO DE CALIFICACIONES");
        System.out.println("Ingrese las calificaciones (escribe 'listo' para terminar):");

        while (true) {
            System.out.print("Calificación: ");
            entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("listo")) {
                break;
            }

            try {
                double nota = Double.parseDouble(entrada);
                
                
                if (nota >= 0 && nota <= 100) {
                    calificaciones.add(nota);
                } else {
                    System.out.println("Ingrese una nota válida entre 0 y 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido o la palabra 'listo'.");
            }
        }

        System.out.println("RESULTADOS ");
        if (calificaciones.isEmpty()) {
            System.out.println("No se ingresaron calificaciones.");
        } else {
            double suma = 0;
            System.out.println("Calificaciones ingresadas:");
            for (int i = 0; i < calificaciones.size(); i++) {
                System.out.println("Nota " + (i + 1) + ": " + calificaciones.get(i));
                suma += calificaciones.get(i);
            }

            double promedio = suma / calificaciones.size();
            System.out.println("Número total de notas: " + calificaciones.size());
            System.out.printf("Promedio final: %.2f\n", promedio);
        }

        scanner.close();
       
    }
    
}
