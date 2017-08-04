package intranet.dao;

import java.util.List;

import intranet.entities.Usuario;

public interface IDAO<T,K>
{
	void CrearUsuario(T user);
	List<Usuario>ObtenerUsuarios();
	boolean Loguear(T user);
}
