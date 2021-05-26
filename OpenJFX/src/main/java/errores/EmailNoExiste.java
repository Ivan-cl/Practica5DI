package errores;

public class EmailNoExiste extends Exception {
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El email introducido no es correcto.";
	}
}
