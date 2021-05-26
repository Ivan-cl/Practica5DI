package errores;

public class MismoCodigo extends Exception{
	private static final long serialVersionUID = 1L;

	
	public String getMessage() {
		return "Ya existe este codigo en la base de datos.";
	}
}
