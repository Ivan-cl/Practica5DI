package Dao;

import java.util.List;

import Model.Cliente;

public interface IClienteDao {

	List<Cliente> getAll();

	void guardar(Cliente cl);

	void actualizar(int id, Cliente cl);

	void eliminar(Cliente cl);

}
