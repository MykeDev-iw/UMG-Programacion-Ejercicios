
package listaempleado;


public class Empleado {
    String nombre;
    String departamento;
    double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return nombre + " | " + departamento + " | Q" + salario; 
    }
}
