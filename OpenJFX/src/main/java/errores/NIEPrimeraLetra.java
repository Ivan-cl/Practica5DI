package errores;

public class NIEPrimeraLetra extends Exception {
	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El primer digito debe ser una letra";
	}
}
