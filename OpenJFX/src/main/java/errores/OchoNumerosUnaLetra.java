package errores;

public class OchoNumerosUnaLetra extends Exception {
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Todos los digitos menos el ultimo tienen que ser un numero.";
	}
}
