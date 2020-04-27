import java.util.*;

public class Clientes {
    private String DNI;
    private String Nombre;
    private String Correo;
    private String Clave;
    private int CodigoPostal;
    private String Ciudad;
    private int TarjetaCredito;
    
    public Clientes(String DNI, String Nombre, String Correo, String Clave, int CodigoPostal, String Ciudad, int TarjetaCredito) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Clave = Clave;
        this.CodigoPostal = CodigoPostal;
        this.Ciudad = Ciudad;
        this.TarjetaCredito = TarjetaCredito;
    }
    
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
        
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    public String getClave() {
        return Clave;
    }
    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    public int getCodigoPostal() {
        return CodigoPostal;
    }
    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    public int getTarjetaCredito() {
        return TarjetaCredito;
    }
    public void setTarjetaCredito(int TarjetaCredito) {
        this.TarjetaCredito = TarjetaCredito;
    }
    
    public String toString() {
        return("DNI: " + DNI + "/nNombre: " + Nombre + "/nCorreo: " + Correo + "/nCorreo: " + Correo + "/nContraseña: " + 
                Clave + "/nCodigo postal: " + CodigoPostal + "/nCiudad: " + Ciudad + "/nTarjeta de credito: " + TarjetaCredito);
    }
}
