package poo.Javapop;

import java.util.*;

public class Cliente_profesional {
        Scanner myObj = new Scanner(System.in);
    
    private String Descripcion;
    private int Horario;
    private long Telefono;
    private String Web;

    public Cliente_profesional(String Descripcion, int Horario,long Telefono, String Web) {
        this.Descripcion = getDescripcion();
        this.Horario = getHorario();
        this.Telefono = getTelefono();
        this.Web = getWeb();
    }
    
    public String getWeb() {
            System.out.println("Introduce el nombre tu pagina Web: ");
            this.Web = myObj.nextLine();
        return Web;
    }
    public void setWeb(String Web) {
        this.Web = Web;
    }
    public boolean TelefonoCorrecto(long Telefono2) {
        String x = String.valueOf(Telefono2);
        if (x.length() < 9 || x.length() > 9){
            System.out.println("El numero de teléfono es incorreto, introduzca otro: ");
            return false;
        }else{
            return true;
        }
    }
    public long getTelefono() {
        boolean ComprobacionTlf = false;
            System.out.println("Introduce tu teléfono: ");
        while(ComprobacionTlf != true) {
        Telefono = myObj.nextLong();
        ComprobacionTlf = TelefonoCorrecto(Telefono);
        }
        return Telefono;
    }
    
    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }
    
    public int getHorario() {
        return Horario;
    }
    public void setHorario(int Horario) {
        this.Horario = Horario;
    }
    public String getDescripcion() {
            System.out.println("Escribe tu descripción: ");
            this.Descripcion = myObj.nextLine();
        return Descripcion;
    }
    public void setDescripcion(String Descpcion) {
        this.Descripcion = Descpcion;
    }
    
    public String toString() {
        return("Descripcion: " + Descripcion + "/nHorario: " + Horario + "/nTelefono: " + Telefono + "/nWeb: " + Web);
    }
}
