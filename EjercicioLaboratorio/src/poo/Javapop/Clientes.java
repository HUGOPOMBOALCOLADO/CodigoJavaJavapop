package poo.Javapop;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clientes {
	Scanner myObj = new Scanner(System.in);

	
    private String DNI;
    private String Nombre;
    private String Correo;
    private String Clave;
    private long CodigoPostal;
    private String Ciudad;
    private long TarjetaCredito;
    
   public Clientes(String DNI, String Nombre, String Correo, String Clave, int CodigoPostal, String Ciudad, long TarjetaCredito) {
       
	    this.DNI = getDNI();
        this.Nombre = getNombre();
        this.Correo = getCorreo();
        this.Clave = getClave();
        this.CodigoPostal = getCodigoPostal();
        this.Ciudad = getCiudad();
        this.TarjetaCredito = getTarjetaCredito();
        
    }      
    public String getDNI() {
    	boolean Comprobaci�nDNI = false;
    	System.out.println("Introduce tu DNI: ");
    	while (Comprobaci�nDNI != true) {
    	this.DNI= myObj.nextLine();
    	Comprobaci�nDNI = validarNif(DNI);
    	}
        return DNI;
    }
    public static boolean validarNif(String nif){
        boolean correcto=false;
        Pattern pattern=Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher matcher=pattern.matcher(nif);
        if(matcher.matches()){
            String letra=matcher.group(2);
            String letras="TRWAGMYFPDXBNJZSQVHLCKE";
            int index=Integer.parseInt(matcher.group(1));
            index=index%23;
            String reference=letras.substring(index,index+1);
            if(reference.equalsIgnoreCase(letra)){
                correcto=true;
            }else{
                correcto=false;
                System.out.println("El DNI no es valido, introduzca otro: ");
            }
        }else{
            correcto=false;
            System.out.println("El DNI no es valido, introduzca otro: ");
        }
        return correcto;
    }
    public boolean esEmailCorrecto(String email) {
        
    	// Patr�n para validar el email
    			Pattern pattern = Pattern
    					.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"                                //Revisar esto para entenderlo//
    							+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    			// El email a validar
    			

    			Matcher mather = pattern.matcher(email);

    			if (mather.find() == true) {
    				return false;
    			} else {
    				System.out.println("El email ingresado es inv�lido, escriba uno valido: ");
    				return true;
    			}
    		}

    	


	public String getNombre() {
		System.out.println("Introduce tu nombre: ");
		this.Nombre = myObj.nextLine();
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getCorreo() {
    	boolean Comprobaci�nCorreo = true;
    	System.out.println("Introduce tu correo electr�nico: ");
    	while(Comprobaci�nCorreo != false) {
		this.Correo = myObj.nextLine();
		Comprobaci�nCorreo = esEmailCorrecto(Correo);
		}
        return Correo;
    }
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    public String getClave() {
    	System.out.println("Introduce tu clave, puede contener numeros y letras: ");
		this.Clave = myObj.nextLine();
        return Clave;
    }
    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    public long getCodigoPostal() {
    	boolean Comprobaci�nCP = false;
		System.out.println("Introduce tu c�digo postal: ");      
	while(Comprobaci�nCP != true) {
	CodigoPostal = myObj.nextLong();
	Comprobaci�nCP = CodigoPostalCorrecto(CodigoPostal);
	}
        return CodigoPostal;
    }
    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }
    public String getCiudad() {
    	System.out.println("Introduce tu ciudad: ");
    	Ciudad = myObj.next();
        return Ciudad;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    public boolean TarjetaCreditoCorrecta(long tarjetaCredito2) {
    	String x = String.valueOf(tarjetaCredito2);
    	if (x.length() < 16 || x.length() > 16){
    		System.out.println("La tarjeta de credito no es correcta, introduzca otra: ");
    		return false;
    	}else{
    		return true;
    	}
    }
    public long getTarjetaCredito() {
    	boolean Comprobaci�nTC = false;
    		System.out.println("Introduce tu numero de tarjeta de credito: ");      
    	while(Comprobaci�nTC != true) {
    	TarjetaCredito = myObj.nextLong();
    	Comprobaci�nTC = TarjetaCreditoCorrecta(TarjetaCredito);
    	}
    	return TarjetaCredito;
    	
    }
    public boolean CodigoPostalCorrecto(long CodigoPostal2) {
    	String x = String.valueOf(CodigoPostal2);
    	if (x.length() < 5 || x.length() > 5){
    		System.out.println("El codigo postal no es correcto, introduzca otro: ");
    		return false;
    	}else{
    		return true;
    	}
    }
    public void setTarjetaCredito(long TarjetaCredito) {
        this.TarjetaCredito = TarjetaCredito;
    }
    
    public String toString() {
        return("DNI: " + DNI + "\nNombre: " + Nombre + "\nCorreo: " + Correo  + "\nContrase�a: " + 
                Clave + "\nCodigo postal: " + CodigoPostal + "\nCiudad: " + Ciudad + "\nTarjeta de credito: " + TarjetaCredito);
    }
}