package errores;

public class DNImayor extends Exception {
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "La cantidad de digitos debe ser 9";
	}
}
