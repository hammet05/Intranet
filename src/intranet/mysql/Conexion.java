package intranet.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion 
{
	private Connection conex;
	private String USERNAME="alejandros";
	private String PASSWORD="alejo123";
	private String HOST="localhost";
	private String PORT="3306";
	private String DATABASE="intranet";
	private Boolean USESSL=false; 
	private String CLASSNAME="com.mysql.jdbc.Driver";
	private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE+"?"+"useSSL="+USESSL ;
	
	
	public Conexion()
	{
		//Conexion cx=new Conexion("jdbc:mysql://localhost:3306/intranet?autoReconnect=true&useSSL=false "+ " alejandros "+" alejo");
		//                          jdbc:mysql://localhost:3306/intranet?useSSL=false,alejandros,alejo
		try
		{
			Class.forName(CLASSNAME);
			conex=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
		catch(ClassNotFoundException ex)
		{
			System.err.println("Error"+ ex.getMessage());
		} catch (SQLException e)
		{
			
			System.err.println("Error"+e.getMessage() + URL +","+ USERNAME +","+ PASSWORD);
		}	
	
	}
	public Connection GetConnection()
	{
		return conex;
	}
	
	
	public static void main(String[] args)
	{
		Conexion cx=new Conexion();
	}
	
	
}
