package intranet.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import intranet.mysql.MySQLUsuarioDAO;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		try
		{
			MySQLUsuarioDAO usuarioDao=new MySQLUsuarioDAO();
			String user,password,rol;
			
			user=request.getParameter("user");
			password=request.getParameter("pass");
			rol=usuarioDao.Loguear(user, password);
			
			HttpSession session=request.getSession(true);
			session.setAttribute("Id_Rol",rol);
			response.sendRedirect("index.html");
			
			/*doGet(request, response);*/
		}
		catch(Exception ex)
		{
			try {
				throw ex;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
/*	protected void processRequest(HttpServletRequest request)*/
}
