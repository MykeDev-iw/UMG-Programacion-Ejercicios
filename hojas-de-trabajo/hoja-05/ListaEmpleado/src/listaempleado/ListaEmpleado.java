
package listaempleado;
import java.util.ArrayList;


public class ListaEmpleado {


    public static void main(String[] args) {
            ArrayList<Empleado> empleados = new ArrayList<>();
            
                empleados.add(new Empleado("Miguel", "Guatemala", 7500));
                empleados.add(new Empleado("Cifuentes", "Escuintla", 10000));
                empleados.add(new Empleado("Adiel", "Siquinala", 13000));
                
                ArrayList<Empleado> filtrados = filtrarEmpleados(empleados, "Guatemala");
                for (Empleado empleado : filtrados){
                    System.out.println(empleado);
                }
    }
    
    public static ArrayList<Empleado> filtrarEmpleados(ArrayList<Empleado> empleados, String departamento){
        ArrayList<Empleado> resultado = new ArrayList<>();
        
        for(Empleado empleado : empleados){
            if (departamento.equalsIgnoreCase(empleado.getDepartamento()) && empleado.getSalario() > 5000){
            
                resultado.add(empleado);
            }
        }
        return resultado;
    }
}
