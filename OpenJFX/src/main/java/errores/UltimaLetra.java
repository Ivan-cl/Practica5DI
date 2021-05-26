package errores;

public class UltimaLetra extends Exception {
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El último digito debe ser una letra";
	}
}
