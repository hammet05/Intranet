package intranet.entities;

public class Usuario
{
	private int Identificacion;
	private String Usuario;
	private String Contraseña;
	private int Rol;
	
	public Usuario(int identificacion, String usuario, String contraseña, int rol) 
	{
	
		this.Identificacion = identificacion;
		this.Usuario = usuario;
		this.Contraseña = contraseña;
		this.Rol = rol;
	}

	public int getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(int identificacion) {
		Identificacion = identificacion;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public int getRol() {
		return Rol;
	}

	public void setRol(int rol) {
		Rol = rol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Contraseña == null) ? 0 : Contraseña.hashCode());
		result = prime * result + Identificacion;
		result = prime * result + Rol;
		result = prime * result + ((Usuario == null) ? 0 : Usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Contraseña == null) {
			if (other.Contraseña != null)
				return false;
		} else if (!Contraseña.equals(other.Contraseña))
			return false;
		if (Identificacion != other.Identificacion)
			return false;
		if (Rol != other.Rol)
			return false;
		if (Usuario == null) {
			if (other.Usuario != null)
				return false;
		} else if (!Usuario.equals(other.Usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [Identificacion=" + Identificacion + ", Usuario=" + Usuario + ", Contraseña=" + Contraseña
				+ ", Rol=" + Rol + "]";
	}
	
	
}
