package errores;

public class PedidoHoy extends Exception {
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Error: el pedido no tiene la fecha de hoy";
	}
}
