package intranet.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class MySQLUsuarioDAO extends Conexion
{

	/*@Override
	public void CrearUsuario(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> ObtenerUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	*/
	
	public String Loguear(String user,String pass) throws ClassNotFoundException {
		
		PreparedStatement pst=null;
		ResultSet rs=null;
		String rol=null;
		String sql="SELECT * FROM intranet.usuarios where Usuario=? and Contrasena=?";
		try {
		    pst=GetConnection().prepareStatement(sql);
			pst.setString(1, user);
			pst.setString(2, pass);
			
			rs=pst.executeQuery();
			if(rs.absolute(1))
			{
				rol=rs.getString(4);
		
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		System.err.println("error:" + e);
		
		}
		return rol;
	}
	
}
