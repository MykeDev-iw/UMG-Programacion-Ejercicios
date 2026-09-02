
package Clases;


public class Clientes {
    int idCliente;
    String NombreCliente;
    String ApellidoCliente;
    String NitCliente;
    String TelefonoCliente;
    String CorreoCliente;
    String DireccionCliente;
    String EstadoCliente;

    public Clientes(int idCliente, String NombreCliente, String ApellidoCliente, String NitCliente, String TelefonoCliente, String CorreoCliente, String DireccionCliente, String EstadoCliente) {
        this.idCliente = idCliente;
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.NitCliente = NitCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.CorreoCliente = CorreoCliente;
        this.DireccionCliente = DireccionCliente;
        this.EstadoCliente = EstadoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getNitCliente() {
        return NitCliente;
    }

    public void setNitCliente(String NitCliente) {
        this.NitCliente = NitCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getCorreoCliente() {
        return CorreoCliente;
    }

    public void setCorreoCliente(String CorreoCliente) {
        this.CorreoCliente = CorreoCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    public String getEstadoCliente() {
        return EstadoCliente;
    }

    public void setEstadoCliente(String EstadoCliente) {
        this.EstadoCliente = EstadoCliente;
    }
    
    public boolean CrearCliente(){
    return true;
    }
}
