package errores;

public class MasTresDias extends Exception{
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "La fecha de entrega no puede ser anterior a tres dias despues de la fecha de creación";
	}
}
