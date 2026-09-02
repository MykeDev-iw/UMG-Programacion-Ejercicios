
package entradahastafin;
import java.util.Scanner;

public class EntradaHastaFin {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String elemento = "";
        
        System.out.println("Ingrese elementos `fin´fin para cerrar sesion ");
        
        while (!elemento.equalsIgnoreCase("fin")){
            System.out.print("> ");
            elemento = scanner.nextLine();
        }
        
        System.out.println("Sesion finalizada con exito");
        scanner.close();
    }
     
}
