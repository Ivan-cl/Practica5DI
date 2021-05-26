package Dao;

import java.util.List;

import Model.Pedido;

public interface IPedidoDao {

	List<Pedido> getAll();
	
	Pedido getById(int id);

	void guardar(Pedido pd);

	void actualizar(int id, Pedido pd);

	void eliminar(Pedido pd);
}
